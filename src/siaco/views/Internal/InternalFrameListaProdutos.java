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
public class InternalFrameListaProdutos extends javax.swing.JInternalFrame {

    InternalFrameCriarListadeProdutos Lista = new InternalFrameCriarListadeProdutos();
    
    
    
    public InternalFrameListaProdutos() {
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

        bImprimirEnviar = new javax.swing.JButton();
        bMinhaLista = new javax.swing.JButton();
        bCriarLista = new javax.swing.JButton();
        bfavoritos = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();

        setBackground(null);
        setBorder(null);
        setClosable(true);
        setTitle("Lista de Produtos");
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bImprimirEnviar.setBackground(new java.awt.Color(0, 204, 102));
        bImprimirEnviar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bImprimirEnviar.setForeground(new java.awt.Color(255, 255, 255));
        bImprimirEnviar.setText("Imprimir/Enviar");
        bImprimirEnviar.setBorder(null);
        bImprimirEnviar.setBorderPainted(false);
        bImprimirEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bImprimirEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(bImprimirEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 270, 80));

        bMinhaLista.setBackground(new java.awt.Color(102, 51, 204));
        bMinhaLista.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bMinhaLista.setForeground(new java.awt.Color(255, 255, 255));
        bMinhaLista.setText("Minha Lista");
        bMinhaLista.setBorder(null);
        bMinhaLista.setBorderPainted(false);
        bMinhaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMinhaListaActionPerformed(evt);
            }
        });
        getContentPane().add(bMinhaLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 270, 80));

        bCriarLista.setBackground(new java.awt.Color(0, 0, 255));
        bCriarLista.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bCriarLista.setForeground(new java.awt.Color(255, 255, 255));
        bCriarLista.setText("Criar Lista");
        bCriarLista.setBorder(null);
        bCriarLista.setBorderPainted(false);
        bCriarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCriarListaActionPerformed(evt);
            }
        });
        getContentPane().add(bCriarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 270, 80));

        bfavoritos.setBackground(new java.awt.Color(204, 153, 0));
        bfavoritos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bfavoritos.setForeground(new java.awt.Color(255, 255, 255));
        bfavoritos.setText("Favoritos");
        bfavoritos.setBorder(null);
        bfavoritos.setBorderPainted(false);
        bfavoritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfavoritosActionPerformed(evt);
            }
        });
        getContentPane().add(bfavoritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 270, 80));

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPO..BOASVINDAS/Background geral.png"))); // NOI18N
        BackGround.setText("jLabel1");
        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(-390, 0, 1280, 780));

        setBounds(0, 0, 750, 650);
    }// </editor-fold>//GEN-END:initComponents
    
    private void bImprimirEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bImprimirEnviarActionPerformed
        
    }//GEN-LAST:event_bImprimirEnviarActionPerformed

    private void bMinhaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMinhaListaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bMinhaListaActionPerformed

    private void bCriarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCriarListaActionPerformed
    
        
    BOASVINDAS.getDesktopPaneSecundaria().add(Lista);
   
    Lista.setVisible(true);
    Lista.setLocation(0, 0);
    }//GEN-LAST:event_bCriarListaActionPerformed

    private void bfavoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfavoritosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bfavoritosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JButton bCriarLista;
    private javax.swing.JButton bImprimirEnviar;
    private javax.swing.JButton bMinhaLista;
    private javax.swing.JButton bfavoritos;
    // End of variables declaration//GEN-END:variables
}
