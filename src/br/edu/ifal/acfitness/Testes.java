/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifal.acfitness;

import br.edu.ifal.acfitness.bo.TrainerBO;
import br.edu.ifal.acfitness.vo.Trainer;
import java.util.Date;

/**
 *
 * @author victor
 */
public class Testes {
    
    public static void main(String args[]){
        TrainerBO trainerBO = new TrainerBO();
        trainerBO.inserir(new Trainer("Victor", "121211", new Date(), 'M'));
    }
    
}
