import Personagens.Barbaro;
import Personagens.Guerreiro;

public class Main{
    public static void main(String[] args) {


        Barbaro personagemBarbaro = new Barbaro();
        personagemBarbaro.exibirConteudo();

        System.out.println("//////////////////////////");

        Guerreiro personagemGuerreiro = new Guerreiro();
        personagemGuerreiro.exibirConteudo();

        int contador = 1;
        while(contador <= 50);
        System.out.println(contador);
        contador ++;



    }
}