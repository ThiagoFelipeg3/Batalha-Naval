package BatalhaNaval;
public class BatalhaNaval{
    public static void main(String[] args){
        
        TabuleiroBatalhaNaval tabuHumano = new TabuleiroBatalhaNaval(10, 10);
        TabuleiroBatalhaNaval tabuComputador = new TabuleiroBatalhaNaval(10, 10);
        tabuHumano.imprimirTabuleiroJogador();
        tabuComputador.imprimirTabuleiroAdversario();
        
        System.out.println("");
                                 /*   Submarino  3  S
                                    Hidroavião  2  HH
                                    Cruzador  2  CCC
                                    Encouraçado  1  EEEE
                                    Porta-aviões  1  PPPPP */
    }
}