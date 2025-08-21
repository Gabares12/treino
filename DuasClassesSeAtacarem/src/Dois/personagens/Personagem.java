package Dois.personagens;

public class Personagem {
    private String nome;
    private String arma;
    private int idade;
    private int vida;
    private int energia;



    public void Personagem (String nome, String arma, int idade, int vida, int energia) {
        this.nome = nome;
        this.arma = arma;
        this.vida = vida;
        this.energia = energia;
        this.idade = idade;
    }




    public void mostrarDados() {
        System.out.println(nome + " Vida: " + vida + " Energia: " + energia);
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}


