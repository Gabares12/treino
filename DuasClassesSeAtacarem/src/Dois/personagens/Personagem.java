package Dois.personagens;

public class Personagem {
    private String nome;
    private String arma;
    private int vida;
    private int energia;



    public Personagem (String nome, String arma, int vida, int energia) {
        this.nome = nome;
        this.arma = arma;
        this.vida = vida;
        this.energia = energia;
    }




    public void mostrarDados() {
        System.out.println(nome + " | Vida: " + vida + " | Energia: " + energia);
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
}


