/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JDialogVisualizarCliente.java
 *
 * Created on 24/02/2013, 21:11:25
 */
package br.edu.utfpr.cm.tsi.projetointegrador.gui.Cliente;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import br.edu.utfpr.cm.tsi.projetointegrador.gui.Cliente.EntidadeCliente;

/**
 *
 * @author Daniele
 */
public class JDialogVisualizarCliente extends javax.swing.JDialog {
   // Conexao conexao= new Conexao();    
         
    
       JDialogCadastroCliente cd = new JDialogCadastroCliente();
    /** Creates new form JDialogVisualizarCliente */
       
       
       
  //  public JDialogVisualizarCliente(java.awt.Frame parent, boolean modal) {
    //    super(parent, modal);
      //  initComponents();
   // }

   public JDialogVisualizarCliente(){
       setLocation(250,100);
       this.setLocationRelativeTo(null);
       initComponents();
   }
       
       
 //  private JDialogVisualizarCliente( ) {
   //     throw new UnsupportedOperationException("Not yet implemented");
   // }
     public void cliente(EntidadeCliente cliente){
     jTextMatricula.setText(cliente.getMatricula());
     jTextFieldNome.setText(cliente.getNome());
     jTextFieldEndereço.setText(cliente.getEndereco());
     jFormattedTextFieldTelefone.setText(cliente.getTelefone());
}
   
  //  }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VisualizaCliente = new javax.swing.JLabel();
        jTextFieldEndereço = new javax.swing.JTextField();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1Nome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jLabelMatricula = new javax.swing.JLabel();
        jTextMatricula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VisualizaCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        VisualizaCliente.setForeground(new java.awt.Color(51, 0, 204));
        VisualizaCliente.setText("Visualizar Cliente:");
        getContentPane().add(VisualizaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, -1));

        jTextFieldEndereço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEndereçoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEndereço, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, -1));

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        jLabel1Nome.setText("Nome:");
        getContentPane().add(jLabel1Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, -1));

        jLabelEndereco.setText("Endereço:");
        getContentPane().add(jLabelEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabelTelefone.setText("Telefone");
        getContentPane().add(jLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 110, -1));

        jLabelMatricula.setText("Matricula");
        getContentPane().add(jLabelMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        getContentPane().add(jTextMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
// TODO add your handling code here:
    int n= JOptionPane.showConfirmDialog(rootPane,"Deseja editar o Cadastro do cliente?");
       if(n ==0){
           dispose();
          // new JDialogConsultaCliente().setVisible(true);
       }
}//GEN-LAST:event_jButtonEditarActionPerformed

private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
// TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir Cliente "+jTextFieldNome.getText());
    if(n==0){
            try {
                Sql.excluirCliente(jTextMatricula.getText());//ExcluirCliente();
            } catch (Exception ex) {
                Logger.getLogger(JDialogVisualizarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(rootPane, "Cliente " + jTextFieldNome.getText() + "Foi excluido com sucesso!");
            dispose();
    }
    
    
}//GEN-LAST:event_jButtonExcluirActionPerformed

private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
// TODO add your handling code here:
    dispose();
}//GEN-LAST:event_jButtonCancelarActionPerformed

private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextFieldNomeActionPerformed

private void jTextFieldEndereçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEndereçoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextFieldEndereçoActionPerformed

private void jFormattedTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTelefoneActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jFormattedTextFieldTelefoneActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDialogVisualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogVisualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogVisualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogVisualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                JDialogVisualizarCliente dialog = new JDialogVisualizarCliente();
                
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VisualizaCliente;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1Nome;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JTextField jTextFieldEndereço;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextMatricula;
    // End of variables declaration//GEN-END:variables




 //private void ExcluirCliente() throws Exception{
    
   //     java.sql.Connection con = conexao.getConnection();
   
// try {
  //          String sql = "DELETE FROM cliente where codigo = ?";
           
    //        con.setAutoCommit(false);
      //      java.sql.PreparedStatement pst = con.prepareStatement(sql);
        //    pst.setString(1, jLabelCodigo.getText());  
          //  pst.execute();
            //con.commit();
            
        //} catch (SQLException ex) {
          //  Logger.getLogger(JDialogCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
            
       // }
        
    //}
}



