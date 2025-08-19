import Personagens.Barbaro;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!");
        Barbaro personagemBarbaro = new Barbaro();
        personagemBarbaro.nome = "arthorius";
        personagemBarbaro.idade = 25;

        personagemBarbaro.exibeDados();
    }
}