package gerenciadordecampeonato;

import classes.BackgroundMusic;
import classes.Usuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

public class TelaPerfil extends javax.swing.JPanel {
    Icon imagemEsc = new ImageIcon(getClass().getResource("/imagens/SairPerfil.png"));
    Icon imagemSair = new ImageIcon(getClass().getResource("/imagens/BotaoSairPerfil.png"));
    Icon imagemSalvar = new ImageIcon(getClass().getResource("/imagens/BotaoSalvarPerfil.png"));
    Usuario usuario = new Usuario("", "", "", "");
    int posUsuario;
    
    private BackgroundMusic backgroundMusic;
    Icon iconeSom = new ImageIcon(getClass().getResource("/imagens/iconeSom.png"));
    Icon iconeSomMutado = new ImageIcon(getClass().getResource("/imagens/iconeSomMutado.png"));
    boolean musicaOn = true;
    
    public TelaPerfil(String email, BackgroundMusic bck, boolean mscOn) {
        initComponents();
        backgroundMusic = bck;
        
        musicaOn = mscOn;
        if (musicaOn) SOM.setIcon(iconeSom);
        else SOM.setIcon(iconeSomMutado);
        
        setarCursorTF();
        for (int i = 0; i < Janela.c.listaUsuarios.size(); i++) {
            if (email.equals(Janela.c.listaUsuarios.get(i).getEmail()) ) {
                usuario = Janela.c.listaUsuarios.get(i);
                posUsuario = i;
                break;
            }
        }
        setarBotaoPainel();
        desabilitarEdicao();
        desabilitarPaineis();
        TA_Historico.setEditable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        BT_Esc = new javax.swing.JButton();
        BT_Historico = new javax.swing.JButton();
        BT_Informacoes = new javax.swing.JButton();
        PainelVariarHistorico = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_Historico = new javax.swing.JTextArea();
        PainelVariarInfo = new javax.swing.JPanel();
        LB_Nome = new javax.swing.JLabel();
        TF_Nome = new javax.swing.JTextField();
        LB_Email = new javax.swing.JLabel();
        TF_Email = new javax.swing.JTextField();
        LB_Contato = new javax.swing.JLabel();
        TF_Contato = new javax.swing.JTextField();
        LB_Contato1 = new javax.swing.JLabel();
        TF_Senha = new javax.swing.JTextField();
        BT_Salvar = new javax.swing.JButton();
        BT_Editar = new javax.swing.JButton();
        PainelFotoHistorico = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PainelFotoInfo = new javax.swing.JPanel();
        LB_FotoUsuario = new javax.swing.JLabel();
        BT_Sair = new javax.swing.JButton();
        LB_Conta = new javax.swing.JLabel();
        SOM = new javax.swing.JLabel();
        WallPaper = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BT_Esc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_EscMouseClicked(evt);
            }
        });
        add(BT_Esc, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 60, 40));

        BT_Historico.setBackground(new java.awt.Color(51, 51, 51));
        BT_Historico.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        BT_Historico.setForeground(new java.awt.Color(255, 255, 255));
        BT_Historico.setText("Histórico Partidas");
        BT_Historico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_HistoricoMouseClicked(evt);
            }
        });
        add(BT_Historico, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 240, 50));

        BT_Informacoes.setBackground(new java.awt.Color(51, 51, 51));
        BT_Informacoes.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        BT_Informacoes.setForeground(new java.awt.Color(255, 255, 255));
        BT_Informacoes.setText("Informações Conta");
        BT_Informacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_InformacoesMouseClicked(evt);
            }
        });
        add(BT_Informacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 240, 50));

        PainelVariarHistorico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PainelVariarHistorico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Histórico:");
        PainelVariarHistorico.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        TA_Historico.setBackground(new java.awt.Color(51, 51, 51));
        TA_Historico.setColumns(20);
        TA_Historico.setForeground(new java.awt.Color(255, 255, 255));
        TA_Historico.setRows(5);
        TA_Historico.setText("-");
        jScrollPane1.setViewportView(TA_Historico);

        PainelVariarHistorico.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, 230));

        add(PainelVariarHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 330, 310));

        PainelVariarInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PainelVariarInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_Nome.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        LB_Nome.setForeground(new java.awt.Color(255, 255, 255));
        LB_Nome.setText("Nome:");
        PainelVariarInfo.add(LB_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 30));

        TF_Nome.setBackground(new java.awt.Color(51, 51, 51));
        TF_Nome.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        TF_Nome.setForeground(new java.awt.Color(255, 255, 255));
        PainelVariarInfo.add(TF_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, 30));

        LB_Email.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        LB_Email.setForeground(new java.awt.Color(255, 255, 255));
        LB_Email.setText("Email:");
        PainelVariarInfo.add(LB_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, 30));

        TF_Email.setBackground(new java.awt.Color(51, 51, 51));
        TF_Email.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        TF_Email.setForeground(new java.awt.Color(255, 255, 255));
        PainelVariarInfo.add(TF_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 310, 30));

        LB_Contato.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        LB_Contato.setForeground(new java.awt.Color(255, 255, 255));
        LB_Contato.setText("Contato:");
        PainelVariarInfo.add(LB_Contato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        TF_Contato.setBackground(new java.awt.Color(51, 51, 51));
        TF_Contato.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        TF_Contato.setForeground(new java.awt.Color(255, 255, 255));
        PainelVariarInfo.add(TF_Contato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 310, 30));

        LB_Contato1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        LB_Contato1.setForeground(new java.awt.Color(255, 255, 255));
        LB_Contato1.setText("Senha:");
        PainelVariarInfo.add(LB_Contato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 30));

        TF_Senha.setBackground(new java.awt.Color(51, 51, 51));
        TF_Senha.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        TF_Senha.setForeground(new java.awt.Color(255, 255, 255));
        PainelVariarInfo.add(TF_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 310, 30));

        BT_Salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_SalvarMouseClicked(evt);
            }
        });
        PainelVariarInfo.add(BT_Salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 120, 40));

        BT_Editar.setBackground(new java.awt.Color(102, 102, 102));
        BT_Editar.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        BT_Editar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Editar.setText("EDITAR");
        BT_Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_EditarMouseClicked(evt);
            }
        });
        PainelVariarInfo.add(BT_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 267, 90, 30));

        add(PainelVariarInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 330, 310));

        PainelFotoHistorico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PainelFotoHistorico.setForeground(new java.awt.Color(51, 51, 55));
        PainelFotoHistorico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FotoPodio.png"))); // NOI18N
        PainelFotoHistorico.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(PainelFotoHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 50, 50));

        PainelFotoInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PainelFotoInfo.setForeground(new java.awt.Color(51, 51, 55));
        PainelFotoInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_FotoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FotoUsuario.png"))); // NOI18N
        PainelFotoInfo.add(LB_FotoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(PainelFotoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 50, 50));

        BT_Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_SairMouseClicked(evt);
            }
        });
        add(BT_Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 210, 60));

        LB_Conta.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_Conta.setForeground(new java.awt.Color(255, 255, 255));
        LB_Conta.setText("Conta");
        add(LB_Conta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 80, 30));

        SOM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SOMMouseClicked(evt);
            }
        });
        add(SOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 90, 60));

        WallPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/WallPaperPerfil.png"))); // NOI18N
        add(WallPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void setarCursorTF(){
        TF_Nome.setCaretColor(new Color(0, 153,0));
        TF_Email.setCaretColor(new Color(0, 153,0));
        TF_Contato.setCaretColor(new Color(0, 153,0));
        TF_Senha.setCaretColor(new Color(0, 153,0));
    }
    
    public void setarBotaoPainel(){
        BT_Esc.setBackground( new Color(0,0,0, 90));
        BT_Esc.setBorderPainted(false);
        BT_Esc.setContentAreaFilled(false);
        BT_Esc.setFocusPainted(false);
        BT_Esc.setIcon(imagemEsc);
        BT_Sair.setBackground( new Color(0,0,0, 90));
        BT_Sair.setBorderPainted(false);
        BT_Sair.setContentAreaFilled(false);
        BT_Sair.setFocusPainted(false);
        BT_Sair.setIcon(imagemSair);
        BT_Salvar.setBackground( new Color(0,0,0, 90));
        BT_Salvar.setBorderPainted(false);
        BT_Salvar.setContentAreaFilled(false);
        BT_Salvar.setFocusPainted(false);
        BT_Salvar.setIcon(imagemSalvar);
        PainelFotoInfo.setBackground(new Color(55, 55, 55));
        PainelFotoHistorico.setBackground(new Color(55, 55, 55));
        PainelVariarInfo.setBackground(new Color(55, 55, 55));
        PainelVariarHistorico.setBackground(new Color(55, 55, 55));
    }
    
    public void desabilitarEdicao(){
        TF_Nome.setEditable(false);
        TF_Email.setEditable(false);
        TF_Contato.setEditable(false);
        TF_Senha.setEditable(false);
        BT_Salvar.setEnabled(false);
    }
    public void habilitarEdicao(){
        TF_Nome.setEditable(true);
        TF_Email.setEditable(true);
        TF_Contato.setEditable(true);
        TF_Senha.setEditable(true);
        BT_Salvar.setEnabled(true);
    }
    public void desabilitarPaineis(){
        PainelVariarInfo.setVisible(false);
        PainelVariarHistorico.setVisible(false);
    }
    
    private void BT_EscMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EscMouseClicked
        if (SOM.getIcon() == iconeSomMutado)
            musicaOn = false;
        else
            musicaOn = true;
        
        Janela.telaD = new TelaApresentacao(usuario.getEmail(), backgroundMusic, musicaOn);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaG);
        janela.getContentPane().remove(Janela.telaG);
        janela.add(Janela.telaD, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_BT_EscMouseClicked

    private void BT_SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_SairMouseClicked
        Janela.telaA = new TelaInicial(backgroundMusic);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaG);
        janela.getContentPane().remove(Janela.telaG);
        janela.add(Janela.telaA, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_BT_SairMouseClicked

    private void BT_EditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EditarMouseClicked
        habilitarEdicao();
    }//GEN-LAST:event_BT_EditarMouseClicked

    private void BT_InformacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_InformacoesMouseClicked
        TA_Historico.setText("");
        PainelVariarInfo.setVisible(true);
        PainelVariarHistorico.setVisible(false);
        TF_Nome.setText(usuario.getNome());
        TF_Email.setText(usuario.getEmail());
        TF_Contato.setText(usuario.getContato());
        TF_Senha.setText(usuario.getSenha());
    }//GEN-LAST:event_BT_InformacoesMouseClicked

    private void BT_HistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_HistoricoMouseClicked
        TA_Historico.setText("");
        PainelVariarInfo.setVisible(false);
        PainelVariarHistorico.setVisible(true);                    
        TA_Historico.append(usuario.getHistorico());
    }//GEN-LAST:event_BT_HistoricoMouseClicked

    private void BT_SalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_SalvarMouseClicked
        String nome = TF_Nome.getText();
        String email = TF_Email.getText();
        String senha = TF_Senha.getText();
        String contato = TF_Contato.getText();
        try {
            if (nome.equals("") || nome.equals("Nome"))
                TF_Nome.setBorder(BorderFactory.createLineBorder(Color.RED));
            if (email.equals("") || email.equals("Email"))
                TF_Email.setBorder(BorderFactory.createLineBorder(Color.RED));
            if (senha.equals("") || senha.equals("Senha"))
                TF_Senha.setBorder(BorderFactory.createLineBorder(Color.RED));
            if (contato.equals("") || contato.equals("Contato"))
                TF_Contato.setBorder(BorderFactory.createLineBorder(Color.RED));
            if (nome.equals("") || nome.equals("Nome") || email.equals("") || email.equals("Email") 
            || senha.equals("") || senha.equals("Senha") || contato.equals("") || contato.equals("Contato"))
                throw new Exception("Você não pode deixar um campo vazio.");
            
            usuario.setNome(TF_Nome.getText());
            usuario.setEmail(TF_Email.getText());
            usuario.setContato(TF_Contato.getText());
            usuario.setSenha(TF_Senha.getText());
            Janela.c.listaUsuarios.set(posUsuario, usuario);

            LinkedList<Usuario> lUsuarios = Janela.c.listaUsuarios;
            String nomeArquivo = "loginUsuarios";
            try {
                FileOutputStream arquivo = new FileOutputStream(nomeArquivo);
                ObjectOutputStream out = new ObjectOutputStream(arquivo);
                
                out.writeObject(lUsuarios);
                out.close();
                arquivo.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro na serialização do objeto");
            }
        
            desabilitarEdicao();
            JOptionPane.showMessageDialog(null, "Alteração feita com sucesso");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }                    
    }//GEN-LAST:event_BT_SalvarMouseClicked

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
    private javax.swing.JButton BT_Editar;
    private javax.swing.JButton BT_Esc;
    private javax.swing.JButton BT_Historico;
    private javax.swing.JButton BT_Informacoes;
    private javax.swing.JButton BT_Sair;
    private javax.swing.JButton BT_Salvar;
    private javax.swing.JLabel LB_Conta;
    private javax.swing.JLabel LB_Contato;
    private javax.swing.JLabel LB_Contato1;
    private javax.swing.JLabel LB_Email;
    private javax.swing.JLabel LB_FotoUsuario;
    private javax.swing.JLabel LB_Nome;
    private javax.swing.JPanel PainelFotoHistorico;
    private javax.swing.JPanel PainelFotoInfo;
    private javax.swing.JPanel PainelVariarHistorico;
    private javax.swing.JPanel PainelVariarInfo;
    private javax.swing.JLabel SOM;
    private javax.swing.JTextArea TA_Historico;
    private javax.swing.JTextField TF_Contato;
    private javax.swing.JTextField TF_Email;
    private javax.swing.JTextField TF_Nome;
    private javax.swing.JTextField TF_Senha;
    private javax.swing.JLabel WallPaper;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
