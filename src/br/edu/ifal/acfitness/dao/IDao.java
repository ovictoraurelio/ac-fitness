/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifal.acfitness.dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author victor
 */
public interface IDao <T, Type extends Serializable> {
    public List<T> consultar(T entity) throws SQLException;
    public String alterar(T entity) throws SQLException;
    public String inserir(T entity) throws SQLException;
    public String remover(T entity) throws SQLException;        
}
