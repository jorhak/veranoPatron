/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.plantilla;

/**
 *
 * @author jorhak
 */
public class Copiar extends ARespaldo {

    @Override
    public String comando(String dbServer, String dbPort, String dbUser, String dbPass, String dbName, String sqlFile) {
        String command = "mysqldump --host " + dbServer + " --port " + dbPort
                + " -u " + dbUser
                + " -p" + dbPass + " " + dbName + " -r " + sqlFile;
        return command;
    }

    @Override
    public void messageOK() {
        System.out.println("Respaldo exitoso");
    }

    @Override
    public void messageERROR() {
        System.out.println("Error al respaldar");
    }
}
