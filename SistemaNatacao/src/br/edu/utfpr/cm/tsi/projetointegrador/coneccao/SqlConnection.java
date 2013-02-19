/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.coneccao;



import com.mysql.jdbc.jdbc2.optional.MysqlXAConnection;
import java.awt.JobAttributes;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Douglas Santiago
 */
public class SqlConnection{
    public static  Connection connection;
    public static void main(String[] args) throws SQLException {
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aluno", "root", "douglas");



        for (int i = 0; i < 9; i++) {
            connection.createStatement().execute("");
        }


        connection.setAutoCommit(false);

        connection.commit();
	
    }
   
    

   
//    Statement stm = conn.createStatement();
//    ResultSet rs = stm.executeQuery("SELECT coluna1, coluna2, coluna3 FROM tabela");
    
    public void gravaBanco(){
    
    
    
    }
    
    public void deletar(int matricula) throws SQLException{       
       connection.createStatement().execute("DELETE FROM PROFILES WHERE PROFILE_ID="+matricula+";");
       JOptionPane.showMessageDialog(null, "Excluido");
    }
    
}
