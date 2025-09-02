package Personagens;

public class Barbaro extends Personagens{

    public Barbaro() {

        setNome("conam");
        setIdade(40);
    }

    @Override
    public void exibirConteudo() {
        System.out.println("seu nome é " + getNome() );
        System.out.println("sua idade é " + getIdade());

    }
}
