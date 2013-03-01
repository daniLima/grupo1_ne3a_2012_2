/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.gui.Horario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Daniele
 */
public class Conexao {
    
    private Connection con=null;
    private String driver;
    private String usuario;
    private String senha;
    private String endereco;
    
    
    public Conexao(){
        driver = " com.mysql.jdbc.Driver";
        usuario = " root";
        senha = "douglas";
        endereco = " jdbc:mysql://localhost:3306/sistemanatacao";
        
    }
    
    public Connection getConnection(){        
        try{
            
            Class.forName(this.driver);
            con = DriverManager.getConnection(endereco,usuario,senha);
        }catch (ClassNotFoundException erro){
            System.out.println("Falha ao carrgar o Driver JDBC/ODBC." +erro);
            return null;
            
        }catch (SQLException erro){
            System.out.println("Falha na conexão,comando SQL = " +erro);
            return null;
            
        }catch (Exception erro){
            erro.getMessage();
            System.out.println("Não foi possivel a conexão!!");
            return null;
        }
        return con;
    }
    
}
