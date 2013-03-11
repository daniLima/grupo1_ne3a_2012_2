/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.gui.Cliente;

import br.edu.utfpr.cm.tsi.projetointegrador.coneccao.ConnectionManager;
import br.edu.utfpr.cm.tsi.projetointegrador.gui.Horario.JDialogCadastrodeHorario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniele
 */
public class Sql {

    static Connection con = new ConnectionManager().Conexao();

    public static boolean addCliente(String matricula, String nome, String CPF, String endereco,
            String bairro, String telefone, String cidade, String email) throws Exception {



        try {


            String sql = "INSERT INTO cliente(matricula,nome,cpf,endereço,bairro,telefone,cidade,email) Values (?, ?, ?, ?, ?, ?, ?, ?";

            con.setAutoCommit(false);
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, matricula);
            pst.setString(2, nome);
            pst.setString(3, CPF);
            pst.setString(4, endereco);
            pst.setString(5, bairro);
            pst.setString(6, telefone);
            pst.setString(7, cidade);
            pst.setString(8, email);

            con.commit();

        } catch (Exception ex) {
            Logger.getLogger(JDialogCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public static boolean excluirCliente(String matricula) throws Exception {
        try {

            String sql = "DELETE FROM cliente where matricula = ?";



            con.setAutoCommit(false);
            java.sql.PreparedStatement pst = con.prepareStatement(sql);


            pst.setString(1, matricula);
            pst.execute();
            con.commit();

        } catch (SQLException ex) {
            Logger.getLogger(JDialogCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public static boolean buscarCliente(String matricula) {


        Connection con = new ConnectionManager().Conexao();

        try {

            String sql = "SELECT * FROM cliente where matricula = ? ";
            con.setAutoCommit(false);
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, matricula);
            pst.execute();
            con.commit();

        } catch (SQLException ex) {
            Logger.getLogger(JDialogCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;


    }

    public static boolean addHorario(String matricula, String nome, String horario) throws Exception {

        try {
            String sql = "INSERT INTO horario ( matricula, nome,horario)Values (?, ?,?)";

            con.setAutoCommit(false);
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, matricula);
            pst.setString(2, nome);
            pst.setString(3, horario);

            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(JDialogCadastrodeHorario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public static void main(String[] args) {
        buscarCliente(" ");
    }
}