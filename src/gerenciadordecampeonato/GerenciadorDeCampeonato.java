package gerenciadordecampeonato;

import classes.BackgroundMusic;

public class GerenciadorDeCampeonato {
    
    public static void main(String[] args) {        
        BackgroundMusic backgroundMusic = new BackgroundMusic();
        backgroundMusic.play();
        Janela j = new Janela(backgroundMusic);
        j.setLocationRelativeTo(null);
        j.setVisible(true);
    }
    
}
