package pokemon;

public class Pokemon {

    private String nome;
    private int saude;
    private int nivel;
    private Treinador treinador;

    public Pokemon(String nome, int nivel, Treinador treinador) {
        this.nome = nome;
        this.saude = 1;
        this.nivel = nivel;
        this.treinador = treinador;
    }

    public Pokemon(String nome, int saude, int nivel, Treinador treinador) {
        this.nome = nome;
        this.saude = saude;
        this.nivel = nivel;
        this.treinador = treinador;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getSaude() {
        return saude;
    }
    public void setSaude(int saude) {
        this.saude = saude;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public Treinador getTreinador() {
        return treinador;
    }
    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }

    
}