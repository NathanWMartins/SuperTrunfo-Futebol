package gerenciadordecampeonato;

import classes.BackgroundMusic;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TelaBundesliga extends javax.swing.JPanel {
    String nome, email;
    
    private BackgroundMusic backgroundMusic;
    Icon iconeSom = new ImageIcon(getClass().getResource("/imagens/iconeSom.png"));
    Icon iconeSomMutado = new ImageIcon(getClass().getResource("/imagens/iconeSomMutado.png"));
    private boolean musicaOn = true;
    
    public TelaBundesliga(String nome, String email, BackgroundMusic bck, boolean mscOn) {
        initComponents();
        backgroundMusic = bck;
        
        musicaOn = mscOn;
        if (musicaOn) SOM.setIcon(iconeSom);
        else SOM.setIcon(iconeSomMutado);
        
        this.email = email;
        this.nome = nome;
        setarBotao();
    }

    public void setarBotao(){
        BT_Voltar.setBackground( new Color(0,0,0, 90));
        BT_Voltar.setBorderPainted(false);
        BT_Voltar.setContentAreaFilled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        SOM = new javax.swing.JLabel();
        BT_Voltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SOM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SOMMouseClicked(evt);
            }
        });
        add(SOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 90, 60));

        BT_Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_VoltarMouseClicked(evt);
            }
        });
        add(BT_Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/WallPaperBundesliga (1).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BT_VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_VoltarMouseClicked
        if (SOM.getIcon() == iconeSomMutado)
            musicaOn = false;
        else
            musicaOn = true;
        Janela.telaE = new TelaLigas(nome, email, backgroundMusic, musicaOn);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaL);
        janela.getContentPane().remove(Janela.telaL);
        janela.add(Janela.telaE, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_BT_VoltarMouseClicked

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
    private javax.swing.JButton BT_Voltar;
    private javax.swing.JLabel SOM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
