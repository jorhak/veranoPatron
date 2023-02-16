/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.plantilla;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author jorhak
 */
public abstract class ARespaldo {
    public void metodoPlantilla(){
        try {
            /*- Datos de acceso a nuestra base de datos
            Usa localhost si el servidor corre en la misma maquina, de lo 
            0 contrario utiliza la IP o dirección del sevidor*/
            String dbServer = "192.168.0.17";
            /* El usuario de tu base de datos*/
            String dbName = "Contactos";
            /* El usuario de tu base de datos*/
            String dbUser = "root";
            /* La contraseña de la base de datos (dejarla en texto plano puede 
            ser un problema)*/
            String dbPass = "perpetuaeternidad";
            String dbPort = "3322";

            /*El nombre o ruta a donde se guardara el archivo de volcado .sql*/
            String sqlFile = "/home/jorhak/backups/respaldo1.sql";

            /* La linea de comando completa que ejecutara el programa*/
            Object command = comando(dbServer,dbPort,dbUser,dbPass,dbName,sqlFile);
            Process bck;
            if (command.toString().contains("mysqldump")){
                /*Se crea un proceso que ejecuta el comando dado*/
                bck = Runtime.getRuntime().exec((String)command);
            }else{
                bck = Runtime.getRuntime().exec((String[])command);
            }
            

            /* Obtiene el flujo de datos del proceso, esto se hace para obtener 
            el texto del proceso*/
            InputStream stdout = bck.getErrorStream();

            /* Se obtiene el resultado de finalizacion del proceso*/
            int resultado = bck.waitFor();

            String line;

            /* Se crea un buffer de lectura con el flujo de datos outstd y ese mismo
            sera leido e impreso, esto mostrara el texto que muestre el programa
            mysqldump, de esta forma sabra cual es el error en su comando*/
            BufferedReader brCleanUp = new BufferedReader(new InputStreamReader(stdout));
            while ((line = brCleanUp.readLine()) != null) {
                System.out.println(line);
            }

            brCleanUp.close();
            if (resultado == 0) {
                messageOK();
            } else {

                messageERROR();
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    
    abstract public Object comando(String dbServer,String dbPort,String dbUser,String dbPass,String dbName, String sqlFile);
    
    abstract public void messageOK();
    
    abstract public void messageERROR();
}
