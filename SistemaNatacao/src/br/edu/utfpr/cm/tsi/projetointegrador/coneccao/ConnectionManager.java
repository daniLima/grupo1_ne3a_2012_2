/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.coneccao;

/**
 *
 * @author Douglas Santiago
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
 
public class ConnectionManager {
 
  public static void main(String[] argv) {
 
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}
 
	try {
		Connection connection = DriverManager
		.getConnection("jdbc:mysql://localhost:3306/douglas","root", "douglas");
 
	} catch (SQLException e) {
		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
		return;
	}
  }
}
