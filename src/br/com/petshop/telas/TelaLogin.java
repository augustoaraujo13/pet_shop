package br.com.petshop.telas;

import java.awt.Toolkit;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        //[252,74,26]
         //Adiciona um icone a tela.
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/petshop/imagens/pata.png")));
        //  /src/br/com/petshop/imagens/pata.png

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFundo = new javax.swing.JPanel();
        PainelLogin1 = new javax.swing.JPanel();
        LblUsuario1 = new javax.swing.JLabel();
        LblSenha1 = new javax.swing.JLabel();
        TxtUsuario1 = new javax.swing.JTextField();
        TxtSenha1 = new javax.swing.JTextField();
        BtnLogar1 = new javax.swing.JButton();
        LblTexto1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bem vindo a tela de login");
        setResizable(false);

        PanelFundo.setBackground(new java.awt.Color(74, 189, 172));

        PainelLogin1.setBackground(new java.awt.Color(247, 135, 51));

        LblUsuario1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        LblUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario1.setText("Usuário");

        LblSenha1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        LblSenha1.setForeground(new java.awt.Color(255, 255, 255));
        LblSenha1.setText("Senha");

        TxtUsuario1.setBackground(new java.awt.Color(255, 255, 255));
        TxtUsuario1.setForeground(new java.awt.Color(0, 0, 0));

        TxtSenha1.setBackground(new java.awt.Color(255, 255, 255));
        TxtSenha1.setForeground(new java.awt.Color(0, 0, 0));

        BtnLogar1.setBackground(new java.awt.Color(247, 195, 49));
        BtnLogar1.setForeground(new java.awt.Color(0, 0, 0));
        BtnLogar1.setText("Logar");

        LblTexto1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        LblTexto1.setForeground(new java.awt.Color(255, 255, 255));
        LblTexto1.setText(">> Login <<");

        javax.swing.GroupLayout PainelLogin1Layout = new javax.swing.GroupLayout(PainelLogin1);
        PainelLogin1.setLayout(PainelLogin1Layout);
        PainelLogin1Layout.setHorizontalGroup(
            PainelLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLogin1Layout.createSequentialGroup()
                .addGroup(PainelLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelLogin1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(PainelLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnLogar1)
                            .addGroup(PainelLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LblUsuario1)
                                .addComponent(LblSenha1)
                                .addComponent(TxtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PainelLogin1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(LblTexto1)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        PainelLogin1Layout.setVerticalGroup(
            PainelLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLogin1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(LblTexto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(LblUsuario1)
                .addGap(18, 18, 18)
                .addComponent(TxtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(LblSenha1)
                .addGap(18, 18, 18)
                .addComponent(TxtSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnLogar1)
                .addGap(9, 9, 9))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/petshop/imagens/petshop.png"))); // NOI18N

        javax.swing.GroupLayout PanelFundoLayout = new javax.swing.GroupLayout(PanelFundo);
        PanelFundo.setLayout(PanelFundoLayout);
        PanelFundoLayout.setHorizontalGroup(
            PanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFundoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(PainelLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        PanelFundoLayout.setVerticalGroup(
            PanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFundoLayout.createSequentialGroup()
                .addGroup(PanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFundoLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addGroup(PanelFundoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(PainelLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogar;
    private javax.swing.JButton BtnLogar1;
    private javax.swing.JLabel LblSenha;
    private javax.swing.JLabel LblSenha1;
    private javax.swing.JLabel LblTexto;
    private javax.swing.JLabel LblTexto1;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JLabel LblUsuario1;
    private javax.swing.JPanel PainelLogin;
    private javax.swing.JPanel PainelLogin1;
    private javax.swing.JPanel PanelFundo;
    private javax.swing.JTextField TxtSenha;
    private javax.swing.JTextField TxtSenha1;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JTextField TxtUsuario1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
