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
public class InternalFrameCriarListadeProdutos extends javax.swing.JInternalFrame {
 
    
    public InternalFrameCriarListadeProdutos() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AbrirCotacao = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(null);
        setBorder(null);
        setClosable(true);
        setTitle("Lista de Produtos");
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AbrirCotacao.setBackground(new java.awt.Color(0, 0, 255));
        AbrirCotacao.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AbrirCotacao.setForeground(new java.awt.Color(255, 255, 255));
        AbrirCotacao.setText("Abrir Cotação");
        AbrirCotacao.setBorder(null);
        AbrirCotacao.setBorderPainted(false);
        AbrirCotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirCotacaoActionPerformed(evt);
            }
        });
        getContentPane().add(AbrirCotacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 270, 80));

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPO..BOASVINDAS/Background geral.png"))); // NOI18N
        BackGround.setText("jLabel1");
        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(-640, -20, 1720, 910));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 900, 460));

        setBounds(0, 0, 950, 650);
    }// </editor-fold>//GEN-END:initComponents
    
    private void AbrirCotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirCotacaoActionPerformed
        
    }//GEN-LAST:event_AbrirCotacaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirCotacao;
    private javax.swing.JLabel BackGround;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
