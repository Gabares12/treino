package Personagens;

public class Guerreiro extends Personagens{

    public Guerreiro(){
        setNome("Jorge");
        setIdade(30);

    }

    @Override
    public void exibirConteudo() {
        System.out.println("seu nome é " + getNome() );
        System.out.println("sua idade é " + getIdade());

    }
}
