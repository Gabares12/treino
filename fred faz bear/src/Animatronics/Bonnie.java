package Animatronics;

import java.util.Scanner;

public class Bonnie extends Animatronics {

    public  Bonnie(){

        setNomes("Bonnie");
        setCores("Roxo");
        setItem("Guitarra");
        setLocal("Dispensa");
        setDataDeFabricacao(1987);

    }

    @Override
    public void exbirConteudo() {
        Scanner Bonnie = new Scanner(System.in);

        System.out.println("seu nome é " + getNomes());
        Bonnie.nextLine();

        System.out.println("Sua cor é " + getCores() );
        Bonnie.nextLine();

        System.out.println("Seu item é " + getItem());
        Bonnie.nextLine();

        System.out.println("Local " + getLocal());
        Bonnie.nextLine();

        System.out.println("Sua data de fabricação " + getDataDeFabricacao());
        Bonnie.nextLine();


    }
}


