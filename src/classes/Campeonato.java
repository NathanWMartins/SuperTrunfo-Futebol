package classes;

import java.io.Serializable;
import java.util.LinkedList;

public class Campeonato implements Serializable{
    
    public LinkedList<Usuario> listaUsuarios = new LinkedList<>();
    public LinkedList<Jogador> listaJogadores = new LinkedList<>();

    public Campeonato() {
    }
   
}
