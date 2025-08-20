package Inimigos;

public class AtributosIncomun  {
    private String nome;
    private String arma;
    private String armadura;
    private int vida;
    private int idade;
    private int forca;
    private int moedasDeOuro;
    private double altura;

    public void ExibirDados(){

        System.out.println("seu nome é " + nome);
        System.out.println("o seu equipamento é " + arma);
        System.out.println("ele tem uma vida de " + vida );
        System.out.println("sua força é " + forca);
        System.out.printf("Sua idade é %d sua unidade monetaria de %d moedas de ouro e usa altura é %f %n", idade,moedasDeOuro,altura );

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getMoedasDeOuro() {
        return moedasDeOuro;
    }

    public void setMoedasDeOuro(int moedasDeOuro) {
        this.moedasDeOuro = moedasDeOuro;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
