/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.gui.Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Daniele
 */
public class Conexao {
    
     /**  Variavel de conexao */
    private Connection con = null;
    /**  Variavel do Driver */
    private String driver;
    /**  Variavel que guarda o valor do usuario */
    private String usuario;
    /**  Variavel que guarda o valor da senha */
    private String senha;
    /**  Variavel que guarda o valor da string de conexao */
    private String endereco;
    
    
     public Conexao() {
        driver = "com.mysql.jdbc.Driver";
        usuario = "root";
        senha = "douglas";
        endereco = "jdbc:mysql://localhost:3306/sistemanatacao";
    }

    
    public Connection getConnection() {
        try {
            Class.forName(this.driver);
            con = DriverManager.getConnection(endereco, usuario, senha);
        } catch (ClassNotFoundException erro) {
            System.out.println("Falha ao carregar o driver JDBC/ODBC." + erro);
            return null;
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            return null;
        } catch (Exception erro) {
            erro.getMessage();
            System.out.println("Nao foi possivel efetuar a conexao!");
            return null;
        }
        return con;
    }
}

   
    
    

