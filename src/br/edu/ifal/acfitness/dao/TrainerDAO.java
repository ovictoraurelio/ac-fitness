/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifal.acfitness.dao;

import br.edu.ifal.acfitness.util.Columns;
import br.edu.ifal.acfitness.util.Conexao;
import br.edu.ifal.acfitness.vo.Trainer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public class TrainerDAO implements IDao<Trainer, Long> {

    private Connection conexaoBD;
    private static final String TABLE_NAME = "trainer";
    private static final Columns TABLE_COLUMNS = new Columns("nome", "cpf", "data", "sexo");
        
    @Override
    public ArrayList<Trainer> consultar(Trainer entity) throws SQLException {
        this.conexaoBD = Conexao.getConexao();
        PreparedStatement stmt = conexaoBD.prepareStatement("SELECT * FROM " + TABLE_NAME + " WHERE 1");
        ResultSet result;
        
        stmt.setString(1, entity.getCpf());
        
        result = stmt.executeQuery();
        while(result.next()){
            entity.setNome(result.getString("nome"));
        }
        
        
        conexaoBD.commit();
        conexaoBD.close();
        
        return null;
    }

    @Override
    public String alterar(Trainer entity) throws SQLException {
        this.conexaoBD = Conexao.getConexao();
        PreparedStatement stmt = conexaoBD.prepareStatement("UPDATE " + TABLE_NAME + " SET " + TABLE_COLUMNS.getColumnsWithParameter() + " WHERE SEQUENCIAL = " + entity.getSequencial());
        
        //Passar os parametros
        stmt.setString(1, entity.getCpf());
        
        
        stmt.execute();
        conexaoBD.commit();
        conexaoBD.close();
        
        return null;
    }

    @Override
    public String inserir(Trainer entity) throws SQLException {                
        this.conexaoBD = Conexao.getConexao();
        PreparedStatement stmt = conexaoBD.prepareStatement("INSERT INTO " + TABLE_NAME + " ("+TABLE_COLUMNS.getColumns()+")" + " VALUES ( " + entity.toString() + ")");
        
        //Passar os parametros
        stmt.setString(1, entity.getCpf());
        
        stmt.execute();
        conexaoBD.commit();
        conexaoBD.close();
        
        return null;
    }

    @Override
    public String remover(Trainer entity) throws SQLException {
        this.conexaoBD = Conexao.getConexao();
        PreparedStatement stmt = conexaoBD.prepareStatement("DELETE FROM " + TABLE_NAME + " WHERE SEQUENCIAL = ?");
        
        //Passar os parametros
        stmt.setInt(1, entity.getSequencial());
        
        stmt.execute();
        conexaoBD.commit();
        conexaoBD.close();
        
        return null;
    }   
}
