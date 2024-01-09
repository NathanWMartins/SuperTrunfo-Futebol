package gerenciadordecampeonato;

import classes.BackgroundMusic;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TelaLigas extends javax.swing.JPanel {
    String email, nome;
    private BackgroundMusic backgroundMusic;
    Icon iconeSom = new ImageIcon(getClass().getResource("/imagens/iconeSom.png"));
    Icon iconeSomMutado = new ImageIcon(getClass().getResource("/imagens/iconeSomMutado.png"));
    private boolean musicaOn = true;
    
    public TelaLigas(String nome, String email, BackgroundMusic bck, boolean mscOn) {
        initComponents();
        backgroundMusic = bck;
        
        musicaOn = mscOn;
        if (musicaOn) SOM.setIcon(iconeSom);
        else SOM.setIcon(iconeSomMutado);
        
        this.email = email;
        this.nome = nome;
        LB_Nome.setText(nome.toUpperCase());
        arrumarTela();                     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        LB_Nome = new javax.swing.JLabel();
        PN_Campeonato = new javax.swing.JPanel();
        PainelPremier = new javax.swing.JPanel();
        LB_PremierLeague = new javax.swing.JLabel();
        GifPremier = new javax.swing.JLabel();
        PainelLaLiga = new javax.swing.JPanel();
        LB_LaLiga = new javax.swing.JLabel();
        GifLaLiga = new javax.swing.JLabel();
        PainelLigue1 = new javax.swing.JPanel();
        LB_Ligue1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PainelSerieA = new javax.swing.JPanel();
        LB_SerieA = new javax.swing.JLabel();
        GifSerieA = new javax.swing.JLabel();
        PainelBundesliga = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TF_LaLiga = new javax.swing.JTextField();
        TF_PremierLeague = new javax.swing.JTextField();
        TF_Ligue1 = new javax.swing.JTextField();
        TF_SerieA = new javax.swing.JTextField();
        TF_Bundesliga = new javax.swing.JTextField();
        BT_Voltar = new javax.swing.JButton();
        BT_Perfil = new javax.swing.JButton();
        FotoUsuario = new javax.swing.JLabel();
        SuperTrunfo = new javax.swing.JLabel();
        SOM = new javax.swing.JLabel();
        WallPaper = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SuperTrunfo-removebg-preview.png"))); // NOI18N

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_Nome.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        LB_Nome.setForeground(new java.awt.Color(255, 255, 255));
        LB_Nome.setText("<Nome>");
        add(LB_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, 30));

        PN_Campeonato.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        PN_Campeonato.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelPremier.setBackground(new java.awt.Color(51, 51, 51));
        PainelPremier.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_PremierLeague.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoPremierLeague.png"))); // NOI18N
        PainelPremier.add(LB_PremierLeague, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        GifPremier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TransicaoPremierLeague (1).gif"))); // NOI18N
        PainelPremier.add(GifPremier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PN_Campeonato.add(PainelPremier, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, 190));

        PainelLaLiga.setBackground(new java.awt.Color(51, 51, 51));
        PainelLaLiga.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_LaLiga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LaLigaSemFundo.png"))); // NOI18N
        PainelLaLiga.add(LB_LaLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        GifLaLiga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TransicaoLaLiga.gif"))); // NOI18N
        PainelLaLiga.add(GifLaLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PN_Campeonato.add(PainelLaLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 130, 190));

        PainelLigue1.setBackground(new java.awt.Color(51, 51, 51));
        PainelLigue1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_Ligue1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoLigue1SemFundo.png"))); // NOI18N
        PainelLigue1.add(LB_Ligue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TransicaoLigue1 (1).gif"))); // NOI18N
        PainelLigue1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PN_Campeonato.add(PainelLigue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 130, 190));

        PainelSerieA.setBackground(new java.awt.Color(51, 51, 51));
        PainelSerieA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_SerieA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SerieALogo.png"))); // NOI18N
        PainelSerieA.add(LB_SerieA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, -1));

        GifSerieA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TransicaoSerieA (1).gif"))); // NOI18N
        PainelSerieA.add(GifSerieA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PN_Campeonato.add(PainelSerieA, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, -1, 190));

        PainelBundesliga.setBackground(new java.awt.Color(255, 255, 255));
        PainelBundesliga.setForeground(new java.awt.Color(255, 0, 0));
        PainelBundesliga.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/BundesligaLogo.png"))); // NOI18N
        PainelBundesliga.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 120, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TransicaoBundesliga (1).gif"))); // NOI18N
        PainelBundesliga.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PN_Campeonato.add(PainelBundesliga, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 130, 190));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CLIQUE NOS NOMES DAS LIGAS E VEJA INFORMAÇÕES SOBRE SUAS PARTICIPAÇÕES NA CHAMPIONS LEAGUE:");
        PN_Campeonato.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 23, -1, -1));

        TF_LaLiga.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        TF_LaLiga.setForeground(new java.awt.Color(153, 153, 0));
        TF_LaLiga.setText("   LA LIGA");
        TF_LaLiga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TF_LaLigaMouseClicked(evt);
            }
        });
        PN_Campeonato.add(TF_LaLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 130, -1));

        TF_PremierLeague.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        TF_PremierLeague.setForeground(new java.awt.Color(51, 0, 51));
        TF_PremierLeague.setText(" PREMIER LEAGUE");
        TF_PremierLeague.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TF_PremierLeagueMouseClicked(evt);
            }
        });
        PN_Campeonato.add(TF_PremierLeague, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 130, -1));

        TF_Ligue1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        TF_Ligue1.setForeground(new java.awt.Color(0, 0, 51));
        TF_Ligue1.setText("   LIGUE 1 ");
        TF_Ligue1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TF_Ligue1MouseClicked(evt);
            }
        });
        PN_Campeonato.add(TF_Ligue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 130, -1));

        TF_SerieA.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        TF_SerieA.setForeground(new java.awt.Color(0, 153, 51));
        TF_SerieA.setText("   SERIE A");
        TF_SerieA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TF_SerieAMouseClicked(evt);
            }
        });
        PN_Campeonato.add(TF_SerieA, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 132, -1));

        TF_Bundesliga.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        TF_Bundesliga.setForeground(new java.awt.Color(255, 0, 0));
        TF_Bundesliga.setText("  BUNDESLIGA");
        TF_Bundesliga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TF_BundesligaMouseClicked(evt);
            }
        });
        PN_Campeonato.add(TF_Bundesliga, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 130, -1));

        add(PN_Campeonato, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 910, 300));

        BT_Voltar.setBackground(new java.awt.Color(0, 98, 63));
        BT_Voltar.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        BT_Voltar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Voltar.setText("VOLTAR");
        BT_Voltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BT_Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_VoltarMouseClicked(evt);
            }
        });
        add(BT_Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 110, 40));

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

        FotoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FotoUsuario.png"))); // NOI18N
        add(FotoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, -1, -1));

        SuperTrunfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SuperTrunfo-removebg-preview.png"))); // NOI18N
        add(SuperTrunfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, 100));

        SOM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SOMMouseClicked(evt);
            }
        });
        add(SOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 90, 60));

        WallPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/WallPaperLigas.png"))); // NOI18N
        add(WallPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void arrumarTela(){
        TF_PremierLeague.setEditable(false);
        TF_LaLiga.setEditable(false);
        TF_Ligue1.setEditable(false);
        TF_SerieA.setEditable(false);
        TF_Bundesliga.setEditable(false);
        PN_Campeonato.setBackground( new Color(0,98,63, 90));
        PainelPremier.setBackground( new Color(0,0,0, 90));
        PainelLaLiga.setBackground( new Color(0,0,0, 90));
        PainelLigue1.setBackground( new Color(0,0,0, 90));
        PainelSerieA.setBackground( new Color(0,0,0, 90));
        PainelBundesliga.setBackground( new Color(0,0,0, 90));
    }

    private void BT_VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_VoltarMouseClicked
        if (SOM.getIcon() == iconeSomMutado)
            musicaOn = false;
        Janela.telaD = new TelaApresentacao(email, backgroundMusic, musicaOn);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaE);
        janela.getContentPane().remove(Janela.telaE);
        janela.add(Janela.telaD, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_BT_VoltarMouseClicked

    private void BT_PerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_PerfilMouseClicked
        if (SOM.getIcon() == iconeSomMutado)
            musicaOn = false;
        Janela.telaG = new TelaPerfil(email, backgroundMusic, musicaOn);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaE);
        janela.getContentPane().remove(Janela.telaE);
        janela.add(Janela.telaG, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_BT_PerfilMouseClicked

    private void TF_PremierLeagueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_PremierLeagueMouseClicked
        if (SOM.getIcon() == iconeSomMutado)
            musicaOn = false;
        Janela.telaH = new TelaPremier(nome, email, backgroundMusic, musicaOn);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaE);
        janela.getContentPane().remove(Janela.telaE);
        janela.add(Janela.telaH, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_TF_PremierLeagueMouseClicked

    private void TF_LaLigaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_LaLigaMouseClicked
        if (SOM.getIcon() == iconeSomMutado)
            musicaOn = false;
        Janela.telaI = new TelaLaLiga(nome, email, backgroundMusic, musicaOn);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaE);
        janela.getContentPane().remove(Janela.telaE);
        janela.add(Janela.telaI, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_TF_LaLigaMouseClicked

    private void TF_Ligue1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_Ligue1MouseClicked
        if (SOM.getIcon() == iconeSomMutado)
            musicaOn = false;
        Janela.telaJ = new TelaLigue1(nome, email, backgroundMusic, musicaOn);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaE);
        janela.getContentPane().remove(Janela.telaE);
        janela.add(Janela.telaJ, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_TF_Ligue1MouseClicked

    private void TF_SerieAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_SerieAMouseClicked
        if (SOM.getIcon() == iconeSomMutado)
            musicaOn = false;
        Janela.telaK = new TelaSerieA(nome, email, backgroundMusic, musicaOn);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaE);
        janela.getContentPane().remove(Janela.telaE);
        janela.add(Janela.telaK, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_TF_SerieAMouseClicked

    private void TF_BundesligaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_BundesligaMouseClicked
        if (SOM.getIcon() == iconeSomMutado)
            musicaOn = false;
        Janela.telaL = new TelaBundesliga(nome, email, backgroundMusic, musicaOn);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaE);
        janela.getContentPane().remove(Janela.telaE);
        janela.add(Janela.telaL, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_TF_BundesligaMouseClicked

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
    private javax.swing.JButton BT_Perfil;
    private javax.swing.JButton BT_Voltar;
    private javax.swing.JLabel FotoUsuario;
    private javax.swing.JLabel GifLaLiga;
    private javax.swing.JLabel GifPremier;
    private javax.swing.JLabel GifSerieA;
    private javax.swing.JLabel LB_LaLiga;
    private javax.swing.JLabel LB_Ligue1;
    private javax.swing.JLabel LB_Nome;
    private javax.swing.JLabel LB_PremierLeague;
    private javax.swing.JLabel LB_SerieA;
    private javax.swing.JPanel PN_Campeonato;
    private javax.swing.JPanel PainelBundesliga;
    private javax.swing.JPanel PainelLaLiga;
    private javax.swing.JPanel PainelLigue1;
    private javax.swing.JPanel PainelPremier;
    private javax.swing.JPanel PainelSerieA;
    private javax.swing.JLabel SOM;
    private javax.swing.JLabel SuperTrunfo;
    private javax.swing.JTextField TF_Bundesliga;
    private javax.swing.JTextField TF_LaLiga;
    private javax.swing.JTextField TF_Ligue1;
    private javax.swing.JTextField TF_PremierLeague;
    private javax.swing.JTextField TF_SerieA;
    private javax.swing.JLabel WallPaper;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
