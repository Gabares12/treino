package SalasDeAula;

import java.util.Scanner;

public class SalaTres extends Salas{

    public SalaTres(){
        setNome("Sala de musica");
        setDescricao("NUMERO TOTAL DE ALUNOS:");
        setAlunos(5);

    }

    @Override
    public void exibirConteudo() {
        System.out.println(getNome());
        System.out.println(getDescricao());
        System.out.println(getAlunos());

        Scanner musica = new Scanner(System.in);

        System.out.println("Esta sala TEM:");
        musica.nextLine();
        System.out.println("2 Triangulos");
        musica.nextLine();
        System.out.println("3 microfones");
        musica.nextLine();
        System.out.println("1 teclado");
        musica.nextLine();
        System.out.println("4 tambores");
        musica.nextLine();
        System.out.println("3 violões");
        musica.nextLine();
        System.out.println("1 baixo");
        musica.nextLine();
        System.out.println("1 bateria");

    }
}
