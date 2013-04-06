/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.gui.Horario;

import br.edu.utfpr.cm.tsi.projetointegrador.coneccao.ConnectionManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniele
 */
public class Sql {

  //  static void addHorario(Horario horario) {
        //throw new UnsupportedOperationException("Not yet implemented");
      Connection con = new ConnectionManager().Conexao();
      
         public static boolean addHorario(Horario horario) throws Exception {        
         String sql="INSERT INTO horario(nome,horario,telefone) Values(?,?,?)"  ;

        try {         

            con.setAutoCommit(false);
            java.sql.PreparedStatement pst = con.prepareStatement(sql); 
            
            

            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(JDialogCadastrodeHorarios.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

   
    }

        
    












    


