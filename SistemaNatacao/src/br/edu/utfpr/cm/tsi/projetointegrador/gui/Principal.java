/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Principal.java
 *
 * 
 */
package br.edu.utfpr.cm.tsi.projetointegrador.gui;

import br.edu.utfpr.cm.tsi.projetointegrador.gui.Produto.JDialogCadastroProduto;
import br.edu.utfpr.cm.tsi.projetointegrador.gui.Produto.JDialogProdutoMenu;
import br.edu.utfpr.cm.tsi.projetointegrador.gui.Cliente.JDialogCadastroCliente;
import br.edu.utfpr.cm.tsi.projetointegrador.gui.Cliente.JDialogClienteMenu;
import br.edu.utfpr.cm.tsi.projetointegrador.gui.Funcionario.JDialogCadastroFuncionario;
import br.edu.utfpr.cm.tsi.projetointegrador.gui.Funcionario.JDialogFuncionarioMenu;
import br.edu.utfpr.cm.tsi.projetointegrador.gui.Horario.JDialogCadastrodeHorario;





/**
 *
 * @author Douglas Santiago
 */
public class Principal extends javax.swing.JFrame {

    /** Creates new form Principal */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel7 = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        CadastroBut = new javax.swing.JMenu();
        ClienteCadBot = new javax.swing.JRadioButtonMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ProdutoCadBut = new javax.swing.JRadioButtonMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        FuncionarioCadBut = new javax.swing.JRadioButtonMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        HorarioCadBut = new javax.swing.JRadioButtonMenuItem();
        ConsultaBut = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        ProdutoConsBut = new javax.swing.JRadioButtonMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        FuncionarioConsBut = new javax.swing.JRadioButtonMenuItem();
        HorarioBut = new javax.swing.JMenu();
        NataçãoHorBut = new javax.swing.JRadioButtonMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        HidroHorBut1 = new javax.swing.JRadioButtonMenuItem();
        RelatorioBut = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        Ajudabut = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Natação");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        jButton1.setToolTipText("Cadastrar Cliente");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/produto.png"))); // NOI18N
        jButton2.setToolTipText("Cadastrar Produto");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/funcionario.png"))); // NOI18N
        jButton3.setToolTipText("Cadastrar Funcionario");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/duvida.png"))); // NOI18N
        jButton4.setToolTipText("Contato");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jToolBar1.add(jButton4);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/NADANDO.jpg"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("Cadastrar Horario:   Ctrl+H");

        jLabel2.setText("Cadastrar Cliente:   Ctrl+C");

        jLabel4.setText("Cadastrar Produto:  Ctrl+P");

        jLabel5.setText("Cadastrar Funcionario:  Ctrl+F");

        jLabel3.setText("Teclas de Atalho:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar2.setForeground(new java.awt.Color(102, 255, 51));
        jToolBar2.setRollover(true);

        jLabel7.setText("Status:");
        jToolBar2.add(jLabel7);

        jLabelStatus.setText("Esperando");
        jToolBar2.add(jLabelStatus);

        jMenuBar1.setForeground(new java.awt.Color(51, 0, 255));
        jMenuBar1.setAlignmentX(1.2F);

        CadastroBut.setText("Cadastro");
        CadastroBut.setToolTipText("Cadastro");
        CadastroBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CadastroButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CadastroButMouseExited(evt);
            }
        });

        ClienteCadBot.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        ClienteCadBot.setSelected(true);
        ClienteCadBot.setText("Cliente");
        ClienteCadBot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        ClienteCadBot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClienteCadBotMouseClicked(evt);
            }
        });
        ClienteCadBot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteCadBotActionPerformed(evt);
            }
        });
        CadastroBut.add(ClienteCadBot);
        CadastroBut.add(jSeparator1);

        ProdutoCadBut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        ProdutoCadBut.setSelected(true);
        ProdutoCadBut.setText("Produto");
        ProdutoCadBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/produto.png"))); // NOI18N
        ProdutoCadBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutoCadButActionPerformed(evt);
            }
        });
        CadastroBut.add(ProdutoCadBut);
        CadastroBut.add(jSeparator5);

        FuncionarioCadBut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        FuncionarioCadBut.setSelected(true);
        FuncionarioCadBut.setText("Funcionario");
        FuncionarioCadBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/funcionario.png"))); // NOI18N
        FuncionarioCadBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncionarioCadButActionPerformed(evt);
            }
        });
        CadastroBut.add(FuncionarioCadBut);
        CadastroBut.add(jSeparator4);

        HorarioCadBut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        HorarioCadBut.setSelected(true);
        HorarioCadBut.setText("Horario");
        HorarioCadBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gnome_fish.jpg"))); // NOI18N
        HorarioCadBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorarioCadButActionPerformed(evt);
            }
        });
        CadastroBut.add(HorarioCadBut);

        jMenuBar1.add(CadastroBut);

        ConsultaBut.setText("Consulta");
        ConsultaBut.setToolTipText("Consulta");
        ConsultaBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConsultaButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConsultaButMouseExited(evt);
            }
        });

        jRadioButtonMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Cliente");
        jRadioButtonMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        ConsultaBut.add(jRadioButtonMenuItem1);
        ConsultaBut.add(jSeparator2);

        ProdutoConsBut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        ProdutoConsBut.setSelected(true);
        ProdutoConsBut.setText("Produto");
        ProdutoConsBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/produto.png"))); // NOI18N
        ProdutoConsBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutoConsButActionPerformed(evt);
            }
        });
        ConsultaBut.add(ProdutoConsBut);
        ConsultaBut.add(jSeparator3);

        FuncionarioConsBut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        FuncionarioConsBut.setSelected(true);
        FuncionarioConsBut.setText("Funcionario");
        FuncionarioConsBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/funcionario.png"))); // NOI18N
        FuncionarioConsBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncionarioConsButActionPerformed(evt);
            }
        });
        ConsultaBut.add(FuncionarioConsBut);

        jMenuBar1.add(ConsultaBut);

        HorarioBut.setText("Horarios");
        HorarioBut.setToolTipText("Horarios");
        HorarioBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HorarioButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HorarioButMouseExited(evt);
            }
        });

        NataçãoHorBut.setSelected(true);
        NataçãoHorBut.setText("Natação");
        NataçãoHorBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/natação.png"))); // NOI18N
        HorarioBut.add(NataçãoHorBut);
        HorarioBut.add(jSeparator6);

        HidroHorBut1.setSelected(true);
        HidroHorBut1.setText("Hidroginastica");
        HidroHorBut1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hidro.png"))); // NOI18N
        HorarioBut.add(HidroHorBut1);

        jMenuBar1.add(HorarioBut);

        RelatorioBut.setText("Relatorios");
        RelatorioBut.setToolTipText("Relatorios");
        RelatorioBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RelatorioButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RelatorioButMouseExited(evt);
            }
        });

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        jMenuItem3.setText("Cliente");
        RelatorioBut.add(jMenuItem3);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/produto.png"))); // NOI18N
        jMenuItem5.setText("Produtos");
        RelatorioBut.add(jMenuItem5);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/funcionario.png"))); // NOI18N
        jMenuItem4.setText("Funcionario");
        RelatorioBut.add(jMenuItem4);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gnome_fish.jpg"))); // NOI18N
        jMenuItem6.setText("Horarios");
        RelatorioBut.add(jMenuItem6);

        jMenuBar1.add(RelatorioBut);

        Ajudabut.setText("Ajuda");
        Ajudabut.setToolTipText("Ajuda");
        Ajudabut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AjudabutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AjudabutMouseExited(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/suporte.png"))); // NOI18N
        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Ajudabut.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/duvida.png"))); // NOI18N
        jMenuItem2.setText("Suporte");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Ajudabut.add(jMenuItem2);

        jMenuBar1.add(Ajudabut);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-743)/2, (screenSize.height-555)/2, 743, 555);
    }// </editor-fold>//GEN-END:initComponents

