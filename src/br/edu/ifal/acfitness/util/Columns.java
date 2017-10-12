/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifal.acfitness.util;

/**
 *
 * @author victor
 */
public class Columns {
    
    private String columns[];

    public Columns(String ...columns) {
        this.columns = columns;
    }

    public String getColumns() {
        String r = "";
        for(String c : columns){
            r += "," + c;
        }        
        return r.replaceFirst(",", "");
    }
    
    public String getColumnsWithParameter() {
        String r = "";
        for(String c : columns){
            r += "," + c + " = ?";
        }        
        return r.replaceFirst(",", "");
    }    

    public void setColumns(String[] columns) {
        this.columns = columns;
    }
    
    
    
}
