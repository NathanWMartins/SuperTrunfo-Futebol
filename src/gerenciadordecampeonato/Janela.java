package gerenciadordecampeonato;

import classes.BackgroundMusic;
import classes.Campeonato;
import classes.Usuario;
import java.awt.BorderLayout;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Janela extends javax.swing.JFrame {
    static TelaInicial telaA;
    static TelaCadastro telaB;
    static TelaLogin telaC;
    static TelaApresentacao telaD;
    static TelaLigas telaE;
    static TelaJogo telaF;
    static TelaPerfil telaG;
    static TelaPremier telaH;
    static TelaLaLiga telaI;
    static TelaLigue1 telaJ;
    static TelaSerieA telaK;
    static TelaBundesliga telaL;
    
    public static Campeonato c = new Campeonato();
    
    public Janela(BackgroundMusic backgroundMusic)  {
        initComponents();        
        String nomeArquivo = "loginUsuarios";
        try {
            FileInputStream arquivo1 = new FileInputStream(nomeArquivo);
            ObjectInputStream in1 = new ObjectInputStream(arquivo1);            
            
            Janela.c.listaUsuarios = (LinkedList<Usuario>)in1.readObject();
            in1.close();
            arquivo1.close();         
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        telaA = new TelaInicial(backgroundMusic); 
        
        this.setLayout(new BorderLayout());
        this.add(telaA, BorderLayout.CENTER);
        this.pack();
    }        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
