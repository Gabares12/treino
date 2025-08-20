import Inimigos.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!");

        ReiDosRatos personagemReiDosRatos = new ReiDosRatos();
        personagemReiDosRatos.ExibirDados();

        Esqueleto personagemEsqueleto = new Esqueleto();
        personagemEsqueleto.ExibirDados2();

        Reptliano personagemReptliano = new Reptliano();
        personagemReptliano.ExibirDados4();

        CavaleiroRenegado personagemCavaleiroRenegado = new CavaleiroRenegado();
        personagemCavaleiroRenegado.ExibirDados3();

        GorilaLouco personagemGorilaLouco = new GorilaLouco();
        personagemGorilaLouco.ExibirDado5();






    }
}