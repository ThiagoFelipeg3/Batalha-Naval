package BatalhaNaval;
public class Embarcacao{
    private String nome;
    private int tamanho;

    public Embarcacao(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }
    
    
}