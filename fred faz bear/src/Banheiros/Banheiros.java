package Banheiros;

public abstract class Banheiros{

    private int cameras;
    private String espelho;
    private int vasos;
    private int pia;

    public int getCameras() {
        return cameras;
    }

    public void setCameras(int cameras) {
        this.cameras = cameras;
    }

    public String getEspelho() {
        return espelho;
    }

    public void setEspelho(String espelho) {
        this.espelho = espelho;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    public int getPia() {
        return pia;
    }

    public void setPia(int pia) {
        this.pia = pia;
    }

    public abstract void exibirConteudo();
}



//private int vasos;
//private int pia;



//public class Banheiros {
//
//    private String descricaoBanheiro;
//}
