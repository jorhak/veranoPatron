/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.contexto;

import com.patron.plantilla.ARespaldo;

/**
 *
 * @author jorhak
 */
public class Backup {
    public ARespaldo respaldo;
    
    public Backup(){}
    
    public void setRespaldar(ARespaldo respaldo){
        this.respaldo = respaldo;
    }
    
    public void ejecutar(){
        this.respaldo.metodoPlantilla();
    }
}
