import Personagens.Barbaro;
import Personagens.Guerreiro;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello World!");

        Barbaro personagemBarbaro = new Barbaro();
        personagemBarbaro.nome = "vini";
        personagemBarbaro.idade = 20;
        personagemBarbaro.arma = "tesoura";
        personagemBarbaro.estiloDeLuta = "boxe";
        personagemBarbaro.armadura = "ferro";
        personagemBarbaro.moedasDeOuro = 35;

        personagemBarbaro.exiberDados();
        System.out.println("//////////////////////////");

        Guerreiro personagemGuerreiro = new Guerreiro();
        personagemGuerreiro.nome = "brutos";
        personagemGuerreiro.idade = 56;
        personagemGuerreiro.arma = "cacos de vidro";
        personagemGuerreiro.armadura = "de couro";
        personagemGuerreiro.estiloDeLuta = "briga de rua";
        personagemGuerreiro.moedasDeOuro = 5666;

        personagemGuerreiro.exbirDados();


    }
}