import Personagens.Assassino;
import Personagens.Barbaro;
import Personagens.Mago;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello World!");

        Barbaro personagemBarbaro = new Barbaro();
        personagemBarbaro.nome = "Ragnar";
        personagemBarbaro.idade = 34;
        personagemBarbaro.arma = "espada longa";
        personagemBarbaro.estiloDeLuta ="Kickboxing";
        personagemBarbaro.armadura = "Couro";
        personagemBarbaro.moedasDeOuro = 378;

        personagemBarbaro.exibedados();

        System.out.println("/////////////////////////////////////");

        Mago personagemMago = new Mago();
        personagemMago.nome = "Layla";
        personagemMago.idade = 26;
        personagemMago.arma = "cajado,cristais ";
        personagemMago.elemento = "Sombras";
        personagemMago.moedasDeOuro = 3842;

        personagemMago.exibeDados2();

        System.out.println("/////////////////////////////////////");

        Assassino personagemAssassino = new Assassino();
        personagemAssassino.nome ="Gilson";
        personagemAssassino.idade =23;
        personagemAssassino.arma ="Facas";
        personagemAssassino.tecnica ="Envenenamento";
        personagemAssassino.moedasDeOuro = 37891;

        personagemAssassino.exibeDados3();



    }
}