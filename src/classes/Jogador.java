package classes;

import javax.swing.Icon;

public class Jogador extends Pessoa{
    private Icon carta;
    private int pace, chute, passe, drible, defesa, fisico;

    public Jogador(String nome, int pace, int chute, int passe, int drible, int defesa, int fisico, Icon carta) {
        super(nome);
        this.pace = pace;
        this.chute = chute;
        this.passe = passe;
        this.drible = drible;
        this.defesa = defesa;
        this.fisico = fisico;
        this.carta = carta;
    }

    public int getPace() {
        return pace;
    }

    public void setPace(int pace) {
        this.pace = pace;
    }

    public int getChute() {
        return chute;
    }

    public void setChute(int chute) {
        this.chute = chute;
    }

    public int getPasse() {
        return passe;
    }

    public void setPasse(int passe) {
        this.passe = passe;
    }

    public int getDrible() {
        return drible;
    }

    public void setDrible(int drible) {
        this.drible = drible;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }  

    public Icon getCarta() {
        return carta;
    }

    public void setCarta(Icon carta) {
        this.carta = carta;
    }
    
    
}
