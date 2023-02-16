/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.plantilla;

/**
 *
 * @author jorhak
 */
public class Restaurar extends ARespaldo{

    @Override
    public Object comando(String dbServer, String dbPort, String dbUser, String dbPass, String dbName, String sqlFile) {
        String command[] = new String[]{"mysql", dbName, "-u" + dbUser, "-p" + dbPass,
            "-h" + dbServer, "-P" + dbPort, "-e", " source " + sqlFile};
        return command;
    }

    @Override
    public void messageOK() {
        System.out.println("Restauración exitosa");
    }

    @Override
    public void messageERROR() {
        System.out.println("Error al restaurar");
    }

}
