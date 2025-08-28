package SalasDeAula;

import java.util.Scanner;

public class SalaUm extends Salas{
    Scanner ciencias = new Scanner(System.in);

    public SalaUm (){
        super();
        this.nome = "ciencias";
        this.descricao = "NUMERO TOTAL DE ALUNOS:";
        this.alunos = 12;


    }
    @Override
    public void exibirConteudo() {

        System.out.println(this.getNome());
        System.out.println(this.getDescricao());
        System.out.println(this.getAlunos());


        System.out.println("ESTÁ SALA TEM:");
        ciencias.nextLine();

        System.out.println("20 Mesas");
        ciencias.nextLine();

        System.out.println("20 Cadeiras");
        ciencias.nextLine();

        System.out.println("3 Janelões");
        ciencias.nextLine();

        System.out.println("1 Porta");
        ciencias.nextLine();

        System.out.println("1 esqueleto 'Fred' ");




    }

}

//public void SalaUm (){
//    setNome("Sala de ciencias");
//    setDescricao("NUMERO TOTAL DE ALUNOS:");
//    setAlunos(12);