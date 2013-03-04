/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.coneccao;

/**
 *
 * @author Douglas Santiago
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionManager {
 
    public ConnectionManager() {
    }

    public Connection Conexao() {

        try {



            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemanatacao", "root", "douglas");
            return com;



        } catch (SQLException ex) {

            System.err.println("Deu merda!");
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }



    }

    public Connection Conexao(String endereco, String usuario, String senha) {

        try {



            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection com = DriverManager.getConnection(endereco, usuario, senha);
            return com;



        } catch (SQLException ex) {


            System.err.println("Deu merda!");
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }


    }
}
