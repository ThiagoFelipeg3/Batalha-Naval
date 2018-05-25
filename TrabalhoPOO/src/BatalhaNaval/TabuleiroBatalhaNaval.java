package BatalhaNaval;
public class TabuleiroBatalhaNaval{
    private char[][] tabuleiro;
    private int numLinhas, numColunas;
    
    public TabuleiroBatalhaNaval(int numLinhas, int numColunas){
        this.numLinhas = numLinhas;
        this.numColunas = numColunas;
        
        this.tabuleiro = new char[this.numLinhas][this.numColunas];
        for(int linha = 0; linha < numLinhas; linha++)
            for(int coluna = 0; coluna < numColunas; coluna++)
                this.tabuleiro[linha][coluna] = 'A';
    }
    public void imprimirTabuleiroJogador(){
        System.out.println("TABULEIRO JOGADOR");
        
        for(int i = 1; i <= this.numColunas; i++)
            System.out.print("\t"+i);
        System.out.println();
        
        for(int linha = 0; linha < this.numLinhas; linha++){
           System.out.print(linha+1 +"\t");
            for(int coluna = 0; coluna < this.numColunas; coluna++){
                System.out.print(this.tabuleiro[linha][coluna]+"\t");
            }
            System.out.println("\n");
        }    
    }
    public void imprimirTabuleiroAdversario(){
        System.out.println("TABULEIRO COMPUTADOR");
        
        for(int i = 1; i <= this.numColunas; i++)
            System.out.print("\t"+i);
        System.out.println();
        
        for(int linha = 0; linha < this.numLinhas; linha++){
            System.out.print(linha+1 +"\t");
           
            for(int coluna = 0; coluna < this.numColunas; coluna++){
             
                if(this.tabuleiro[linha][coluna] == 'T'){
                    System.out.print('T'+"\t");
                    continue;
                }    
                
                if(this.tabuleiro[linha][coluna] == 'X'){
                    System.out.print('X'+"\t");
                    continue;
                }
                System.out.print('A'+"\t");
            }   
                System.out.println("\n");
        }
    }    
    public boolean adicionarEmbarcacao(Embarcacao embarcacao, Posicao posicao){
        int contadorAux = 0;
        int coluna = 0;
        if(embarcacao.getTamanho() + posicao.getColuna() < this.numColunas){   
            
            for(coluna = posicao.getColuna(); coluna <= embarcacao.getTamanho()+posicao.getColuna(); coluna++){
                if(this.tabuleiro[posicao.getLinha()][coluna] == 'A'){
                    contadorAux++;
                }
            }
            
            if(contadorAux == embarcacao.getTamanho() || contadorAux == embarcacao.getTamanho()+1){
                for(coluna = posicao.getColuna(); coluna < embarcacao.getTamanho()+posicao.getColuna(); coluna++){
                        
                    if(embarcacao.getNome().compareTo("Submarino")==0){
                        this.tabuleiro[posicao.getLinha()][coluna] = 'S';
                    }
                    if(embarcacao.getNome().compareTo("Hidroaviao")==0){
                        this.tabuleiro[posicao.getLinha()][coluna] = 'H';
                    }
                    if(embarcacao.getNome().compareTo("Cruzador")==0){
                        this.tabuleiro[posicao.getLinha()][coluna] = 'C';
                    }
                    if(embarcacao.getNome().compareTo("Encouracado")==0){
                        this.tabuleiro[posicao.getLinha()][coluna] = 'E';
                    }
                    if(embarcacao.getNome().compareTo("Porta_avioes")==0){
                        this.tabuleiro[posicao.getLinha()][coluna] = 'P';
                    }
                }
                return true;
            }
        }
        return false;
    }
    /**************************
     * Modificadores gets sets
     **************************/
    public void setTabuleiro(char[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public void setNumLinhas(int numLinhas) {
        this.numLinhas = numLinhas;
    }

    public void setNumColunas(int numColunas) {
        this.numColunas = numColunas;
    }
    
    public char[][] getTabuleiro() {
        return tabuleiro;
    }

    public int getNumLinhas() {
        return numLinhas;
    }

    public int getNumColunas() {
        return numColunas;
    }

}
