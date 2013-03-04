/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.gui.Produto;

import br.edu.utfpr.cm.tsi.projetointegrador.coneccao.ConnectionManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Douglas Santiago
 */
public class Sql {

    static Connection con = new ConnectionManager().Conexao();

    public static boolean addProduto(String codigo, String nome, String descricao,
            String quantidade, String observacao) throws Exception {



        try {

            String sql = "INSERT INTO produto(codigo, nome, descricao, quantidade, observacao) Values (?, ?, ?, ?, ?)";

            con.setAutoCommit(false);
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, codigo);
            pst.setString(2, nome);
            pst.setString(3, descricao);
            pst.setString(4, quantidade);
            pst.setString(5, observacao);
            pst.execute();

            con.commit();

        } catch (SQLException ex) {
            Logger.getLogger(JDialogCadastroProduto.class.getName()).log(Level.SEVERE, null, ex);

        }
        return true;

    }

    public static boolean ExcluiProduto(String codigo) throws Exception {



        try {
            String sql = "DELETE FROM produto where codigo = ?";
//            
            con.setAutoCommit(false);
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, codigo);
            pst.execute();
            con.commit();

        } catch (SQLException ex) {
            Logger.getLogger(JDialogCadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return true;

    }
}
