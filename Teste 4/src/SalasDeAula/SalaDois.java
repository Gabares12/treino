package SalasDeAula;

import java.util.Scanner;

public class SalaDois extends Salas{

    public SalaDois(){
        setNome("sala de artes");
        setDescricao("NUMERO TOTAL DE ALUNOS:");
        setAlunos(22);
    }

    @Override
    public void exibirConteudo() {
        Scanner artes = new Scanner(System.in);

        System.out.println(getNome());
        System.out.println(getDescricao());
        System.out.println(getAlunos());

        System.out.println("ESTÁ SALA TEM:");
        artes.nextLine();

        artes.nextLine();
        System.out.println("6 mesas");
        artes.nextLine();
        System.out.println("35 -1  cadeiras");
        artes.nextLine();
        System.out.println("2 janelões");
        artes.nextLine();
        System.out.println("1 porta");
        artes.nextLine();
        System.out.println("20 telas");
        artes.nextLine();
        System.out.println("40 pincels");
        artes.nextLine();
        System.out.println("30 latas de tinta");

    }
}






