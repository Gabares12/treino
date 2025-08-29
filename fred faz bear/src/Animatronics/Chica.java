package Animatronics;

import java.util.Scanner;

public class Chica extends Animatronics{

    public Chica (){

        setNomes("Chica");
        setCores("amarelo");
        setItem("cupcake assassino");
        setLocal("Banheiro");
        setDataDeFabricacao(1999);
    }

    @Override
    public void exbirConteudo() {
        Scanner chica = new Scanner(System.in);
        System.out.println("seu nome é " + getNomes());
        chica.nextLine();

        System.out.println("Sua cor é " + getCores() );
        chica.nextLine();

        System.out.println("Seu item é " + getItem());
        chica.nextLine();

        System.out.println("Local " + getLocal());
        chica.nextLine();

        System.out.println("sua data de fabricação é " + getDataDeFabricacao() );
        chica.nextLine();

    }
}




