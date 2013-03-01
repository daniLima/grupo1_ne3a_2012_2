/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.gui.Horario;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

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
            con =DriverManager.getConnection(endereco,usuario,senha);
            
            
            
            
        }
    }
    
}
