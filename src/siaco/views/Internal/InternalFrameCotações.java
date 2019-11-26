/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siaco.views.Internal;

import javax.swing.JDesktopPane;
import siaco.views.*;

import javax.swing.JInternalFrame;
import siaco.views.Internal.*;
import siaco.views.BOASVINDAS;


public class InternalFrameCotações extends javax.swing.JInternalFrame {

    
    InternalFrameNovaCotação telaNovaCotação = new InternalFrameNovaCotação();
    
    
    
    public InternalFrameCotações() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AbrirCotacao3 = new javax.swing.JButton();
        AbrirCotacao4 = new javax.swing.JButton();
        AbrirCotacao5 = new javax.swing.JButton();
        BFinanceiro = new javax.swing.JButton();
        BAbrirCotacao = new javax.swing.JButton();
        Bfechar = new javax.swing.JButton();
        Historico = new javax.swing.JLabel();
        CotaçõesAbertas = new javax.swing.JLabel();
        CotaçõesFechadas = new javax.swing.JLabel();
        BackGround = new javax.swing.JLabel();

        setBackground(null);
        setBorder(null);
        setClosable(true);
        setTitle("Cotações");
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AbrirCotacao3.setBackground(new java.awt.Color(51, 204, 0));
        AbrirCotacao3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AbrirCotacao3.setForeground(new java.awt.Color(255, 255, 255));
        AbrirCotacao3.setText("Cotações Em Aberto");
        AbrirCotacao3.setBorder(null);
        AbrirCotacao3.setBorderPainted(false);
        AbrirCotacao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirCotacao3ActionPerformed(evt);
            }
        });
        getContentPane().add(AbrirCotacao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 70));

        AbrirCotacao4.setBackground(new java.awt.Color(0, 0, 255));
        AbrirCotacao4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AbrirCotacao4.setForeground(new java.awt.Color(255, 255, 255));
        AbrirCotacao4.setText("Seu Histórico");
        AbrirCotacao4.setBorder(null);
        AbrirCotacao4.setBorderPainted(false);
        AbrirCotacao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirCotacao4ActionPerformed(evt);
            }
        });
        getContentPane().add(AbrirCotacao4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 220, 70));

        AbrirCotacao5.setBackground(new java.awt.Color(255, 0, 0));
        AbrirCotacao5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AbrirCotacao5.setForeground(new java.awt.Color(255, 255, 255));
        AbrirCotacao5.setText("Cotações Fechadas");
        AbrirCotacao5.setBorder(null);
        AbrirCotacao5.setBorderPainted(false);
        AbrirCotacao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirCotacao5ActionPerformed(evt);
            }
        });
        getContentPane().add(AbrirCotacao5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 220, 70));

        BFinanceiro.setBackground(new java.awt.Color(255, 153, 0));
        BFinanceiro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BFinanceiro.setForeground(new java.awt.Color(255, 255, 255));
        BFinanceiro.setText("Financeiro");
        BFinanceiro.setBorder(null);
        BFinanceiro.setBorderPainted(false);
        BFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFinanceiroActionPerformed(evt);
            }
        });
        getContentPane().add(BFinanceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 220, 80));

        BAbrirCotacao.setBackground(new java.awt.Color(0, 0, 255));
        BAbrirCotacao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BAbrirCotacao.setForeground(new java.awt.Color(255, 255, 255));
        BAbrirCotacao.setText("Abrir Cotação");
        BAbrirCotacao.setBorder(null);
        BAbrirCotacao.setBorderPainted(false);
        BAbrirCotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAbrirCotacaoActionPerformed(evt);
            }
        });
        getContentPane().add(BAbrirCotacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 220, 70));

        Bfechar.setBackground(new java.awt.Color(204, 0, 0));
        Bfechar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bfechar.setForeground(new java.awt.Color(255, 255, 255));
        Bfechar.setText("Fechar");
        Bfechar.setBorder(null);
        Bfechar.setBorderPainted(false);
        Bfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BfecharActionPerformed(evt);
            }
        });
        getContentPane().add(Bfechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, 220, 80));

        Historico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPO..BOASVINDAS/Rectangle 8.png"))); // NOI18N
        getContentPane().add(Historico, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 220, 620));

        CotaçõesAbertas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPO..BOASVINDAS/Rectangle 8.png"))); // NOI18N
        getContentPane().add(CotaçõesAbertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 620));

        CotaçõesFechadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPO..BOASVINDAS/Rectangle 8.png"))); // NOI18N
        getContentPane().add(CotaçõesFechadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 220, 620));

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPO..BOASVINDAS/Background geral.png"))); // NOI18N
        BackGround.setText("jLabel1");
        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(-450, 0, 1410, 780));

        setBounds(0, 0, 950, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void BFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFinanceiroActionPerformed
    
        
        
    }//GEN-LAST:event_BFinanceiroActionPerformed

    private void BAbrirCotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAbrirCotacaoActionPerformed
            
    BOASVINDAS.jDesktopPaneSecundario.add(telaNovaCotação);
    telaNovaCotação.setVisible(true);
    telaNovaCotação.setLocation(0, 0);    
    }//GEN-LAST:event_BAbrirCotacaoActionPerformed

    private void BfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BfecharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BfecharActionPerformed

    private void AbrirCotacao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirCotacao3ActionPerformed

    }//GEN-LAST:event_AbrirCotacao3ActionPerformed

    private void AbrirCotacao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirCotacao4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AbrirCotacao4ActionPerformed

    private void AbrirCotacao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirCotacao5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AbrirCotacao5ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirCotacao3;
    private javax.swing.JButton AbrirCotacao4;
    private javax.swing.JButton AbrirCotacao5;
    private javax.swing.JButton BAbrirCotacao;
    private javax.swing.JButton BFinanceiro;
    private javax.swing.JLabel BackGround;
    private javax.swing.JButton Bfechar;
    private javax.swing.JLabel CotaçõesAbertas;
    private javax.swing.JLabel CotaçõesFechadas;
    private javax.swing.JLabel Historico;
    // End of variables declaration//GEN-END:variables
}
