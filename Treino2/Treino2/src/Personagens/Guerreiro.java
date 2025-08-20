package Personagens;

public class Guerreiro {

    public String nome;
    public String arma;
    public String estiloDeLuta;
    public String armadura;
    public int idade;
    public double moedasDeOuro;

    public void exbirDados(){
        System.out.println("o nome dele é " + nome);
        System.out.println("a arma que ele usa " + arma);
        System.out.println("estilo de arma é " + estiloDeLuta );
        System.out.println("estilo da armadura " + armadura );
        System.out.println("sua idade é " + idade);
        System.out.println("e ele tem " + moedasDeOuro + " moedas de ouro");

    }

}
