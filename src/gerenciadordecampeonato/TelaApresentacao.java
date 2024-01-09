package gerenciadordecampeonato;

import classes.BackgroundMusic;
import classes.Campeonato;
import classes.Usuario;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TelaApresentacao extends javax.swing.JPanel {
    Usuario usuario = new Usuario("", "", "", "");
    String email;
    String[] nome;
    
    private BackgroundMusic backgroundMusic;
    Icon iconeSom = new ImageIcon(getClass().getResource("/imagens/iconeSom.png"));
    Icon iconeSomMutado = new ImageIcon(getClass().getResource("/imagens/iconeSomMutado.png"));
    boolean musicaOn = true;
    
    public TelaApresentacao(String email, BackgroundMusic bck, boolean mscOn) {        
        initComponents();
        backgroundMusic = bck;
        
        musicaOn = mscOn;
        if (musicaOn) SOM.setIcon(iconeSom);
        else SOM.setIcon(iconeSomMutado);
        
        this.email = email;
        acharUsuarioLogado();
        arrumarTela();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelChampions = new javax.swing.JPanel();
        BT_Jogar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        GifChampions = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        setaDireita = new javax.swing.JLabel();
        SuperTrunfo = new javax.swing.JLabel();
        LB_Nome = new javax.swing.JLabel();
        FotoUsuario = new javax.swing.JLabel();
        BT_Perfil = new javax.swing.JButton();
        SOM = new javax.swing.JLabel();
        WallPaper = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelChampions.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PainelChampions.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PainelChampionsMouseMoved(evt);
            }
        });
        PainelChampions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BT_Jogar.setBackground(new java.awt.Color(102, 102, 102));
        BT_Jogar.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        BT_Jogar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Jogar.setText("JOGAR");
        BT_Jogar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BT_Jogar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BT_JogarMouseMoved(evt);
            }
        });
        BT_Jogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_JogarMouseClicked(evt);
            }
        });
        PainelChampions.add(BT_Jogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 190, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoChampions.png"))); // NOI18N
        PainelChampions.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 750, 280));

        GifChampions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TransicaoChampionsLeague (1).gif"))); // NOI18N
        PainelChampions.add(GifChampions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 738, 270));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VAMOS JOGAR?");
        PainelChampions.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONHEÇA AS LIGAS");
        PainelChampions.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, 30));

        setaDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta (1) (1).png"))); // NOI18N
        setaDireita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setaDireitaMouseClicked(evt);
            }
        });
        PainelChampions.add(setaDireita, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, 20));

        add(PainelChampions, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 740, 320));

        SuperTrunfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SuperTrunfo-removebg-preview.png"))); // NOI18N
        add(SuperTrunfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, 100));

        LB_Nome.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        LB_Nome.setForeground(new java.awt.Color(255, 255, 255));
        LB_Nome.setText("<Nome>");
        add(LB_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, 30));

        FotoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FotoUsuario.png"))); // NOI18N
        add(FotoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, -1, -1));

        BT_Perfil.setBackground(new java.awt.Color(0, 98, 63));
        BT_Perfil.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        BT_Perfil.setForeground(new java.awt.Color(255, 255, 255));
        BT_Perfil.setText("PERFIL");
        BT_Perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_PerfilMouseClicked(evt);
            }
        });
        add(BT_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, -1, -1));

        SOM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SOMMouseClicked(evt);
            }
        });
        add(SOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 90, 60));

        WallPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/WallPaperLigas.png"))); // NOI18N
        WallPaper.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                WallPaperMouseMoved(evt);
            }
        });
        add(WallPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 630));
    }// </editor-fold>//GEN-END:initComponents

    public void acharUsuarioLogado(){
        for (int i = 0; i < Janela.c.listaUsuarios.size(); i++) {
            if (email.equals( Janela.c.listaUsuarios.get(i).getEmail())) {
                usuario =  Janela.c.listaUsuarios.get(i);
                break;
            }
        }
    }
    
    public void arrumarTela(){
        PainelChampions.setBackground( new Color(0,0,0, 90));
        BT_Jogar.setBackground(new Color(0,0,0,90));
        nome = usuario.getNome().split(" ");
        LB_Nome.setText(nome[0]);
    }
    
    private void setaDireitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setaDireitaMouseClicked
        if (SOM.getIcon() == iconeSomMutado)
            musicaOn = false;
        else
            musicaOn = true;
        
        Janela.telaE = new TelaLigas(nome[0], usuario.getEmail(), backgroundMusic, musicaOn);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaD);
        janela.getContentPane().remove(Janela.telaD);
        janela.add(Janela.telaE, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_setaDireitaMouseClicked

    private void BT_JogarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_JogarMouseMoved
        BT_Jogar.setBackground(new Color(255,255,255,90));
    }//GEN-LAST:event_BT_JogarMouseMoved

    private void WallPaperMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WallPaperMouseMoved
        arrumarTela();
    }//GEN-LAST:event_WallPaperMouseMoved

    private void PainelChampionsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PainelChampionsMouseMoved
        arrumarTela();
    }//GEN-LAST:event_PainelChampionsMouseMoved

    private void BT_JogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_JogarMouseClicked
        if (SOM.getIcon() == iconeSomMutado)
                musicaOn = false;
        Janela.telaF = new TelaJogo(usuario, backgroundMusic, musicaOn);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaD);
        janela.getContentPane().remove(Janela.telaD);
        janela.add(Janela.telaF, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_BT_JogarMouseClicked

    private void BT_PerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_PerfilMouseClicked
        if (SOM.getIcon() == iconeSomMutado)
                musicaOn = false;
        Janela.telaG = new TelaPerfil(email, backgroundMusic, musicaOn);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaD);
        janela.getContentPane().remove(Janela.telaD);
        janela.add(Janela.telaG, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_BT_PerfilMouseClicked

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
    private javax.swing.JButton BT_Jogar;
    private javax.swing.JButton BT_Perfil;
    private javax.swing.JLabel FotoUsuario;
    private javax.swing.JLabel GifChampions;
    private javax.swing.JLabel LB_Nome;
    private javax.swing.JPanel PainelChampions;
    private javax.swing.JLabel SOM;
    private javax.swing.JLabel SuperTrunfo;
    private javax.swing.JLabel WallPaper;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel setaDireita;
    // End of variables declaration//GEN-END:variables
}
