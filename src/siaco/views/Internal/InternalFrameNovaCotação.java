/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siaco.views.Internal;

import siaco.views.BOASVINDAS;

/**
 *
 * @author Tiago
 */
public class InternalFrameNovaCotação extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalFrameBemvindo
     */
    public InternalFrameNovaCotação() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BFinalizar = new javax.swing.JButton();
        bAbrirCotação = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bcarregarLista = new javax.swing.JButton();
        NomedoCliente = new javax.swing.JTextField();
        DadosdoProcesso = new javax.swing.JLabel();
        NomedoCliente1 = new javax.swing.JTextField();
        DadosdoProcesso2 = new javax.swing.JLabel();
        NomedoCliente2 = new javax.swing.JTextField();
        DadosdoProcesso3 = new javax.swing.JLabel();
        DadosdoProcesso4 = new javax.swing.JLabel();
        DadosdoProcesso5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        DadosdoProcesso6 = new javax.swing.JLabel();
        NomedoCliente4 = new javax.swing.JTextField();
        DadosdoProcesso7 = new javax.swing.JLabel();
        NomedoCliente5 = new javax.swing.JTextField();
        DadosdoProcesso8 = new javax.swing.JLabel();
        DadosdoProcesso9 = new javax.swing.JLabel();
        NomedoCliente6 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        DadosdoProcesso10 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        DadosdoProcesso11 = new javax.swing.JLabel();
        Login = new javax.swing.JFormattedTextField();
        LFornecedor = new javax.swing.JLabel();
        BackGround = new javax.swing.JLabel();

        setBackground(null);
        setBorder(null);
        setClosable(true);
        setTitle("Abrir Nova Cotação");
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BFinalizar.setBackground(new java.awt.Color(0, 204, 51));
        BFinalizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        BFinalizar.setText("Finalizar");
        BFinalizar.setBorder(null);
        BFinalizar.setBorderPainted(false);
        BFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(BFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 570, 150, 40));

        bAbrirCotação.setBackground(new java.awt.Color(0, 0, 255));
        bAbrirCotação.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bAbrirCotação.setForeground(new java.awt.Color(255, 255, 255));
        bAbrirCotação.setText("Adicionar");
        bAbrirCotação.setBorder(null);
        bAbrirCotação.setBorderPainted(false);
        bAbrirCotação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAbrirCotaçãoActionPerformed(evt);
            }
        });
        getContentPane().add(bAbrirCotação, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 150, 40));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bcarregarLista.setBackground(new java.awt.Color(0, 0, 255));
        bcarregarLista.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bcarregarLista.setForeground(new java.awt.Color(255, 255, 255));
        bcarregarLista.setText("Carregar Lista");
        bcarregarLista.setBorder(null);
        bcarregarLista.setBorderPainted(false);
        bcarregarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcarregarListaActionPerformed(evt);
            }
        });
        jPanel1.add(bcarregarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 150, 40));

        NomedoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomedoClienteActionPerformed(evt);
            }
        });
        jPanel1.add(NomedoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 290, 30));

        DadosdoProcesso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DadosdoProcesso.setForeground(new java.awt.Color(255, 255, 255));
        DadosdoProcesso.setText("Numero do Processo");
        jPanel1.add(DadosdoProcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 240, 30));

        NomedoCliente1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        NomedoCliente1.setText("Nome do Cliente");
        NomedoCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomedoCliente1ActionPerformed(evt);
            }
        });
        jPanel1.add(NomedoCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 290, 30));

        DadosdoProcesso2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DadosdoProcesso2.setForeground(new java.awt.Color(255, 255, 255));
        DadosdoProcesso2.setText("Endereço ");
        jPanel1.add(DadosdoProcesso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 240, 30));

        NomedoCliente2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        NomedoCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomedoCliente2ActionPerformed(evt);
            }
        });
        jPanel1.add(NomedoCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 290, 30));

        DadosdoProcesso3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DadosdoProcesso3.setForeground(new java.awt.Color(255, 255, 255));
        DadosdoProcesso3.setText("Bairro");
        jPanel1.add(DadosdoProcesso3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 240, 30));

        DadosdoProcesso4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DadosdoProcesso4.setForeground(new java.awt.Color(255, 255, 255));
        DadosdoProcesso4.setText("Cidade");
        jPanel1.add(DadosdoProcesso4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 240, 30));

        DadosdoProcesso5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        DadosdoProcesso5.setForeground(new java.awt.Color(255, 255, 255));
        DadosdoProcesso5.setText("UF");
        jPanel1.add(DadosdoProcesso5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, 60, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 70, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 290, 30));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 170, 30));

        DadosdoProcesso6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DadosdoProcesso6.setForeground(new java.awt.Color(255, 255, 255));
        DadosdoProcesso6.setText("CPF/CNPJ");
        jPanel1.add(DadosdoProcesso6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 240, 30));

        NomedoCliente4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        NomedoCliente4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomedoCliente4ActionPerformed(evt);
            }
        });
        jPanel1.add(NomedoCliente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 290, 30));

        DadosdoProcesso7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DadosdoProcesso7.setForeground(new java.awt.Color(255, 255, 255));
        DadosdoProcesso7.setText("Inscrição Estadual");
        jPanel1.add(DadosdoProcesso7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 240, 30));

        NomedoCliente5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        NomedoCliente5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomedoCliente5ActionPerformed(evt);
            }
        });
        jPanel1.add(NomedoCliente5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 110, 30));

        DadosdoProcesso8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        DadosdoProcesso8.setForeground(new java.awt.Color(255, 255, 255));
        DadosdoProcesso8.setText("à");
        jPanel1.add(DadosdoProcesso8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 20, 30));

        DadosdoProcesso9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DadosdoProcesso9.setForeground(new java.awt.Color(255, 255, 255));
        DadosdoProcesso9.setText("Prazo");
        jPanel1.add(DadosdoProcesso9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 240, 30));

        NomedoCliente6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        NomedoCliente6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomedoCliente6ActionPerformed(evt);
            }
        });
        jPanel1.add(NomedoCliente6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 110, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 342, 1170, 10));

        DadosdoProcesso10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DadosdoProcesso10.setForeground(new java.awt.Color(255, 255, 255));
        DadosdoProcesso10.setText("Lista de Material");
        jPanel1.add(DadosdoProcesso10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 240, 30));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 290, 30));

        DadosdoProcesso11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DadosdoProcesso11.setForeground(new java.awt.Color(255, 255, 255));
        DadosdoProcesso11.setText("Dados do Processo");
        jPanel1.add(DadosdoProcesso11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 66, 240, 30));

        Login.setForeground(new java.awt.Color(153, 153, 153));
        try {
            Login.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 290, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 520));

        LFornecedor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        LFornecedor.setText("Fornecedor");
        getContentPane().add(LFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 240, 30));

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPO..BOASVINDAS/Background geral.png"))); // NOI18N
        BackGround.setText("jLabel1");
        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, 0, 1280, 780));

        setBounds(0, 0, 950, 650);
    }// </editor-fold>//GEN-END:initComponents
    
    private void bAbrirCotaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAbrirCotaçãoActionPerformed
        
    }//GEN-LAST:event_bAbrirCotaçãoActionPerformed

    private void bcarregarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcarregarListaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bcarregarListaActionPerformed

    private void BFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFinalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BFinalizarActionPerformed

    private void NomedoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomedoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomedoClienteActionPerformed

    private void NomedoCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomedoCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomedoCliente1ActionPerformed

    private void NomedoCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomedoCliente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomedoCliente2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void NomedoCliente4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomedoCliente4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomedoCliente4ActionPerformed

    private void NomedoCliente5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomedoCliente5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomedoCliente5ActionPerformed

    private void NomedoCliente6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomedoCliente6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomedoCliente6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BFinalizar;
    private javax.swing.JLabel BackGround;
    private javax.swing.JLabel DadosdoProcesso;
    private javax.swing.JLabel DadosdoProcesso10;
    private javax.swing.JLabel DadosdoProcesso11;
    private javax.swing.JLabel DadosdoProcesso2;
    private javax.swing.JLabel DadosdoProcesso3;
    private javax.swing.JLabel DadosdoProcesso4;
    private javax.swing.JLabel DadosdoProcesso5;
    private javax.swing.JLabel DadosdoProcesso6;
    private javax.swing.JLabel DadosdoProcesso7;
    private javax.swing.JLabel DadosdoProcesso8;
    private javax.swing.JLabel DadosdoProcesso9;
    private javax.swing.JLabel LFornecedor;
    private javax.swing.JFormattedTextField Login;
    private javax.swing.JTextField NomedoCliente;
    private javax.swing.JTextField NomedoCliente1;
    private javax.swing.JTextField NomedoCliente2;
    private javax.swing.JTextField NomedoCliente4;
    private javax.swing.JTextField NomedoCliente5;
    private javax.swing.JTextField NomedoCliente6;
    private javax.swing.JButton bAbrirCotação;
    private javax.swing.JButton bcarregarLista;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
