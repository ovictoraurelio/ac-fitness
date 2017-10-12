/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifal.acfitness.bo;

import br.edu.ifal.acfitness.dao.TrainerDAO;
import br.edu.ifal.acfitness.vo.Trainer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author victor
 */
public class TrainerBO {
    
    private TrainerDAO trainerDAO;
    
    public TrainerBO(){
        this.trainerDAO = new TrainerDAO();
    }
 
    public ArrayList<Trainer> consultar(Trainer trainer){
        try {
            return trainerDAO.consultar(trainer);
        } catch (SQLException ex) {
            Logger.getLogger(TrainerBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String inserir(Trainer trainer){       
        try {
            return trainerDAO.inserir(trainer);
        } catch (SQLException ex) {
            Logger.getLogger(TrainerBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String alterar(Trainer trainer){
        try {
            return trainerDAO.alterar(trainer);
        } catch (SQLException ex) {
            Logger.getLogger(TrainerBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
