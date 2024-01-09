package gerenciadordecampeonato;

import classes.BackgroundMusic;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TelaInicial extends javax.swing.JPanel {
    private BackgroundMusic backgroundMusic;
    Icon iconeSom = new ImageIcon(getClass().getResource("/imagens/iconeSom.png"));
    Icon iconeSomMutado = new ImageIcon(getClass().getResource("/imagens/iconeSomMutado.png"));
    
    public TelaInicial(BackgroundMusic bck) {
        backgroundMusic = bck;
        initComponents();
        SOM.setIcon(iconeSom);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BT_Entrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SOM = new javax.swing.JLabel();
        WallPaper = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BT_Entrar.setBackground(new java.awt.Color(0, 98, 63));
        BT_Entrar.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        BT_Entrar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Entrar.setText("ENTRAR");
        BT_Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_EntrarMouseClicked(evt);
            }
        });
        add(BT_Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 100, 40));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Aqui a diversão é garantida!");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 250, -1));

        SOM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SOMMouseClicked(evt);
            }
        });
        add(SOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 90, 60));

        WallPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/WallPaperInicial.png"))); // NOI18N
        add(WallPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BT_EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EntrarMouseClicked
        boolean musicaOn = true;
        if (SOM.getIcon() == iconeSomMutado)
            musicaOn = false;

        Janela.telaB = new TelaCadastro(backgroundMusic, musicaOn);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaA);
        janela.getContentPane().remove(Janela.telaA);
        janela.add(Janela.telaB, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_BT_EntrarMouseClicked

    private void SOMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SOMMouseClicked
        if (SOM.getIcon() == iconeSom) {
            backgroundMusic.mute();
            SOM.setIcon(iconeSomMutado);
        }else{
            backgroundMusic.mute();
            SOM.setIcon(iconeSom);
        }
    }//GEN-LAST:event_SOMMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Entrar;
    private javax.swing.JLabel SOM;
    private javax.swing.JLabel WallPaper;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
