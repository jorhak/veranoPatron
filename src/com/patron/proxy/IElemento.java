/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.patron.proxy;

import com.patron.estrategia.IEstrategia;
import java.sql.Connection;
import java.util.Map;

/**
 *
 * @author jorhak
 */
public interface IElemento {

    public Connection getConnection(Map<String, String> dato, IEstrategia estrategia);
}
