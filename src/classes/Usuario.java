package classes;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable{
    private String nome, email, senha, contato, historico="";
    private int numVitoria, numDerrota;
   
    public Usuario(String nome, String email, String senha, String contato) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.contato = contato;
    }

    public Usuario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public int getNumVitoria() {
        return numVitoria;
    }

    public void setNumVitoria(int numVitoria) {
        this.numVitoria = numVitoria;
    }

    public int getNumDerrota() {
        return numDerrota;
    }

    public void setNumDerrota(int numDerrota) {
        this.numDerrota = numDerrota;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico_) {
        this.historico += historico_ + "\n";
    }        
    
}
