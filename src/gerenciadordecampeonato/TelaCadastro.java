package gerenciadordecampeonato;

import classes.BackgroundMusic;
import classes.Usuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TelaCadastro extends javax.swing.JPanel {

    private BackgroundMusic backgroundMusic;
    Icon iconeSom = new ImageIcon(getClass().getResource("/imagens/iconeSom.png"));
    Icon iconeSomMutado = new ImageIcon(getClass().getResource("/imagens/iconeSomMutado.png"));
    boolean musicaOn = true;

    public TelaCadastro(BackgroundMusic backgroundMusic, boolean mscOn) {
        initComponents();
        this.backgroundMusic = backgroundMusic;
        musicaOn = mscOn;
        if (musicaOn) {
            SOM.setIcon(iconeSom);
        } else {
            SOM.setIcon(iconeSomMutado);
        }
        setarCursorTF();
        PainelCadastro.setBackground(new Color(0, 98, 63, 90));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SOM = new javax.swing.JLabel();
        PainelCadastro = new javax.swing.JPanel();
        TF_Email = new javax.swing.JTextField();
        TF_Nome = new javax.swing.JTextField();
        TF_Senha = new javax.swing.JTextField();
        BT_Cadastrar = new javax.swing.JButton();
        LB_TemConta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TF_Contato = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SOM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SOMMouseClicked(evt);
            }
        });
        add(SOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 90, 50));

        PainelCadastro.setBackground(new java.awt.Color(153, 153, 153));
        PainelCadastro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TF_Email.setBackground(new java.awt.Color(51, 51, 51));
        TF_Email.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Email.setForeground(new java.awt.Color(255, 255, 255));
        TF_Email.setText("Email");
        TF_Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TF_EmailMouseClicked(evt);
            }
        });

        TF_Nome.setBackground(new java.awt.Color(51, 51, 51));
        TF_Nome.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Nome.setForeground(new java.awt.Color(255, 255, 255));
        TF_Nome.setText("Nome");
        TF_Nome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TF_NomeMouseClicked(evt);
            }
        });
        TF_Nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_NomeKeyPressed(evt);
            }
        });

        TF_Senha.setBackground(new java.awt.Color(51, 51, 51));
        TF_Senha.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Senha.setForeground(new java.awt.Color(255, 255, 255));
        TF_Senha.setText("Senha");
        TF_Senha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TF_SenhaMouseClicked(evt);
            }
        });

        BT_Cadastrar.setBackground(new java.awt.Color(0, 98, 63));
        BT_Cadastrar.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        BT_Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Cadastrar.setText("CADASTRAR");
        BT_Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_CadastrarMouseClicked(evt);
            }
        });

        LB_TemConta.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        LB_TemConta.setForeground(new java.awt.Color(0, 98, 63));
        LB_TemConta.setText("Tenho uma conta");
        LB_TemConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_TemContaMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VAMOS CRIAR SUA CONTA?");

        TF_Contato.setBackground(new java.awt.Color(51, 51, 51));
        TF_Contato.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Contato.setForeground(new java.awt.Color(255, 255, 255));
        TF_Contato.setText("Contato");
        TF_Contato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TF_ContatoMouseClicked(evt);
            }
        });
        TF_Contato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_ContatoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout PainelCadastroLayout = new javax.swing.GroupLayout(PainelCadastro);
        PainelCadastro.setLayout(PainelCadastroLayout);
        PainelCadastroLayout.setHorizontalGroup(
            PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addGap(0, 59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LB_TemConta)
                    .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BT_Cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                        .addComponent(TF_Nome)
                        .addComponent(TF_Email)
                        .addComponent(TF_Senha, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TF_Contato)))
                .addGap(33, 33, 33))
        );
        PainelCadastroLayout.setVerticalGroup(
            PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(37, 37, 37)
                .addComponent(TF_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(TF_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(TF_Contato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(TF_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LB_TemConta)
                .addGap(18, 18, 18)
                .addComponent(BT_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        add(PainelCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 420, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 490, 590));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/WallPaperCadastro.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void setarCursorTF() {
        TF_Nome.setCaretColor(new Color(0, 153, 0));
        TF_Email.setCaretColor(new Color(0, 153, 0));
        TF_Contato.setCaretColor(new Color(0, 153, 0));
        TF_Senha.setCaretColor(new Color(0, 153, 0));
    }

    private void LB_TemContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_TemContaMouseClicked
        if (SOM.getIcon() == iconeSomMutado) {
            musicaOn = false;
        } else {
            musicaOn = true;
        }
        Janela.telaC = new TelaLogin(backgroundMusic, musicaOn);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaB);
        janela.getContentPane().remove(Janela.telaB);
        janela.add(Janela.telaC, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_TemContaMouseClicked

    private void BT_CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CadastrarMouseClicked
        resetarTextFields();
        String nome = TF_Nome.getText();
        String email = TF_Email.getText();
        String senha = TF_Senha.getText();
        String contato = TF_Contato.getText();
        try {
            if (nome.equals("") || nome.equals("Nome")) {
                TF_Nome.setBorder(BorderFactory.createLineBorder(Color.RED));
            }
            if (email.equals("") || email.equals("Email")) {
                TF_Email.setBorder(BorderFactory.createLineBorder(Color.RED));
            }
            if (senha.equals("") || senha.equals("Senha")) {
                TF_Senha.setBorder(BorderFactory.createLineBorder(Color.RED));
            }
            if (contato.equals("") || contato.equals("Contato")) {
                TF_Contato.setBorder(BorderFactory.createLineBorder(Color.RED));
            }
            if (nome.equals("") || nome.equals("Nome") || email.equals("") || email.equals("Email")
                    || senha.equals("") || senha.equals("Senha") || contato.equals("") || contato.equals("Contato")) {
                throw new Exception("Preencha os campos necessários");
            }

            Usuario user = new Usuario(nome, email, senha, contato);
            Janela.c.listaUsuarios.add(user);

            String nomeArquivo = "loginUsuarios";
            try {
                FileOutputStream arquivo1 = new FileOutputStream(nomeArquivo);
                ObjectOutputStream out1 = new ObjectOutputStream(arquivo1);

                out1.writeObject(Janela.c.listaUsuarios);
                out1.close();
                arquivo1.close();

            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro na serialização do objeto");
            }

            if (SOM.getIcon() == iconeSomMutado) {
                musicaOn = false;
            } else {
                musicaOn = true;
            }
            Janela.telaD = new TelaApresentacao(email, backgroundMusic, musicaOn);
            JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaB);
            janela.getContentPane().remove(Janela.telaB);
            janela.add(Janela.telaD, BorderLayout.CENTER);
            janela.pack();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_BT_CadastrarMouseClicked

    private void TF_NomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_NomeMouseClicked
        TF_Nome.setText("");
    }//GEN-LAST:event_TF_NomeMouseClicked
    private void TF_EmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_EmailMouseClicked
        TF_Email.setText("");
    }//GEN-LAST:event_TF_EmailMouseClicked
    private void TF_ContatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_ContatoMouseClicked
        TF_Contato.setText("");
    }//GEN-LAST:event_TF_ContatoMouseClicked
    private void TF_SenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_SenhaMouseClicked
        TF_Senha.setText("");
    }//GEN-LAST:event_TF_SenhaMouseClicked

    private void TF_NomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_NomeKeyPressed
        char c = evt.getKeyChar();
        int keyCode = evt.getKeyCode();

        if (keyCode == KeyEvent.VK_SPACE || keyCode == KeyEvent.VK_BACK_SPACE) {
            TF_Nome.setEditable(true);
        } else if (Character.isLetter(c)) {
            TF_Nome.setEditable(true);
        } else {
            TF_Nome.setEditable(false);
        }
    }//GEN-LAST:event_TF_NomeKeyPressed

    private void TF_ContatoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_ContatoKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            TF_Contato.setEditable(false);
        } else {
            TF_Contato.setEditable(true);
        }

    }//GEN-LAST:event_TF_ContatoKeyPressed

    private void SOMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SOMMouseClicked
        if (SOM.getIcon() == iconeSom) {
            backgroundMusic.mute();
            SOM.setIcon(iconeSomMutado);
        } else {
            backgroundMusic.mute();
            SOM.setIcon(iconeSom);
        }
    }//GEN-LAST:event_SOMMouseClicked

    private void resetarTextFields() {
        TF_Nome.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        TF_Email.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        TF_Senha.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        TF_Contato.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Cadastrar;
    private javax.swing.JLabel LB_TemConta;
    private javax.swing.JPanel PainelCadastro;
    private javax.swing.JLabel SOM;
    private javax.swing.JTextField TF_Contato;
    private javax.swing.JTextField TF_Email;
    private javax.swing.JTextField TF_Nome;
    private javax.swing.JTextField TF_Senha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
