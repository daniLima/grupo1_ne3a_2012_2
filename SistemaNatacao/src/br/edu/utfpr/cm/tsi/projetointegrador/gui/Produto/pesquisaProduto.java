/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.gui.Produto;

import br.edu.utfpr.cm.tsi.projetointegrador.coneccao.ConnectionManager;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Douglas Santiago
 */
public class pesquisaProduto {

    public static void pesquisa(String id) {
        
        EntidadeProduto p;
        try {
            Connection con = new ConnectionManager().Conexao();


            String sql = "SELECT * FROM produto WHERE produto.codigo like '" + id + "';";

            PreparedStatement pst = con.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                p = new EntidadeProduto();
               
                
                p.setCodigo(rs.getString("codigo"));
                p.setDescricao(rs.getString("descricao"));
                p.setNome(rs.getString("nome"));
                p.setQuantidade(rs.getString("quantidade"));
                p.setObservacoes(rs.getString("observacao"));
                
                con.close();


            }

        } catch (SQLException ex) {
//            Logger.getLogger(DAOPessoaFisica.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
}