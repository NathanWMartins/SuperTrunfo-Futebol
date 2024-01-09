package gerenciadordecampeonato;

import classes.BackgroundMusic;
import classes.Jogador;
import classes.Usuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import static java.lang.Thread.sleep;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TelaJogo extends javax.swing.JPanel {

    Usuario user = new Usuario("", "", "", "");

    //verifica se os botoes podem executar
    boolean podeExecutar1 = true, podeExecutar2 = true, podeExecutar3 = true, podeExecutar4 = true;

    Icon CartaMaquina = new ImageIcon(getClass().getResource("/cartas/CartaMaquina.png"));
    Icon CartaSelecionadaPlayer;
    String cartaPlayer = "", cartaMaquina = "";
    int yCPlayer, xCPlayer, yCMaquina, xCMaquina;

    //jogadores selecionados pela maquina e players
    Jogador jMaq = new Jogador("", 0, 0, 0, 0, 0, 0, CartaMaquina);
    Jogador jPlayer = new Jogador("", 0, 0, 0, 0, 0, 0, CartaMaquina);

    LinkedList<Icon> listaCartas = new LinkedList<>();
    int cont = 0, pontuacaoMaq = 0, pontuacaoPlayer = 0;
    int posUsuario = 0;

    private BackgroundMusic backgroundMusic;
    Icon iconeSom = new ImageIcon(getClass().getResource("/imagens/iconeSom.png"));
    Icon iconeSomMutado = new ImageIcon(getClass().getResource("/imagens/iconeSomMutado.png"));

    boolean musicaOn = true;

    public TelaJogo(Usuario usuario, BackgroundMusic bck, boolean mscOn) {
        initComponents();
        backgroundMusic = bck;

        musicaOn = mscOn;
        if (musicaOn) {
            SOM.setIcon(iconeSom);
        } else {
            SOM.setIcon(iconeSomMutado);
        }

        JOptionPane.showMessageDialog(null, "SIGA OS COMANDOS NA TEXT AREA NA ESQUERDA DA TELA");

        user = usuario;
        for (int i = 0; i < Janela.c.listaUsuarios.size(); i++) {
            if (user.getEmail().equals(Janela.c.listaUsuarios.get(i).getEmail())) {
                usuario = Janela.c.listaUsuarios.get(i);
                posUsuario = i;
                break;
            }
        }

        setarBackgrounds();
        Icons();
        DistribuirCartas();
        esconderRadioButtons();
        BT_Voltar.setVisible(false);
        BT_Voltar.setEnabled(false);
    }

    public void setarBackgrounds() {
        //nome do player
        String[] nome = user.getNome().split(" ");
        LB_NomePlayer.setText(nome[0]);

        //arrumar cartas maquina           
        CartaMaquina1.setIcon(CartaMaquina);
        CartaMaquina2.setIcon(CartaMaquina);
        CartaMaquina3.setIcon(CartaMaquina);
        CartaMaquina4.setIcon(CartaMaquina);

    }

    public void esconderRadioButtons() {
        RB_Pace.setVisible(false);
        RB_Chute.setVisible(false);
        RB_Passe.setVisible(false);
        RB_Drible.setVisible(false);
        RB_Defesa.setVisible(false);
        RB_Fisico.setVisible(false);
    }

    public void aparecerRadioButtons() {
        RB_Pace.setVisible(true);
        RB_Chute.setVisible(true);
        RB_Passe.setVisible(true);
        RB_Drible.setVisible(true);
        RB_Defesa.setVisible(true);
        RB_Fisico.setVisible(true);
    }

    public void Icons() {
        Icon MessiIcon = new ImageIcon(getClass().getResource("/cartas/CartaMessi.png"));
        Jogador Messi = new Jogador("Messi", 83, 90, 92, 90, 33, 65, MessiIcon);
        Janela.c.listaJogadores.add(Messi);

        Icon NeymarIcon = new ImageIcon(getClass().getResource("/cartas/CartaNeymar.png"));
        Jogador Neymar = new Jogador("Neymar", 89, 85, 89, 93, 37, 61, NeymarIcon);
        Janela.c.listaJogadores.add(Neymar);

        Icon HallandIcon = new ImageIcon(getClass().getResource("/cartas/CartaHalland.png"));
        Jogador Halland = new Jogador("Halland", 90, 91, 65, 80, 49, 87, HallandIcon);
        Janela.c.listaJogadores.add(Halland);

        Icon MbappeIcon = new ImageIcon(getClass().getResource("/cartas/CartaMbappe.png"));
        Jogador Mbappe = new Jogador("Mbappe", 97, 87, 80, 91, 35, 76, MbappeIcon);
        Janela.c.listaJogadores.add(Mbappe);

        Icon SalahIcon = new ImageIcon(getClass().getResource("/cartas/CartaSalah.png"));
        Jogador Salah = new Jogador("Salah", 90, 89, 82, 90, 45, 73, SalahIcon);
        Janela.c.listaJogadores.add(Salah);

        Icon KaneIcon = new ImageIcon(getClass().getResource("/cartas/CartaKane.png"));
        Jogador Kane = new Jogador("Kane", 70, 91, 83, 83, 47, 83, KaneIcon);
        Janela.c.listaJogadores.add(Kane);

        Icon VanDijkIcon = new ImageIcon(getClass().getResource("/cartas/CartaVanDijk.png"));
        Jogador VanDijk = new Jogador("VanDijk", 78, 60, 71, 72, 91, 84, VanDijkIcon);
        Janela.c.listaJogadores.add(VanDijk);

        Icon RashFordIcon = new ImageIcon(getClass().getResource("/cartas/CartaRashFord.png"));
        Jogador RashFord = new Jogador("RashFord", 90, 82, 79, 84, 43, 73, RashFordIcon);
        Janela.c.listaJogadores.add(RashFord);

        Icon SilvaIcon = new ImageIcon(getClass().getResource("/cartas/CartaThiagoSilva.png"));
        Jogador Silva = new Jogador("Silva", 59, 54, 62, 72, 86, 78, SilvaIcon);
        Janela.c.listaJogadores.add(Silva);

        Icon HavertzIcon = new ImageIcon(getClass().getResource("/cartas/CartaHavertz.png"));
        Jogador Havertz = new Jogador("Havertz", 81, 79, 79, 84, 45, 66, HavertzIcon);
        Janela.c.listaJogadores.add(Havertz);

        Icon LewaIcon = new ImageIcon(getClass().getResource("/cartas/CartaLewa.png"));
        Jogador Lewa = new Jogador("Lewandowski", 75, 91, 79, 86, 44, 83, LewaIcon);
        Janela.c.listaJogadores.add(Lewa);

        Icon BenzemaIcon = new ImageIcon(getClass().getResource("/cartas/CartaBenzema.png"));
        Jogador Benzema = new Jogador("Benzema", 80, 90, 83, 87, 39, 78, BenzemaIcon);
        Janela.c.listaJogadores.add(Benzema);

        Icon ViniIcon = new ImageIcon(getClass().getResource("/cartas/CartaVini.png"));
        Jogador Vini = new Jogador("Vinicius", 95, 81, 77, 92, 27, 68, ViniIcon);
        Janela.c.listaJogadores.add(Vini);

        Icon ModricIcon = new ImageIcon(getClass().getResource("/cartas/CartaModric.png"));
        Jogador Modric = new Jogador("Modric", 73, 76, 89, 88, 71, 66, ModricIcon);
        Janela.c.listaJogadores.add(Modric);

        Icon GriezmannIcon = new ImageIcon(getClass().getResource("/cartas/CartaGriezmann.png"));
        Jogador Griezmann = new Jogador("Griezmann", 79, 85, 84, 88, 57, 66, GriezmannIcon);
        Janela.c.listaJogadores.add(Griezmann);

        Icon PedriIcon = new ImageIcon(getClass().getResource("/cartas/CartaPedri.png"));
        Jogador Pedri = new Jogador("Pedri", 80, 69, 83, 88, 69, 74, PedriIcon);
        Janela.c.listaJogadores.add(Pedri);

        Icon KimmichIcon = new ImageIcon(getClass().getResource("/cartas/CartaKimmich.png"));
        Jogador Kimmich = new Jogador("Kimmich", 71, 71, 86, 84, 81, 79, KimmichIcon);
        Janela.c.listaJogadores.add(Kimmich);

        Icon BellinghamIcon = new ImageIcon(getClass().getResource("/cartas/CartaBellingham.png"));
        Jogador Bellingham = new Jogador("Bellingham", 80, 79, 84, 85, 79, 82, BellinghamIcon);
        Janela.c.listaJogadores.add(Bellingham);

        Icon SaneIcon = new ImageIcon(getClass().getResource("/cartas/CartaSane.png"));
        Jogador Sane = new Jogador("Sane", 90, 81, 79, 85, 38, 68, SaneIcon);
        Janela.c.listaJogadores.add(Sane);

        Icon LukakuIcon = new ImageIcon(getClass().getResource("/cartas/CartaLukaku.png"));
        Jogador Lukaku = new Jogador("Lukaku", 84, 87, 79, 88, 39, 83, LukakuIcon);
        Janela.c.listaJogadores.add(Lukaku);

        Icon RafaelIcon = new ImageIcon(getClass().getResource("/cartas/CartaRafael.png"));
        Jogador Rafael = new Jogador("Rafael", 91, 79, 76, 88, 27, 74, RafaelIcon);
        Janela.c.listaJogadores.add(Rafael);

        Icon KvaraIcon = new ImageIcon(getClass().getResource("/cartas/CartaKvara.png"));
        Jogador Kvara = new Jogador("Kvara", 90, 80, 83, 88, 40, 78, KvaraIcon);
        Janela.c.listaJogadores.add(Kvara);

        Icon ChiesaIcon = new ImageIcon(getClass().getResource("/cartas/CartaChiesa.png"));
        Jogador Chiesa = new Jogador("Chiesa", 91, 81, 76, 86, 48, 73, ChiesaIcon);
        Janela.c.listaJogadores.add(Chiesa);

        Icon LautaroIcon = new ImageIcon(getClass().getResource("/cartas/CartaLautaro.png"));
        Jogador Lautaro = new Jogador("Lautaro", 84, 82, 74, 85, 48, 83, LautaroIcon);
        Janela.c.listaJogadores.add(Lautaro);

        Icon TottiIcon = new ImageIcon(getClass().getResource("/cartas/CartaTotti.png"));
        Jogador Totti = new Jogador("Totti", 99, 99, 99, 99, 99, 99, TottiIcon);
        Janela.c.listaJogadores.add(Totti);
    }

    public void DistribuirCartas() {
        for (int i = 0; i < Janela.c.listaJogadores.size(); i++) {
            listaCartas.add(Janela.c.listaJogadores.get(i).getCarta());
        }

        //gera um numero aleatorio para buscar na lista de cartas
        Random random = new Random();
        int n = random.nextInt(listaCartas.size());
        CartaIcon1.setIcon(Janela.c.listaJogadores.get(n).getCarta());
        listaCartas.remove(n);

        n = random.nextInt(listaCartas.size());
        CartaIcon2.setIcon(listaCartas.get(n));
        listaCartas.remove(n);

        n = random.nextInt(listaCartas.size());
        CartaIcon3.setIcon(listaCartas.get(n));
        listaCartas.remove(n);

        n = random.nextInt(listaCartas.size());
        CartaIcon4.setIcon(listaCartas.get(n));
        listaCartas.remove(n);
    }

    public void desabilitarBotoes() {
        podeExecutar1 = false;
        podeExecutar2 = false;
        podeExecutar3 = false;
        podeExecutar4 = false;
    }

    public void habilitarBotoes() {
        podeExecutar1 = true;
        podeExecutar2 = true;
        podeExecutar3 = true;
        podeExecutar4 = true;
        RB_Pace.setSelected(false);
        RB_Chute.setSelected(false);
        RB_Passe.setSelected(false);
        RB_Drible.setSelected(false);
        RB_Defesa.setSelected(false);
        RB_Fisico.setSelected(false);
        RB_Pace.setEnabled(true);
        RB_Chute.setEnabled(true);
        RB_Passe.setEnabled(true);
        RB_Drible.setEnabled(true);
        RB_Defesa.setEnabled(true);
        RB_Fisico.setEnabled(true);
    }

    public void RoundMaquina() {
        String maiorAt = ""; // string para achar o maior atribut0
        int maiorAtValMaq = 0;

        Icon iconMaq = null;
        Random random = new Random();
        int n = random.nextInt(listaCartas.size());

        //verifica o contador pra saber qual carta pegar da maquina
        if (cont == 1) {
            CartaMaquina2.setIcon(listaCartas.get(n));
            listaCartas.remove(n);
            iconMaq = CartaMaquina2.getIcon();
        } else if (cont == 3) {
            CartaMaquina4.setIcon(listaCartas.get(n));
            listaCartas.remove(n);
            iconMaq = CartaMaquina3.getIcon();
        }

        //acha o objeto jogador atraves do Icon
        for (Jogador j : Janela.c.listaJogadores) {
            if (j.getCarta() == iconMaq) {
                jMaq = j;
                break;
            }
        }

        //pega o atributo que contem o maior numero
        if (maiorAtValMaq < jMaq.getPace()) {
            maiorAt = "pace";
            maiorAtValMaq = jMaq.getPace();
        }
        if (maiorAtValMaq < jMaq.getChute()) {
            maiorAt = "chute";
            maiorAtValMaq = jMaq.getChute();
        }
        if (maiorAtValMaq < jMaq.getPasse()) {
            maiorAt = "passe";
            maiorAtValMaq = jMaq.getPasse();
        }
        if (maiorAtValMaq < jMaq.getDrible()) {
            maiorAt = "drible";
            maiorAtValMaq = jMaq.getDrible();
        }
        if (maiorAtValMaq < jMaq.getDefesa()) {
            maiorAt = "defesa";
            maiorAtValMaq = jMaq.getDefesa();
        }
        if (maiorAtValMaq < jMaq.getFisico()) {
            maiorAt = "fisico";
            maiorAtValMaq = jMaq.getFisico();
        }

        //pega os valores da carta do player
        int maiorAtValPlayer = 0;
        for (Jogador j : Janela.c.listaJogadores) {
            if (j.getCarta() == CartaSelecionadaPlayer) {
                jPlayer = j;
                if (maiorAt.equals("pace")) {
                    maiorAtValPlayer = jPlayer.getPace();
                } else if (maiorAt.equals("chute")) {
                    maiorAtValPlayer = jPlayer.getChute();
                } else if (maiorAt.equals("passe")) {
                    maiorAtValPlayer = jPlayer.getPasse();
                } else if (maiorAt.equals("drible")) {
                    maiorAtValPlayer = jPlayer.getDrible();
                } else if (maiorAt.equals("defesa")) {
                    maiorAtValPlayer = jPlayer.getDefesa();
                } else {
                    maiorAtValPlayer = jPlayer.getFisico();
                }
                break;
            }
        }

        //compara o valor obtido da maquina com a carta
        if (maiorAtValMaq > maiorAtValPlayer) {
            pontuacaoMaq++;
            PontoMaquina.setText(String.valueOf(pontuacaoMaq));
            if (pontuacaoMaq == 2) {
                LB_Ajuda1.setText("FIM DE JOGO");
                LB_Ajuda1.setForeground(Color.red);
                LB_Ajuda2.setText("A MAQUINA GANHOU(" + maiorAt + ")");
                LB_Ajuda2.setForeground(Color.red);
                user.setHistorico(PontoMaquina.getText() + " X " + PontoPlayer.getText() + " -> DERROTA");
                Janela.c.listaUsuarios.set(posUsuario, user);
                acabouJogo();
            } else {
                LB_Ajuda1.setText("VITORIA DA MAQUINA");
                LB_Ajuda2.setText("MAQUINA ESCOLHEU: " + maiorAt.toUpperCase());
            }
        } else if (maiorAtValMaq < maiorAtValPlayer) {
            pontuacaoPlayer++;
            PontoPlayer.setText(String.valueOf(pontuacaoPlayer));
            if (pontuacaoPlayer == 2) {
                LB_Ajuda1.setText("FIM DE JOGO");
                LB_Ajuda2.setText("PARABÉNS VOCÊ GANHOU");
                user.setHistorico(PontoMaquina.getText() + " X " + PontoPlayer.getText() + " -> VITÓRIA");
                Janela.c.listaUsuarios.set(posUsuario, user);
                acabouJogo();
            } else {
                LB_Ajuda1.setText("VITORIA DO PLAYER");
                LB_Ajuda2.setText("MAQUINA ESCOLHEU: " + maiorAt.toUpperCase());
            }
        } else {
            LB_Ajuda1.setText("EMPATE");
            LB_Ajuda2.setText("");
        }
        cont++;
    }

    public void RoundPlayer() {
        //verifica se o player selecionou um RadioButton
        boolean naoSelecionouRB = true;
        String selecionado = "";
        try {
            if (RB_Pace.isSelected()) {
                naoSelecionouRB = false;
                selecionado = "pace";
            }
            if (RB_Chute.isSelected()) {
                naoSelecionouRB = false;
                selecionado = "chute";
            }
            if (RB_Passe.isSelected()) {
                naoSelecionouRB = false;
                selecionado = "passe";
            }
            if (RB_Drible.isSelected()) {
                naoSelecionouRB = false;
                selecionado = "drible";
            }
            if (RB_Defesa.isSelected()) {
                naoSelecionouRB = false;
                selecionado = "defesa";
            }
            if (RB_Fisico.isSelected()) {
                naoSelecionouRB = false;
                selecionado = "fisico";
            }
            if (naoSelecionouRB) {
                throw new Exception("Selecione um atributo para jogar");
            }

            //desabilita as opções desnecessarias
            BT_Jogar.setEnabled(false);
            desabilitarBotoes();
            esconderRadioButtons();

            Random random = new Random();
            Icon iconMaq = null;
            int n = random.nextInt(listaCartas.size());

            //verifica o contador para pegar a carta da maquina
            if (cont == 0) {
                CartaMaquina1.setIcon(listaCartas.get(n));
                listaCartas.remove(n);
                iconMaq = CartaMaquina1.getIcon();
            } else if (cont == 2) {
                CartaMaquina3.setIcon(listaCartas.get(n));
                listaCartas.remove(n);
                iconMaq = CartaMaquina3.getIcon();
            }

            int maiorAtValMaq = 0;
            int maiorAtPlayer = 0;
            boolean achouMaq = false, achouPlayer = false;

            //acha o jogador do player e da maquina
            for (Jogador j : Janela.c.listaJogadores) {
                if (j.getCarta() == iconMaq) {
                    jMaq = j;
                    achouMaq = true;
                }
                if (j.getCarta() == CartaSelecionadaPlayer) {
                    jPlayer = j;
                    achouPlayer = true;
                }
                //se achou os dois, break
                if (achouPlayer && achouMaq) {
                    break;
                }
            }
            //pega o valor do atributo selecionado pelo player
            if (selecionado.equals("pace")) {
                maiorAtValMaq = jMaq.getPace();
                maiorAtPlayer = jPlayer.getPace();
            } else if (selecionado.equals("chute")) {
                maiorAtValMaq = jMaq.getChute();
                maiorAtPlayer = jPlayer.getChute();
            } else if (selecionado.equals("passe")) {
                maiorAtValMaq = jMaq.getPasse();
                maiorAtPlayer = jPlayer.getPasse();
            } else if (selecionado.equals("drible")) {
                maiorAtValMaq = jMaq.getDrible();
                maiorAtPlayer = jPlayer.getDrible();
            } else if (selecionado.equals("defesa")) {
                maiorAtValMaq = jMaq.getDefesa();
                maiorAtPlayer = jPlayer.getDefesa();
            } else {
                maiorAtValMaq = jMaq.getFisico();
                maiorAtPlayer = jPlayer.getDefesa();
            }

            //compara o valor obtido da maquina com a carta
            if (maiorAtValMaq > maiorAtPlayer) {
                pontuacaoMaq++;
                PontoMaquina.setText(String.valueOf(pontuacaoMaq));
                if (pontuacaoMaq == 2) {
                    LB_Ajuda1.setText("FIM DE JOGO");
                    LB_Ajuda1.setForeground(Color.red);
                    LB_Ajuda2.setText("A MAQUINA GANHOU");
                    LB_Ajuda2.setForeground(Color.red);
                    user.setHistorico(PontoMaquina.getText() + " X " + PontoPlayer.getText() + " -> DERROTA");
                    Janela.c.listaUsuarios.set(posUsuario, user);
                    acabouJogo();
                } else {
                    LB_Ajuda1.setText("VITORIA DA MAQUINA");
                    LB_Ajuda2.setText("");
                }
            } else if (maiorAtValMaq < maiorAtPlayer) {
                pontuacaoPlayer++;
                PontoPlayer.setText(String.valueOf(pontuacaoPlayer));
                if (pontuacaoPlayer == 2) {
                    LB_Ajuda1.setText("FIM DE JOGO");
                    LB_Ajuda2.setText("PARABÉNS VOCÊ GANHOU");
                    user.setHistorico(PontoMaquina.getText() + " X " + PontoPlayer.getText() + " -> VITÓRIA");
                    Janela.c.listaUsuarios.set(posUsuario, user);
                    acabouJogo();
                } else {
                    LB_Ajuda1.setText("VITORIA DO PLAYER");
                    LB_Ajuda2.setText("");
                }
            } else {
                LB_Ajuda1.setText("EMPATE");
                LB_Ajuda2.setText("");
            }
            cont++;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void acabouJogo() {
        esconderRadioButtons();
        desabilitarBotoes();
        BT_ProxRound.setEnabled(false);
        BT_Jogar.setEnabled(false);
        BT_Voltar.setVisible(true);
        BT_Voltar.setEnabled(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BT_ProxRound = new javax.swing.JButton();
        BT_Voltar = new javax.swing.JButton();
        PN_AJUDA = new javax.swing.JPanel();
        LB_Ajuda1 = new javax.swing.JLabel();
        RB_Drible = new javax.swing.JRadioButton();
        RB_Defesa = new javax.swing.JRadioButton();
        RB_Fisico = new javax.swing.JRadioButton();
        RB_Pace = new javax.swing.JRadioButton();
        RB_Passe = new javax.swing.JRadioButton();
        RB_Chute = new javax.swing.JRadioButton();
        LB_Ajuda2 = new javax.swing.JLabel();
        BT_Jogar = new javax.swing.JButton();
        CartaIcon1 = new javax.swing.JLabel();
        CartaIcon2 = new javax.swing.JLabel();
        CartaIcon3 = new javax.swing.JLabel();
        CartaIcon4 = new javax.swing.JLabel();
        CartaMaquina1 = new javax.swing.JLabel();
        CartaMaquina2 = new javax.swing.JLabel();
        CartaMaquina3 = new javax.swing.JLabel();
        CartaMaquina4 = new javax.swing.JLabel();
        PainelPlacar = new javax.swing.JPanel();
        PontoMaquina = new javax.swing.JLabel();
        PontoPlayer = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SOM = new javax.swing.JLabel();
        LB_NomePlayer = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BT_ProxRound.setBackground(new java.awt.Color(0, 98, 63));
        BT_ProxRound.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        BT_ProxRound.setForeground(new java.awt.Color(255, 255, 255));
        BT_ProxRound.setText("Próxima Rodada");
        BT_ProxRound.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_ProxRoundMouseClicked(evt);
            }
        });
        add(BT_ProxRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, -1, -1));

        BT_Voltar.setBackground(new java.awt.Color(0, 98, 63));
        BT_Voltar.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        BT_Voltar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Voltar.setText("VOLTAR");
        BT_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_VoltarActionPerformed(evt);
            }
        });
        add(BT_Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, -1, -1));

        PN_AJUDA.setBackground(new java.awt.Color(51, 51, 51));
        PN_AJUDA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 98, 63), 2));
        PN_AJUDA.setForeground(new java.awt.Color(255, 255, 255));
        PN_AJUDA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_Ajuda1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        LB_Ajuda1.setForeground(new java.awt.Color(0, 98, 63));
        LB_Ajuda1.setText("ESCOLHA UMA CARTA");
        PN_AJUDA.add(LB_Ajuda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, -1));

        RB_Drible.setBackground(new java.awt.Color(51, 51, 51));
        RB_Drible.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        RB_Drible.setForeground(new java.awt.Color(255, 255, 255));
        RB_Drible.setText("DRIBLE");
        RB_Drible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_DribleMouseClicked(evt);
            }
        });
        PN_AJUDA.add(RB_Drible, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        RB_Defesa.setBackground(new java.awt.Color(51, 51, 51));
        RB_Defesa.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        RB_Defesa.setForeground(new java.awt.Color(255, 255, 255));
        RB_Defesa.setText("DEFESA");
        RB_Defesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_DefesaMouseClicked(evt);
            }
        });
        PN_AJUDA.add(RB_Defesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        RB_Fisico.setBackground(new java.awt.Color(51, 51, 51));
        RB_Fisico.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        RB_Fisico.setForeground(new java.awt.Color(255, 255, 255));
        RB_Fisico.setText("FÍSICO");
        RB_Fisico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_FisicoMouseClicked(evt);
            }
        });
        PN_AJUDA.add(RB_Fisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        RB_Pace.setBackground(new java.awt.Color(51, 51, 51));
        RB_Pace.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        RB_Pace.setForeground(new java.awt.Color(255, 255, 255));
        RB_Pace.setText("PACE");
        RB_Pace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_PaceMouseClicked(evt);
            }
        });
        PN_AJUDA.add(RB_Pace, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        RB_Passe.setBackground(new java.awt.Color(51, 51, 51));
        RB_Passe.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        RB_Passe.setForeground(new java.awt.Color(255, 255, 255));
        RB_Passe.setText("PASSE");
        RB_Passe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_PasseMouseClicked(evt);
            }
        });
        PN_AJUDA.add(RB_Passe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        RB_Chute.setBackground(new java.awt.Color(51, 51, 51));
        RB_Chute.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        RB_Chute.setForeground(new java.awt.Color(255, 255, 255));
        RB_Chute.setText("CHUTE");
        RB_Chute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_ChuteMouseClicked(evt);
            }
        });
        PN_AJUDA.add(RB_Chute, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        LB_Ajuda2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        LB_Ajuda2.setForeground(new java.awt.Color(0, 98, 63));
        LB_Ajuda2.setText("...");
        PN_AJUDA.add(LB_Ajuda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        BT_Jogar.setBackground(new java.awt.Color(0, 98, 63));
        BT_Jogar.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        BT_Jogar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Jogar.setText("JOGAR");
        BT_Jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_JogarActionPerformed(evt);
            }
        });
        PN_AJUDA.add(BT_Jogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        add(PN_AJUDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 280, 160));

        CartaIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CartaIcon1MouseClicked(evt);
            }
        });
        add(CartaIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 120, 180));

        CartaIcon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CartaIcon2MouseClicked(evt);
            }
        });
        add(CartaIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 120, 180));

        CartaIcon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CartaIcon3MouseClicked(evt);
            }
        });
        add(CartaIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 120, 180));

        CartaIcon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CartaIcon4MouseClicked(evt);
            }
        });
        add(CartaIcon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 120, 180));
        add(CartaMaquina1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 130, 180));
        add(CartaMaquina2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 130, 180));
        add(CartaMaquina3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 130, 180));
        add(CartaMaquina4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 130, 180));

        PainelPlacar.setBackground(new java.awt.Color(0, 98, 63));
        PainelPlacar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PontoMaquina.setFont(new java.awt.Font("Consolas", 1, 78)); // NOI18N
        PontoMaquina.setForeground(new java.awt.Color(51, 51, 51));
        PontoMaquina.setText("0");
        PainelPlacar.add(PontoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, 80));

        PontoPlayer.setFont(new java.awt.Font("Consolas", 1, 78)); // NOI18N
        PontoPlayer.setForeground(new java.awt.Color(51, 51, 51));
        PontoPlayer.setText("0");
        PainelPlacar.add(PontoPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 80));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 72)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText(":");
        PainelPlacar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, 70));

        add(PainelPlacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 210, 100));

        SOM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SOMMouseClicked(evt);
            }
        });
        add(SOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 90, 60));

        LB_NomePlayer.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_NomePlayer.setForeground(new java.awt.Color(255, 255, 255));
        LB_NomePlayer.setText("<PLAYER>");
        add(LB_NomePlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MÁQUINA");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/WallPaperJogo.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void RB_PaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_PaceMouseClicked
        if (RB_Pace.isSelected()) {
            RB_Chute.setEnabled(false);
            RB_Passe.setEnabled(false);
            RB_Drible.setEnabled(false);
            RB_Defesa.setEnabled(false);
            RB_Fisico.setEnabled(false);
        } else {
            RB_Chute.setEnabled(true);
            RB_Passe.setEnabled(true);
            RB_Drible.setEnabled(true);
            RB_Defesa.setEnabled(true);
            RB_Fisico.setEnabled(true);
        }
    }//GEN-LAST:event_RB_PaceMouseClicked

    private void RB_ChuteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_ChuteMouseClicked
        if (RB_Chute.isSelected()) {
            RB_Pace.setEnabled(false);
            RB_Passe.setEnabled(false);
            RB_Drible.setEnabled(false);
            RB_Defesa.setEnabled(false);
            RB_Fisico.setEnabled(false);
        } else {
            RB_Pace.setEnabled(true);
            RB_Passe.setEnabled(true);
            RB_Drible.setEnabled(true);
            RB_Defesa.setEnabled(true);
            RB_Fisico.setEnabled(true);
        }
    }//GEN-LAST:event_RB_ChuteMouseClicked

    private void RB_PasseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_PasseMouseClicked
        if (RB_Passe.isSelected()) {
            RB_Pace.setEnabled(false);
            RB_Chute.setEnabled(false);
            RB_Drible.setEnabled(false);
            RB_Defesa.setEnabled(false);
            RB_Fisico.setEnabled(false);
        } else {
            RB_Pace.setEnabled(true);
            RB_Chute.setEnabled(true);
            RB_Drible.setEnabled(true);
            RB_Defesa.setEnabled(true);
            RB_Fisico.setEnabled(true);
        }
    }//GEN-LAST:event_RB_PasseMouseClicked

    private void RB_DribleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_DribleMouseClicked
        if (RB_Drible.isSelected()) {
            RB_Pace.setEnabled(false);
            RB_Chute.setEnabled(false);
            RB_Passe.setEnabled(false);
            RB_Defesa.setEnabled(false);
            RB_Fisico.setEnabled(false);
        } else {
            RB_Pace.setEnabled(true);
            RB_Chute.setEnabled(true);
            RB_Passe.setEnabled(false);
            RB_Defesa.setEnabled(true);
            RB_Fisico.setEnabled(true);
        }
    }//GEN-LAST:event_RB_DribleMouseClicked

    private void RB_DefesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_DefesaMouseClicked
        if (RB_Defesa.isSelected()) {
            RB_Pace.setEnabled(false);
            RB_Chute.setEnabled(false);
            RB_Passe.setEnabled(false);
            RB_Drible.setEnabled(false);
            RB_Fisico.setEnabled(false);
        } else {
            RB_Pace.setEnabled(true);
            RB_Chute.setEnabled(true);
            RB_Passe.setEnabled(false);
            RB_Drible.setEnabled(true);
            RB_Fisico.setEnabled(true);
        }
    }//GEN-LAST:event_RB_DefesaMouseClicked

    private void RB_FisicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_FisicoMouseClicked
        if (RB_Fisico.isSelected()) {
            RB_Pace.setEnabled(false);
            RB_Chute.setEnabled(false);
            RB_Passe.setEnabled(false);
            RB_Drible.setEnabled(false);
            RB_Defesa.setEnabled(false);
        } else {
            RB_Pace.setEnabled(true);
            RB_Chute.setEnabled(true);
            RB_Passe.setEnabled(false);
            RB_Drible.setEnabled(true);
            RB_Defesa.setEnabled(true);
        }
    }//GEN-LAST:event_RB_FisicoMouseClicked

    private void BT_JogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_JogarActionPerformed
        RoundPlayer();
        //manter cartaS na posição
        new Thread() {
            public void run() {
                //MAQUINA:
                if (cartaMaquina.equals("CartaMaquina1")) {
                    CartaMaquina1.setLocation(xCMaquina, yCMaquina);
                } else if (cartaMaquina.equals("CartaMaquina2")) {
                    CartaMaquina2.setLocation(xCMaquina, yCMaquina);
                } else if (cartaMaquina.equals("CartaMaquina3")) {
                    CartaMaquina3.setLocation(xCMaquina, yCMaquina);
                } else {
                    CartaMaquina4.setLocation(xCMaquina, yCMaquina);
                }

                //PLAYER:
                if (cartaPlayer.equals("Carta1")) {
                    CartaIcon1.setLocation(xCPlayer, yCPlayer);
                } else if (cartaPlayer.equals("Carta2")) {
                    CartaIcon2.setLocation(xCPlayer, yCPlayer);
                } else if (cartaPlayer.equals("Carta3")) {
                    CartaIcon3.setLocation(xCPlayer, yCPlayer);
                } else {
                    CartaIcon4.setLocation(xCPlayer, yCPlayer);
                }
            }
        }.start();
    }//GEN-LAST:event_BT_JogarActionPerformed

    private void BT_ProxRoundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ProxRoundMouseClicked
        //habilita botoes necessarios
        habilitarBotoes();

        //ve a carta selecionada da maquina e tira ela do jogo
        if (cartaMaquina.equals("CartaMaquina1")) {
            CartaMaquina1.setIcon(null);
        } else if (cartaMaquina.equals("CartaMaquina2")) {
            CartaMaquina2.setIcon(null);
        } else if (cartaMaquina.equals("CartaMaquina3")) {
            CartaMaquina3.setIcon(null);
        } else {
            CartaMaquina4.setIcon(null);
        }

        //ve a carta selecionada do player e tira ela do jogo
        if (cartaPlayer.equals("Carta1")) {
            CartaIcon1.setIcon(null);
        } else if (cartaPlayer.equals("Carta2")) {
            CartaIcon2.setIcon(null);
        } else if (cartaPlayer.equals("Carta3")) {
            CartaIcon3.setIcon(null);
        } else {
            CartaIcon4.setIcon(null);
        }

        //ve se as cartas dos jogadores acabaram antes de alguem atingir 2 pontos
        if (CartaIcon1.getIcon() == null && CartaIcon2.getIcon() == null && CartaIcon3.getIcon() == null && CartaIcon4.getIcon() == null) {
            if (Integer.valueOf(PontoMaquina.getText()) > Integer.valueOf(PontoPlayer.getText())) {
                JOptionPane.showMessageDialog(null, "ACABARAM AS CARTAS");
                LB_Ajuda1.setText("FIM DE JOGO");
                LB_Ajuda1.setForeground(Color.red);
                LB_Ajuda2.setText("A MAQUINA GANHOU");
                LB_Ajuda2.setForeground(Color.red);
                user.setHistorico(PontoMaquina.getText() + " X " + PontoPlayer.getText() + " -> DERROTA");
                Janela.c.listaUsuarios.set(posUsuario, user);
            } else if (Integer.valueOf(PontoMaquina.getText()) < Integer.valueOf(PontoPlayer.getText())) {
                JOptionPane.showMessageDialog(null, "ACABARAM AS CARTAS");
                LB_Ajuda1.setText("FIM DE JOGO");
                LB_Ajuda2.setText("VOCÊ GANHOU");
                user.setHistorico(PontoMaquina.getText() + " X " + PontoPlayer.getText() + " -> VITÓRIA");
                Janela.c.listaUsuarios.set(posUsuario, user);
            } else {
                JOptionPane.showMessageDialog(null, "ACABARAM AS CARTAS");
                LB_Ajuda1.setText("FIM DE JOGO");
                LB_Ajuda2.setText("EMPATE");
                user.setHistorico(PontoMaquina.getText() + " X " + PontoPlayer.getText() + " -> EMPATE");
                Janela.c.listaUsuarios.set(posUsuario, user);
            }
            //finaliza o jogo
            acabouJogo();
        }

        BT_Jogar.setEnabled(true);
        LB_Ajuda1.setText("ESCOLHA UMA CARTA");
        if (cont % 2 == 1)
            LB_Ajuda2.setText("VEZ DA MÁQUINA");
        else
            LB_Ajuda2.setText("...");
    }//GEN-LAST:event_BT_ProxRoundMouseClicked

    private void BT_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_VoltarActionPerformed
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
        Janela.telaD = new TelaApresentacao(user.getEmail(), backgroundMusic, musicaOn);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaF);
        janela.getContentPane().remove(Janela.telaF);
        janela.add(Janela.telaD, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_BT_VoltarActionPerformed

    private void CartaIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartaIcon1MouseClicked
        if (podeExecutar1) {
            desabilitarBotoes();
            CartaSelecionadaPlayer = CartaIcon1.getIcon();

            //mexe a carta para a posição central
            mexerCarta(CartaIcon1.getX(), CartaIcon1.getY(), "Carta1");

            //verifica o contador para mexer a carta da maquina necessaria
            if (cont == 0) {
                mexerCartaMaquina(CartaMaquina1.getX(), CartaMaquina1.getY(), "CartaMaquina1");
            } else if (cont == 1) {
                mexerCartaMaquina(CartaMaquina2.getX(), CartaMaquina2.getY(), "CartaMaquina2");
            } else if (cont == 2) {
                mexerCartaMaquina(CartaMaquina3.getX(), CartaMaquina3.getY(), "CartaMaquina3");
            } else {
                mexerCartaMaquina(CartaMaquina4.getX(), CartaMaquina4.getY(), "CartaMaquina4");
            }

            LB_Ajuda1.setText("ESCOLHA UM ATRIBUTO");
            LB_Ajuda2.setText("DA SUA CARTA");

            //se contador for par, vez do player, caso contrario, vez da maquina
            if (cont % 2 == 0) {
                aparecerRadioButtons();
            } else {
                RoundMaquina();
            }
        }
    }//GEN-LAST:event_CartaIcon1MouseClicked

    private void CartaIcon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartaIcon2MouseClicked
        if (podeExecutar2) {
            desabilitarBotoes();
            CartaSelecionadaPlayer = CartaIcon2.getIcon();

            //mexe a carta para a posição central
            mexerCarta(CartaIcon2.getX(), CartaIcon2.getY(), "Carta2");

            //verifica o contador para mexer a carta da maquina necessaria
            if (cont == 0) {
                mexerCartaMaquina(CartaMaquina1.getX(), CartaMaquina1.getY(), "CartaMaquina1");
            } else if (cont == 1) {
                mexerCartaMaquina(CartaMaquina2.getX(), CartaMaquina2.getY(), "CartaMaquina2");
            } else if (cont == 2) {
                mexerCartaMaquina(CartaMaquina3.getX(), CartaMaquina3.getY(), "CartaMaquina3");
            } else {
                mexerCartaMaquina(CartaMaquina4.getX(), CartaMaquina4.getY(), "CartaMaquina4");
            }

            LB_Ajuda1.setText("ESCOLHA UM ATRIBUTO");
            LB_Ajuda2.setText("DA SUA CARTA");

            //se contador for par, vez do player, caso contrario, vez da maquina
            if (cont % 2 == 0) {
                aparecerRadioButtons();
            } else {
                RoundMaquina();
            }
        }
    }//GEN-LAST:event_CartaIcon2MouseClicked

    private void CartaIcon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartaIcon3MouseClicked
        if (podeExecutar3) {
            desabilitarBotoes();
            CartaSelecionadaPlayer = CartaIcon3.getIcon();

            //mexe a carta para a posição central
            mexerCarta(CartaIcon3.getX(), CartaIcon3.getY(), "Carta3");

            //verifica o contador para mexer a carta da maquina necessaria
            if (cont == 0) {
                mexerCartaMaquina(CartaMaquina1.getX(), CartaMaquina1.getY(), "CartaMaquina1");
            } else if (cont == 1) {
                mexerCartaMaquina(CartaMaquina2.getX(), CartaMaquina2.getY(), "CartaMaquina2");
            } else if (cont == 2) {
                mexerCartaMaquina(CartaMaquina3.getX(), CartaMaquina3.getY(), "CartaMaquina3");
            } else {
                mexerCartaMaquina(CartaMaquina4.getX(), CartaMaquina4.getY(), "CartaMaquina4");
            }

            LB_Ajuda1.setText("ESCOLHA UM ATRIBUTO");
            LB_Ajuda2.setText("DA SUA CARTA");

            //se contador for par, vez do player, caso contrario, vez da maquina
            if (cont % 2 == 0) {
                aparecerRadioButtons();
            } else {
                RoundMaquina();
            }
        }
    }//GEN-LAST:event_CartaIcon3MouseClicked

    private void CartaIcon4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartaIcon4MouseClicked
        if (podeExecutar4) {
            desabilitarBotoes();
            CartaSelecionadaPlayer = CartaIcon4.getIcon();

            //mexe a carta para a posição central
            mexerCarta(CartaIcon4.getX(), CartaIcon4.getY(), "Carta4");

            //verifica o contador para mexer a carta da maquina necessaria
            if (cont == 0) {
                mexerCartaMaquina(CartaMaquina1.getX(), CartaMaquina1.getY(), "CartaMaquina1");
            } else if (cont == 1) {
                mexerCartaMaquina(CartaMaquina2.getX(), CartaMaquina2.getY(), "CartaMaquina2");
            } else if (cont == 2) {
                mexerCartaMaquina(CartaMaquina3.getX(), CartaMaquina3.getY(), "CartaMaquina3");
            } else {
                mexerCartaMaquina(CartaMaquina4.getX(), CartaMaquina4.getY(), "CartaMaquina4");
            }

            LB_Ajuda1.setText("ESCOLHA UM ATRIBUTO");
            LB_Ajuda2.setText("DA SUA CARTA");

            //se contador for par, vez do player, caso contrario, vez da maquina
            if (cont % 2 == 0) {
                aparecerRadioButtons();
            } else {
                RoundMaquina();
            }
        }
    }//GEN-LAST:event_CartaIcon4MouseClicked

    private void SOMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SOMMouseClicked
        if (SOM.getIcon() == iconeSom) {
            backgroundMusic.mute();
            SOM.setIcon(iconeSomMutado);
        } else {
            backgroundMusic.mute();
            SOM.setIcon(iconeSom);
        }
    }//GEN-LAST:event_SOMMouseClicked

    public void mexerCarta(int x, int y, String carta) {
        cartaPlayer = carta;
        new Thread() {
            public void run() {
                int xC = x;
                int yC = y;
                int xP = 570;
                int yP = 220;

                while (xC != xP || yC != yP) {
                    if (xC < xP) {
                        xC++;
                    } else if (xC > xP) {
                        xC--;
                    }
                    if (yC < yP) {
                        yC++;
                    } else if (yC > yP) {
                        yC--;
                    }

                    if (carta.equals("Carta1")) {
                        CartaIcon1.setLocation(xC, yC);
                    } else if (carta.equals("Carta2")) {
                        CartaIcon2.setLocation(xC, yC);
                    } else if (carta.equals("Carta3")) {
                        CartaIcon3.setLocation(xC, yC);
                    } else {
                        CartaIcon4.setLocation(xC, yC);
                    }
                    xCPlayer = xC;
                    yCPlayer = yC;

                    try {
                        sleep(5);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    public void mexerCartaMaquina(int x, int y, String carta) {
        cartaMaquina = carta;
        new Thread() {
            public void run() {
                int xC = x;
                int yC = y;
                int xP = 337;
                int yP = 220;

                while (xC != xP || yC != yP) {
                    if (xC < xP) {
                        xC++;
                    } else if (xC > xP) {
                        xC--;
                    }
                    if (yC < yP) {
                        yC++;
                    } else if (yC > yP) {
                        yC--;
                    }

                    if (carta.equals("CartaMaquina1")) {
                        CartaMaquina1.setLocation(xC, yC);
                    } else if (carta.equals("CartaMaquina2")) {
                        CartaMaquina2.setLocation(xC, yC);
                    } else if (carta.equals("CartaMaquina3")) {
                        CartaMaquina3.setLocation(xC, yC);
                    } else {
                        CartaMaquina4.setLocation(xC, yC);
                    }
                    xCMaquina = xC;
                    yCMaquina = yC;

                    try {
                        sleep(5);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Jogar;
    private javax.swing.JButton BT_ProxRound;
    private javax.swing.JButton BT_Voltar;
    private javax.swing.JLabel CartaIcon1;
    private javax.swing.JLabel CartaIcon2;
    private javax.swing.JLabel CartaIcon3;
    private javax.swing.JLabel CartaIcon4;
    private javax.swing.JLabel CartaMaquina1;
    private javax.swing.JLabel CartaMaquina2;
    private javax.swing.JLabel CartaMaquina3;
    private javax.swing.JLabel CartaMaquina4;
    private javax.swing.JLabel LB_Ajuda1;
    private javax.swing.JLabel LB_Ajuda2;
    private javax.swing.JLabel LB_NomePlayer;
    private javax.swing.JPanel PN_AJUDA;
    private javax.swing.JPanel PainelPlacar;
    private javax.swing.JLabel PontoMaquina;
    private javax.swing.JLabel PontoPlayer;
    private javax.swing.JRadioButton RB_Chute;
    private javax.swing.JRadioButton RB_Defesa;
    private javax.swing.JRadioButton RB_Drible;
    private javax.swing.JRadioButton RB_Fisico;
    private javax.swing.JRadioButton RB_Pace;
    private javax.swing.JRadioButton RB_Passe;
    private javax.swing.JLabel SOM;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
