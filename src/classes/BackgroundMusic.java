package classes;

import javax.sound.sampled.*;
import java.io.File;
import java.net.URL;

public class BackgroundMusic {
    private Clip clip;

    public void play() {
        try {
            URL audioUrl = getClass().getResource("/som/Camisa10.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioUrl);
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        if (clip != null && clip.isRunning()) {
            System.out.println("entrei");
            clip.stop();
            clip.close();
        }
    }
    
    private boolean mutado = false;
    private long posicaoMusica = 0;
    
    public void mute(){
        if (clip != null) {
            if (mutado) {
                clip.setMicrosecondPosition(posicaoMusica);
                clip.start();
                mutado = false;
            }else{
                posicaoMusica = clip.getMicrosecondPosition();
                clip.stop();
                mutado = true;
            }
        }
    }
}
