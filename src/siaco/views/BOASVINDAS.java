
package siaco.views;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import siaco.views.Internal.*;


public class BOASVINDAS extends javax.swing.JFrame {
      
  InternalFrameBemvindo telaBemvindo = new InternalFrameBemvindo();
  InternalFrameListaProdutos TelaListaProdutos = new InternalFrameListaProdutos();
  static InternalFrameCotações telaCotações = new InternalFrameCotações();
  
  //PADRAO DE PROJETO SINGLETON
  private static BOASVINDAS p;
  
  
    public static BOASVINDAS getInstancia(){
    if(p==null){
        p = new BOASVINDAS();
        }
    return p;    
    }
  
    public static JDesktopPane getDesktopPaneSecundaria(){
    telaCotações.dispose();
    
    return getInstancia().jDesktopPaneSecundario;
    } 
    
   
  
    public BOASVINDAS() {
        initComponents();
        
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JLabel();
        jDesktopPanePrincipal = new javax.swing.JDesktopPane();
        jDesktopPaneSecundario = new javax.swing.JDesktopPane();
        BTrabalheConosco = new javax.swing.JButton();
        BQuemSomos1 = new javax.swing.JButton();
        BContato = new javax.swing.JButton();
        BarraInferior = new javax.swing.JLabel();
        BarraLateralDireito = new javax.swing.JLabel();
        PainelSuperior = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        ListaProdutos = new javax.swing.JButton();
        Cotacoes = new javax.swing.JButton();
        Bemvindos = new javax.swing.JButton();
        Relatorio = new javax.swing.JButton();
        Fornecedores = new javax.swing.JButton();
        ajuda = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Siaco v.3");
        setMinimumSize(new java.awt.Dimension(1291, 753));
        setResizable(false);
        setSize(new java.awt.Dimension(1440, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPO..BOASVINDAS/Logo Siaco.png"))); // NOI18N
        Logo.setMaximumSize(new java.awt.Dimension(259, 90));
        Logo.setMinimumSize(new java.awt.Dimension(259, 90));
        Logo.setName(""); // NOI18N
        Logo.setOpaque(true);
        Logo.setPreferredSize(new java.awt.Dimension(259, 90));
        Logo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, -1));

        jDesktopPanePrincipal.setOpaque(false);

        javax.swing.GroupLayout jDesktopPanePrincipalLayout = new javax.swing.GroupLayout(jDesktopPanePrincipal);
        jDesktopPanePrincipal.setLayout(jDesktopPanePrincipalLayout);
        jDesktopPanePrincipalLayout.setHorizontalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jDesktopPanePrincipalLayout.setVerticalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPanePrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 750, 650));

        jDesktopPaneSecundario.setOpaque(false);

        javax.swing.GroupLayout jDesktopPaneSecundarioLayout = new javax.swing.GroupLayout(jDesktopPaneSecundario);
        jDesktopPaneSecundario.setLayout(jDesktopPaneSecundarioLayout);
        jDesktopPaneSecundarioLayout.setHorizontalGroup(
            jDesktopPaneSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jDesktopPaneSecundarioLayout.setVerticalGroup(
            jDesktopPaneSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPaneSecundario, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 91, 950, 650));

        BTrabalheConosco.setBackground(new java.awt.Color(0, 0, 0));
        BTrabalheConosco.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BTrabalheConosco.setText("Trabalhe Conosco");
        BTrabalheConosco.setBorderPainted(false);
        BTrabalheConosco.setContentAreaFilled(false);
        BTrabalheConosco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTrabalheConosco.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        BTrabalheConosco.setFocusCycleRoot(true);
        BTrabalheConosco.setHideActionText(true);
        BTrabalheConosco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTrabalheConosco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTrabalheConoscoActionPerformed(evt);
            }
        });
        getContentPane().add(BTrabalheConosco, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 660, 220, 30));

        BQuemSomos1.setBackground(new java.awt.Color(0, 0, 0));
        BQuemSomos1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BQuemSomos1.setText("Quem Somos");
        BQuemSomos1.setBorderPainted(false);
        BQuemSomos1.setContentAreaFilled(false);
        BQuemSomos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BQuemSomos1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        BQuemSomos1.setFocusCycleRoot(true);
        BQuemSomos1.setHideActionText(true);
        BQuemSomos1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BQuemSomos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BQuemSomos1ActionPerformed(evt);
            }
        });
        getContentPane().add(BQuemSomos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 600, 160, 30));

        BContato.setBackground(new java.awt.Color(0, 0, 0));
        BContato.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BContato.setText("Contato");
        BContato.setBorderPainted(false);
        BContato.setContentAreaFilled(false);
        BContato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BContato.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        BContato.setFocusCycleRoot(true);
        BContato.setHideActionText(true);
        BContato.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContatoActionPerformed(evt);
            }
        });
        getContentPane().add(BContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 630, 150, 30));

        BarraInferior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPO..BOASVINDAS/Rectangle 9.png"))); // NOI18N
        getContentPane().add(BarraInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 950, 180));

        BarraLateralDireito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPO..BOASVINDAS/Rectangle 8.png"))); // NOI18N
        getContentPane().add(BarraLateralDireito, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 200, 750));

        PainelSuperior.setBackground(new java.awt.Color(51, 51, 51));
        PainelSuperior.setLayout(null);
        getContentPane().add(PainelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 1200, 90));

        Menu.setBackground(new java.awt.Color(153, 153, 153));
        Menu.setLayout(null);

        ListaProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPO..BOASVINDAS/Group 70.png"))); // NOI18N
        ListaProdutos.setBorderPainted(false);
        ListaProdutos.setContentAreaFilled(false);
        ListaProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ListaProdutos.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        ListaProdutos.setFocusCycleRoot(true);
        ListaProdutos.setHideActionText(true);
        ListaProdutos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ListaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaProdutosActionPerformed(evt);
            }
        });
        Menu.add(ListaProdutos);
        ListaProdutos.setBounds(20, 190, 310, 50);

        Cotacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPO..BOASVINDAS/Group 14.png"))); // NOI18N
        Cotacoes.setBorderPainted(false);
        Cotacoes.setContentAreaFilled(false);
        Cotacoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cotacoes.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        Cotacoes.setFocusCycleRoot(true);
        Cotacoes.setHideActionText(true);
        Cotacoes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Cotacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CotacoesActionPerformed(evt);
            }
        });
        Menu.add(Cotacoes);
        Cotacoes.setBounds(20, 250, 310, 50);

        Bemvindos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPO..BOASVINDAS/Group 12.png"))); // NOI18N
        Bemvindos.setBorderPainted(false);
        Bemvindos.setContentAreaFilled(false);
        Bemvindos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bemvindos.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        Bemvindos.setFocusCycleRoot(true);
        Bemvindos.setHideActionText(true);
        Bemvindos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Bemvindos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BemvindosStateChanged(evt);
            }
        });
        Bemvindos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BemvindosActionPerformed(evt);
            }
        });
        Menu.add(Bemvindos);
        Bemvindos.setBounds(20, 130, 310, 50);

        Relatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPO..BOASVINDAS/Group 15.png"))); // NOI18N
        Relatorio.setBorderPainted(false);
        Relatorio.setContentAreaFilled(false);
        Relatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Relatorio.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        Relatorio.setFocusCycleRoot(true);
        Relatorio.setHideActionText(true);
        Relatorio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioActionPerformed(evt);
            }
        });
        Menu.add(Relatorio);
        Relatorio.setBounds(20, 310, 310, 50);

        Fornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPO..BOASVINDAS/Group 74.png"))); // NOI18N
        Fornecedores.setBorderPainted(false);
        Fornecedores.setContentAreaFilled(false);
        Fornecedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fornecedores.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        Fornecedores.setFocusCycleRoot(true);
        Fornecedores.setHideActionText(true);
        Fornecedores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Fornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FornecedoresActionPerformed(evt);
            }
        });
        Menu.add(Fornecedores);
        Fornecedores.setBounds(20, 370, 310, 50);

        ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPO..BOASVINDAS/Group 75.png"))); // NOI18N
        ajuda.setBorderPainted(false);
        ajuda.setContentAreaFilled(false);
        ajuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ajuda.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        ajuda.setFocusCycleRoot(true);
        ajuda.setHideActionText(true);
        ajuda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajudaActionPerformed(evt);
            }
        });
        Menu.add(ajuda);
        ajuda.setBounds(20, 430, 310, 43);

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 750));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/COMPO..BOASVINDAS/Background geral.png"))); // NOI18N
        background.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        background.setMaximumSize(new java.awt.Dimension(1440, 900));
        background.setMinimumSize(new java.awt.Dimension(1440, 900));
        background.setName(""); // NOI18N
        background.setOpaque(true);
        background.setPreferredSize(new java.awt.Dimension(1440, 900));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -20, 1390, 1170));

        jMenu1.setText("Arquivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Exibir");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Filtros");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Configurações");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ajuda");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1309, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static void fecharultaimjanela(JInternalFrame j){   
    j.dispose();
    }
        
    private void BemvindosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BemvindosActionPerformed
        fecharultaimjanela(TelaListaProdutos);
        fecharultaimjanela(telaCotações);
    jDesktopPaneSecundario.setVisible(false);
    jDesktopPanePrincipal.setVisible(true);
    jDesktopPanePrincipal.add(telaBemvindo);
    telaBemvindo.setVisible(true);
    telaBemvindo.setClosable(true);
    telaBemvindo.setLocation(0, 0);
          
    }//GEN-LAST:event_BemvindosActionPerformed

    private void ListaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaProdutosActionPerformed
    jDesktopPaneSecundario.setVisible(false);
    jDesktopPanePrincipal.setVisible(true);
        jDesktopPanePrincipal.add(TelaListaProdutos);
        fecharultaimjanela(telaBemvindo);
        fecharultaimjanela(telaCotações);
    
    TelaListaProdutos.setVisible(true);
    TelaListaProdutos.setClosable(true);
    TelaListaProdutos.setLocation(0,0);
  
    
    }//GEN-LAST:event_ListaProdutosActionPerformed

    private void CotacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CotacoesActionPerformed
    fecharultaimjanela(TelaListaProdutos);
    fecharultaimjanela(telaBemvindo);
    jDesktopPanePrincipal.setVisible(false);
    jDesktopPaneSecundario.setVisible(true);
    jDesktopPaneSecundario.add(telaCotações);
    

    
    telaCotações.setVisible(true);
    telaCotações.setClosable(true);
    telaCotações.setLocation(0,0);
  
      
    }//GEN-LAST:event_CotacoesActionPerformed

    private void RelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RelatorioActionPerformed

    private void FornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FornecedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FornecedoresActionPerformed

    private void ajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ajudaActionPerformed

    private void BTrabalheConoscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTrabalheConoscoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTrabalheConoscoActionPerformed

    private void BQuemSomos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BQuemSomos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BQuemSomos1ActionPerformed

    private void BContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BContatoActionPerformed

    private void BemvindosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BemvindosStateChanged
   
    }//GEN-LAST:event_BemvindosStateChanged

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
            java.util.logging.Logger.getLogger(BOASVINDAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BOASVINDAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BOASVINDAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BOASVINDAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                getInstancia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BContato;
    private javax.swing.JButton BQuemSomos1;
    private javax.swing.JButton BTrabalheConosco;
    private javax.swing.JLabel BarraInferior;
    private javax.swing.JLabel BarraLateralDireito;
    private javax.swing.JButton Bemvindos;
    private javax.swing.JButton Cotacoes;
    private javax.swing.JButton Fornecedores;
    private javax.swing.JButton ListaProdutos;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel PainelSuperior;
    private javax.swing.JButton Relatorio;
    private javax.swing.JButton ajuda;
    private javax.swing.JLabel background;
    private javax.swing.JDesktopPane jDesktopPanePrincipal;
    private javax.swing.JDesktopPane jDesktopPaneSecundario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
