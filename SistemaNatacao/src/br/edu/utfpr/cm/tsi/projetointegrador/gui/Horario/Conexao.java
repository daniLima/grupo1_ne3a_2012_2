/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.gui.Horario;

import com.mysql.jdbc.Connection;

/**
 *
 * @author Daniele
 */
public class Conexao {
    
    private Connection con=null;
    private String driver;
    private String usuario;
    private String senha;
    private String endereço;
    
    
    public Conexao(){
        driver = " com.mysql.jdbc.Driver";
        usuario = " root";
        senha = "douglas";
        endereço = " jdbc:mysql://localhost:3306/sistemanatacao";
        
    }
    
    
}
