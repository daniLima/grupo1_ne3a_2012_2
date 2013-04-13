/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.gui.Horario;

import br.edu.utfpr.cm.tsi.projetointegrador.coneccao.ConnectionManager;
import br.edu.utfpr.cm.tsi.projetointegrador.gui.Cliente.JDialogCadastroCliente;
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
    static  Connection con = new ConnectionManager().Conexao();
      
         public static boolean addHorario(EntidadeHorario horario){        
         String sql="INSERT INTO horario(nome,horario,telefone) Values(?,?,?)";

        try {         

            con.setAutoCommit(false);
            java.sql.PreparedStatement pst = con.prepareStatement(sql); 
            pst.setString(1, horario.getNome());   
            pst.setString(2, horario.getTelefone());
            pst.setString(3,horario.getHorario());
            pst.execute();
            
            con.commit();
            
        } catch (SQLException ex) {
            Logger.getLogger(JDialogCadastrodeHorarios.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }
         
        public static boolean excluirHorario(String nome) throws Exception {
        try {

            String sql = "DELETE FROM horario where nome = ?";



            con.setAutoCommit(false);
            java.sql.PreparedStatement pst = con.prepareStatement(sql);


            pst.setString(1,nome);
            pst.execute();
            con.commit();

        } catch (SQLException ex) {
            Logger.getLogger(JDialogCadastrodeHorarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public static boolean buscarHorario(String nome) {


        Connection con = new ConnectionManager().Conexao();

        try {

            String sql = "SELECT * FROM horario where nome = ? ";
            con.setAutoCommit(false);
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.execute();
            con.commit();

        } catch (SQLException ex) {
            Logger.getLogger(JDialogCadastrodeHorarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;


    }

   
    public static void main(String[] args) {
//        buscarCliente(" ");
    }
}
    

        
    












    


