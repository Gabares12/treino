package Banheiros;

public class BanheiroMasc extends Banheiros{

    public BanheiroMasc(){

        setVasos(4);
        setPia(4);
        setEspelho("espelho");
        setCameras(1);


    }
    @Override
    public void exibirConteudo() {
        System.out.println("quando voce entra na camera do banheiro");
        System.out.println("voce enxerga paredes e pisos quadriculadas nas cores preto e branco");
        System.out.println("quase como um tabuleiro de xadres ");
        System.out.println("voce enxerga 4 cabines  ");
        System.out.println("duas delas sem porta ");
        System.out.println("alem disso voce tambem enxerga 4 pias");
        System.out.println("");




    }
}

