package BatalhaNaval;

import java.util.*;

public class JogadorHumano{
    Scanner input = new Scanner(System.in);
    private TabuleiroBatalhaNaval tabuleiro;
    private int pontuacao;
    private ArrayList<Posicao> posTirosDados;
    
    public JogadorHumano(int numLinhas, int numColunas){
        this.tabuleiro = new TabuleiroBatalhaNaval(numLinhas, numColunas);
        this.posTirosDados = new ArrayList();
        this.pontuacao = 0;
    }
    public Posicao escolherAtaque(){
        int linha = 0, coluna = 0;
        Posicao posicao = null;
        do{
            System.out.println("Linha: ");
            linha = input.nextInt();
            System.out.println("Coluna: ");
            coluna = input.nextInt();
            if((linha <= this.tabuleiro.getNumLinhas() && coluna <= this.tabuleiro.getNumColunas()) && 
               (this.tabuleiro.getTabuleiro()[linha][coluna] != 'T' && this.tabuleiro.getTabuleiro()[linha][coluna] != 'X')){
                
                    posicao = new Posicao(linha, coluna);
                    this.posTirosDados.add(posicao);
            }else{
                System.out.println("Esta posicao nao e valida");
            }
           
        }while((linha > this.tabuleiro.getNumLinhas() && coluna > this.tabuleiro.getNumColunas()) && 
               (this.tabuleiro.getTabuleiro()[linha][coluna] == 'T' && this.tabuleiro.getTabuleiro()[linha][coluna] == 'X'));
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
    /******************************
     * Modificadores gets e sets
     ******************************/
    public TabuleiroBatalhaNaval getTabuleiro() {
        return tabuleiro;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public ArrayList<Posicao> getPosTirosDados() {
        return posTirosDados;
    }

    public void setTabuleiro(TabuleiroBatalhaNaval tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void setPosTirosDados(ArrayList<Posicao> posTirosDados) {
        this.posTirosDados = posTirosDados;
    }
    
   
}