private void ClienteCadBotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClienteCadBotMouseClicked
}//GEN-LAST:event_ClienteCadBotMouseClicked

private void ClienteCadBotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteCadBotActionPerformed

    new JDialogCadastroCliente().setVisible(true);
}//GEN-LAST:event_ClienteCadBotActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    new JDialogContato().setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    new JDialogAjuda().setVisible(true);
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void FuncionarioCadButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuncionarioCadButActionPerformed
    new JDialogCadastroFuncionario().setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_FuncionarioCadButActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    new JDialogCadastroCliente().setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    new JDialogCadastroFuncionario().setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

private void ProdutoCadButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutoCadButActionPerformed
    new JDialogCadastroProduto().setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_ProdutoCadButActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    new JDialogCadastroProduto().setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
    new JDialogClienteMenu().setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

private void ProdutoConsButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutoConsButActionPerformed
    new JDialogProdutoMenu().setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_ProdutoConsButActionPerformed

private void FuncionarioConsButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuncionarioConsButActionPerformed
    new JDialogFuncionarioMenu().setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_FuncionarioConsButActionPerformed

private void HorarioCadButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorarioCadButActionPerformed
//    new JDialogCadastrodeHorario.setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_HorarioCadButActionPerformed

private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
    jLabelStatus.setText((jButton1.getToolTipText()));
    // TODO add your handling code here:
}//GEN-LAST:event_jButton1MouseEntered

