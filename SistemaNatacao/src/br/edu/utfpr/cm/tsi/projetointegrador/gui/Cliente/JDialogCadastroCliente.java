/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JDialogCadastroCliente.java
 *
 * Created on 23/02/2013, 20:18:04
 */
package br.edu.utfpr.cm.tsi.projetointegrador.gui.Cliente;

/**
 *
 * @author Daniele
 */
public class JDialogCadastroCliente extends javax.swing.JDialog {
    
    private Conexao conexao=new Conexao();
    
    public JDialogCadastroCliente() {
         initComponents ();
         setLocationRelativeTo(null);
         
    }

    
    
    
    
    
    
    
  //  /** Creates new form JDialogCadastroCliente */
  
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cadastro_cliente = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        rNome = new javax.swing.JTextField();
        Endereco = new javax.swing.JLabel();
        rEndereco = new javax.swing.JTextField();
        Bairro = new javax.swing.JLabel();
        rBairro = new javax.swing.JTextField();
        Cidade = new javax.swing.JLabel();
        rCidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rTelefone = new javax.swing.JTextField();
        CPF = new javax.swing.JLabel();
        rCPF = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        rEmail = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cadastro_cliente.setFont(new java.awt.Font("Tahoma", 1, 18));
        Cadastro_cliente.setText("Cadastro Cliente:");
        getContentPane().add(Cadastro_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        Nome.setText("Nome:");
        getContentPane().add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 44, -1, -1));
        getContentPane().add(rNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 64, 243, -1));

        Endereco.setText("Endereço:");
        getContentPane().add(Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        getContentPane().add(rEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 243, -1));

        Bairro.setText("Bairro:");
        getContentPane().add(Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        getContentPane().add(rBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 58, -1));

        Cidade.setText("Cidade:");
        getContentPane().add(Cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        rCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(rCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 85, -1));

        jLabel1.setText("Telefone:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        getContentPane().add(rTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 70, -1));

        CPF.setText("CPF:");
        getContentPane().add(CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        rCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rCPFActionPerformed(evt);
            }
        });
        getContentPane().add(rCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, -1));

        email.setText("Email:");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        rEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rEmailActionPerformed(evt);
            }
        });
        getContentPane().add(rEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void rCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rCidadeActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_rCidadeActionPerformed

private void rCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rCPFActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_rCPFActionPerformed

private void rEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rEmailActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_rEmailActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bairro;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Cadastro_cliente;
    private javax.swing.JLabel Cidade;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField rBairro;
    private javax.swing.JTextField rCPF;
    private javax.swing.JTextField rCidade;
    private javax.swing.JTextField rEmail;
    private javax.swing.JTextField rEndereco;
    private javax.swing.JTextField rNome;
    private javax.swing.JTextField rTelefone;
    // End of variables declaration//GEN-END:variables
}
