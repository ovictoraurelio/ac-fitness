/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifal.acfitness.vo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author victor
 */
public class Trainer {
    
    private Integer sequencial;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private char sexo;
    private ArrayList<DadoClinico> historicoClinico;
    private ArrayList<Atividade> historicoAtividades;
    private ArrayList<Refeicao> historicoRefeicoes;

    public Trainer() {
        this.historicoClinico = new ArrayList<>();
        this.historicoAtividades = new ArrayList<>();
        this.historicoAtividades = new ArrayList<>();
    }
    
    
    public Trainer(String nome, String cpf, Date dataNascimento, char sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public Trainer(Integer sequencial, String nome, String cpf, Date dataNascimento, char sexo, ArrayList<DadoClinico> historicoClinico, ArrayList<Atividade> historicoAtividades, ArrayList<Refeicao> historicoRefeicoes) {
        this.sequencial = sequencial;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.historicoClinico = historicoClinico;
        this.historicoAtividades = historicoAtividades;
        this.historicoRefeicoes = historicoRefeicoes;
    }
    

    public Integer getSequencial() {
        return sequencial;
    }

    public void setSequencial(Integer sequencial) {
        this.sequencial = sequencial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public String toString(){
        return this.nome + "," + this.cpf + "," + this.dataNascimento + "," + this.sexo;
    }
    
    
}
