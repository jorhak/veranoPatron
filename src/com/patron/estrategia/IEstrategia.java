/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.patron.estrategia;

import java.sql.Connection;
import java.util.Map;

/**
 *
 * @author jorhak
 */
public interface IEstrategia {

    public void connect();

    public Connection getConnection();

    public void closeConnection();

    public void setDato(Map<String, String> dato);
}
