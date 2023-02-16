/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.proxy;

import com.patron.estrategia.IEstrategia;
import java.sql.Connection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jorhak
 */
public class ElementoProxy implements IElemento {

    List<Map<String, String>> credenciales = new LinkedList<>();
    private final IElemento elemento = new ElementoReal();

    public ElementoProxy() {
    }

    private void setCredenciales() {
        Map<String, String> dato = new HashMap<>();
        dato.put("host", "192.168.0.24");
        dato.put("database", "Contactos");
        dato.put("user", "root");
        dato.put("password", "perpetuaeternidad");
        dato.put("port", "3322");

        credenciales.add(dato);

        Map<String, String> dato1 = new HashMap<>();
        dato1.put("host", "192.168.0.24");
        dato1.put("database", "arquitecturaMVC");
        dato1.put("user", "root");
        dato1.put("password", "perpetuaeternidad");
        dato1.put("port", "3322");
        credenciales.add(dato1);

        Map<String, String> dato2 = new HashMap<>();
        dato2.put("host", "192.168.0.24");
        dato2.put("database", "mvc");
        dato2.put("user", "root");
        dato2.put("password", "perpetuaeternidad");
        dato2.put("port", "3322");
        credenciales.add(dato2);
        
        Map<String, String> dato3 = new HashMap<>();
        dato3.put("host", "192.168.0.24");
        dato3.put("database", "contactos");
        dato3.put("user", "postgres");
        dato3.put("password", "perpetuaeternidad");
        dato3.put("port", "5454");
        credenciales.add(dato3);
    }

    @Override
    public Connection getConnection(Map<String, String> dato, IEstrategia estrategia) {
        setCredenciales();
        for (int i = 0; i <= credenciales.size(); i++) {
            Map<String, String> cred = credenciales.get(i);
            String host = cred.getOrDefault("host", "");
            String database = cred.getOrDefault("database", "");
            String user = cred.getOrDefault("user", "");
            String password = cred.getOrDefault("password", "");
            String port = cred.getOrDefault("port", "");

            if (host.equals(dato.getOrDefault("host", "")) && database.equals(dato.getOrDefault("database", "")) && user.equals(dato.getOrDefault("user", "")) && password.equals(dato.getOrDefault("password", "")) && port.equals(dato.getOrDefault("port", ""))) {
                return elemento.getConnection(cred, estrategia);
            }
        }
        return null;
    }

}
