/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifal.acfitness.util;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

 
public class Conexao {

    public static String status = "Disconectado";

    public Conexao() {
    }

    public static java.sql.Connection getConexao() {

        Connection connection = null;          //atributo do tipo Connection
        try{        
            String driverName = "com.mysql.jdbc.Driver";                        
            Class.forName(driverName);
            String serverName = "localhost";    //caminho do servidor do BD
            String mydatabase = "acfitness";        //nome do seu banco de dados
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "root";        //nome de um usuário de seu BD      
            String password = "123456";      //sua senha de acesso
            connection = DriverManager.getConnection(url, username, password);

            //Testa sua conexão//  
            if (connection != null) {
                status = ("Conectado!");
            } else {
                status = ("Disconectado");
            }
            return connection;

        }catch(ClassNotFoundException e) {  //Driver não encontrado
            e.printStackTrace();
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;
        }catch(SQLException e) {//Não conseguindo se conectar ao banco
            e.printStackTrace();
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;
        }

    }

    public static String statusConection() {
        return status;
    }

    public static boolean FecharConexao() {
        try {
            Conexao.getConexao().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

  

}
