package BatalhaNaval;
import java.util.*;

public class JogadorComputador{
    private TabuleiroBatalhaNaval tabuleiro;
    private int pontuacao;
    private ArrayList<Posicao> posTirosDados;
    
    public JogadorComputador(int numLinha, int numColunas){
        this.tabuleiro = new TabuleiroBatalhaNaval(numLinha, numColunas);
        this.posTirosDados = new ArrayList();
        this.pontuacao = 0;
    }
    public Posicao escolharAtaque(){
        Random numAleatorios = new Random();
        Posicao posicao = null;
        int linha = 0;
        int coluna = 0;
        
        do{
            linha = numAleatorios.nextInt(this.tabuleiro.getNumLinhas());
            coluna = numAleatorios.nextInt(this.tabuleiro.getNumLinhas());
            if(this.tabuleiro.getTabuleiro()[linha][coluna] != 'T' || this.tabuleiro.getTabuleiro()[linha][coluna] != 'X'){
                posicao = new Posicao(linha, coluna);
                posTirosDados.add(posicao);
            }
        }while(this.tabuleiro.getTabuleiro()[linha][coluna] == 'T' || this.tabuleiro.getTabuleiro()[linha][coluna] == 'X');
        return posicao;
    }
    public boolean receberAtaque(Posicao posicao){
         
        if(this.tabuleiro.getTabuleiro()[posicao.getLinha()][posicao.getColuna()] == 'A')
            this.tabuleiro.getTabuleiro()[posicao.getLinha()][posicao.getColuna()] = 'X';
        
        if(this.tabuleiro.getTabuleiro()[posicao.getLinha()][posicao.getColuna()] == 'S' ||
           this.tabuleiro.getTabuleiro()[posicao.getLinha()][posicao.getColuna()] == 'H' ||
           this.tabuleiro.getTabuleiro()[posicao.getLinha()][posicao.getColuna()] == 'C' ||
           this.tabuleiro.getTabuleiro()[posicao.getLinha()][posicao.getColuna()] == 'E' ||
           this.tabuleiro.getTabuleiro()[posicao.getLinha()][posicao.getColuna()] == 'P'){
            
              this.tabuleiro.getTabuleiro()[posicao.getLinha()][posicao.getColuna()] = 'T';
              return true;
        }  
        return false;
    }
    
    /****************************
     * Modificadores gets e sets
     ***************************/
    public void setTabuleiro(TabuleiroBatalhaNaval tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void setPosTirosDados(ArrayList<Posicao> posTirosDados) {
        this.posTirosDados = posTirosDados;
    }
    
    public TabuleiroBatalhaNaval getTabuleiro() {
        return tabuleiro;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public ArrayList<Posicao> getPosTirosDados() {
        return posTirosDados;
    }
    
}