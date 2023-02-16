/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.estrategia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

/**
 *
 * @author jorhak
 */
public class EstrategiaMySQL implements IEstrategia{
    private String host;
    private String database;
    private String user;
    private String password;
    private int port;

    private Connection con;

    private static EstrategiaMySQL instance;

    private EstrategiaMySQL() {
        connect();
    }

    public static EstrategiaMySQL getInstance() {
        if (instance == null) {
            instance = new EstrategiaMySQL();
        }
        return instance;
    }

    @Override
    public void setDato(Map<String,String> dato){
        host = dato.getOrDefault("host", "");
        database = dato.getOrDefault("database", "");
        user = dato.getOrDefault("user", "");
        password = dato.getOrDefault("password", "");
        port = Integer.parseInt(dato.getOrDefault("port", ""));
    }
    
    @Override
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://" + host + ":" + port + "/" + database;
            con = DriverManager.getConnection(url, user, password);
            con.setAutoCommit(true);
            System.out.println("conexion realizada con exito a MySQL");
        } catch (Exception e) {
            con = null;
            System.out.println("conexion fallida");
        }
    }

    @Override
    public Connection getConnection() {
        if (con == null) {
            connect();
        }
        return con;
    }

    @Override
    public void closeConnection() {
        try {
            con.close();
        } catch (SQLException ex) {
        }
        con = null;
    }
}
