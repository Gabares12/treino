package Personagens;

public class Assassino {
    public String nome;
    public String arma;
    public String tecnica;
    public int idade;
    public double moedasDeOuro;

    public void exibeDados3(){
        System.out.println("o nome do assassino " + nome);
        System.out.println("a arma que ele usa " + arma);
        System.out.println("a tecnica que ele usa " + tecnica);
        System.out.println("sua idade é " + idade);
        System.out.println("e ele tem " + moedasDeOuro + " de ouro");
    }
}