private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
    jLabelStatus.setText(" Esperando");
    // TODO add your handling code here:
}//GEN-LAST:event_jButton1MouseExited

private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
    jLabelStatus.setText(" Esperando");
    // TODO add your handling code here:
}//GEN-LAST:event_jButton2MouseExited

private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
    jLabelStatus.setText(" Esperando");
    // TODO add your handling code here:
}//GEN-LAST:event_jButton3MouseExited

private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
    jLabelStatus.setText(" Esperando");
    // TODO add your handling code here:
}//GEN-LAST:event_jButton4MouseExited

private void CadastroButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastroButMouseExited
    jLabelStatus.setText(" Esperando");
    // TODO add your handling code here:
}//GEN-LAST:event_CadastroButMouseExited

private void ConsultaButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultaButMouseExited
    jLabelStatus.setText(" Esperando");
    // TODO add your handling code here:
}//GEN-LAST:event_ConsultaButMouseExited

private void HorarioButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HorarioButMouseExited
    jLabelStatus.setText(" Esperando");
    // TODO add your handling code here:
}//GEN-LAST:event_HorarioButMouseExited

private void RelatorioButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RelatorioButMouseExited
    jLabelStatus.setText(" Esperando");
    // TODO add your handling code here:
}//GEN-LAST:event_RelatorioButMouseExited

private void AjudabutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudabutMouseExited
    jLabelStatus.setText(" Esperando");
    // TODO add your handling code here:
}//GEN-LAST:event_AjudabutMouseExited

private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
     jLabelStatus.setText((jButton2.getToolTipText()));
    // TODO add your handling code here:
}//GEN-LAST:event_jButton2MouseEntered

private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
     jLabelStatus.setText((jButton3.getToolTipText()));
    // TODO add your handling code here:
}//GEN-LAST:event_jButton3MouseEntered

private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
     jLabelStatus.setText((jButton4.getToolTipText()));
    // TODO add your handling code here:
}//GEN-LAST:event_jButton4MouseEntered

private void CadastroButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastroButMouseEntered
     jLabelStatus.setText(CadastroBut.getToolTipText());
    // TODO add your handling code here:
}//GEN-LAST:event_CadastroButMouseEntered

private void ConsultaButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultaButMouseEntered
    jLabelStatus.setText((ConsultaBut.getToolTipText()));
    // TODO add your handling code here:
}//GEN-LAST:event_ConsultaButMouseEntered

private void HorarioButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HorarioButMouseEntered
    jLabelStatus.setText((HorarioBut.getToolTipText()));
    // TODO add your handling code here:
}//GEN-LAST:event_HorarioButMouseEntered

private void RelatorioButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RelatorioButMouseEntered
    jLabelStatus.setText((RelatorioBut.getToolTipText()));
    // TODO add your handling code here:
}//GEN-LAST:event_RelatorioButMouseEntered

private void AjudabutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudabutMouseEntered
    jLabelStatus.setText((Ajudabut.getToolTipText()));
    // TODO add your handling code here:
}//GEN-LAST:event_AjudabutMouseEntered

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ajudabut;
    private javax.swing.JMenu CadastroBut;
    private javax.swing.JRadioButtonMenuItem ClienteCadBot;
    private javax.swing.JMenu ConsultaBut;
    private javax.swing.JRadioButtonMenuItem FuncionarioCadBut;
    private javax.swing.JRadioButtonMenuItem FuncionarioConsBut;
    private javax.swing.JRadioButtonMenuItem HidroHorBut1;
    private javax.swing.JMenu HorarioBut;
    private javax.swing.JRadioButtonMenuItem HorarioCadBut;
    private javax.swing.JRadioButtonMenuItem NataçãoHorBut;
    private javax.swing.JRadioButtonMenuItem ProdutoCadBut;
    private javax.swing.JRadioButtonMenuItem ProdutoConsBut;
    private javax.swing.JMenu RelatorioBut;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}
