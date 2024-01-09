package gerenciadordecampeonato;

import classes.BackgroundMusic;
import classes.Campeonato;
import classes.Usuario;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TelaLogin extends javax.swing.JPanel {
    private BackgroundMusic backgroundMusic;
    Icon iconeSom = new ImageIcon(getClass().getResource("/imagens/iconeSom.png"));
    Icon iconeSomMutado = new ImageIcon(getClass().getResource("/imagens/iconeSomMutado.png"));
    boolean musicaOn = true;
    
    public TelaLogin(BackgroundMusic bck, boolean mscOn) {
        initComponents();
        setarCursorTF();
        
        musicaOn = mscOn;
        if (musicaOn) SOM.setIcon(iconeSom);
        else SOM.setIcon(iconeSomMutado);
        
        backgroundMusic = bck;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BemVindo = new javax.swing.JLabel();
        TF_Email = new javax.swing.JTextField();
        TF_Senha = new javax.swing.JTextField();
        LB_CriarConta = new javax.swing.JLabel();
        BT_Entrar = new javax.swing.JButton();
        SOM = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BemVindo.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        BemVindo.setForeground(new java.awt.Color(255, 255, 255));
        BemVindo.setText("BEM VINDO CRAQUE!");
        add(BemVindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        TF_Email.setBackground(new java.awt.Color(51, 51, 51));
        TF_Email.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TF_Email.setForeground(new java.awt.Color(255, 255, 255));
        TF_Email.setText("Email");
        TF_Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TF_EmailMouseClicked(evt);
            }
        });
        add(TF_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 230, -1));

        TF_Senha.setBackground(new java.awt.Color(51, 51, 51));
        TF_Senha.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TF_Senha.setForeground(new java.awt.Color(255, 255, 255));
        TF_Senha.setText("Senha");
        TF_Senha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TF_SenhaMouseClicked(evt);
            }
        });
        add(TF_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 230, -1));

        LB_CriarConta.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        LB_CriarConta.setForeground(new java.awt.Color(0, 98, 63));
        LB_CriarConta.setText("Criar conta");
        LB_CriarConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_CriarContaMouseClicked(evt);
            }
        });
        add(LB_CriarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

        BT_Entrar.setBackground(new java.awt.Color(0, 98, 63));
        BT_Entrar.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        BT_Entrar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Entrar.setText("ENTRAR");
        BT_Entrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        BT_Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_EntrarMouseClicked(evt);
            }
        });
        add(BT_Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 140, 40));

        SOM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SOMMouseClicked(evt);
            }
        });
        add(SOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 90, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/WallPaperLogin.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void setarCursorTF(){
        TF_Email.setCaretColor(new Color(0, 153,0));
        TF_Senha.setCaretColor(new Color(0, 153,0));
    }
    
    private void LB_CriarContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_CriarContaMouseClicked
        if (SOM.getIcon() == iconeSomMutado)
                musicaOn = false;
        else
            musicaOn = true;
        Janela.telaB = new TelaCadastro(backgroundMusic, musicaOn);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaC);
        janela.getContentPane().remove(Janela.telaC);
        janela.add(Janela.telaB, BorderLayout.CENTER);
        janela.pack();               
    }//GEN-LAST:event_LB_CriarContaMouseClicked

    private void BT_EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_EntrarMouseClicked
        String email = TF_Email.getText();
        String senha = TF_Senha.getText();
        boolean achouUsuario = false;
        boolean senhaIncompativel = true;
        try {
            if (email.equals("") || email.equals("Email"))
            TF_Email.setBorder(BorderFactory.createLineBorder(Color.RED));
            if (senha.equals("") || senha.equals("Senha"))
            TF_Senha.setBorder(BorderFactory.createLineBorder(Color.RED));
            if (email.equals("") || email.equals("Email")
             || senha.equals("") || senha.equals("Senha")) {
                throw new Exception("Preencha os campos necessários.");
            }
            
            for (int i = 0; i < Janela.c.listaUsuarios.size(); i++) {
                if (email.equals(Janela.c.listaUsuarios.get(i).getEmail())) {
                    achouUsuario = true;
                    if (senha.equals(Janela.c.listaUsuarios.get(i).getSenha())) {
                        senhaIncompativel = false;
                        
                        Usuario user = new Usuario("", "", "", "");
                        if (SOM.getIcon() == iconeSomMutado)
                            musicaOn = false;
                        else
                            musicaOn = true;
                        Janela.telaD = new TelaApresentacao(email, backgroundMusic, musicaOn);
                        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaC);
                        janela.getContentPane().remove(Janela.telaC);
                        janela.add(Janela.telaD, BorderLayout.CENTER);
                        janela.pack();
                    }
                    if (senhaIncompativel) {
                        throw new Exception("Usuário ou senha incorreto");
                    }
                }
            }
            if (achouUsuario == false) {
                throw new Exception("Esse email não está logado no nosso banco de dados. \nFavor ir para a página de cadastro.");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BT_EntrarMouseClicked

    private void TF_EmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_EmailMouseClicked
       TF_Email.setText("");
    }//GEN-LAST:event_TF_EmailMouseClicked
    private void TF_SenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_SenhaMouseClicked
        TF_Senha.setText("");
    }//GEN-LAST:event_TF_SenhaMouseClicked

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
    private javax.swing.JLabel BemVindo;
    private javax.swing.JLabel LB_CriarConta;
    private javax.swing.JLabel SOM;
    private javax.swing.JTextField TF_Email;
    private javax.swing.JTextField TF_Senha;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
