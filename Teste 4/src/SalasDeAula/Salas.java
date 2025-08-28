package SalasDeAula;

public abstract class Salas {
    public String nome;
    public String descricao;
    public String Banheiro;
    public int alunos;



    public void Salas(){


    }

    public String getBanheiro() {
        return Banheiro;
    }

    public void setBanheiro(String banheiro) {
        Banheiro = banheiro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAlunos() {
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }

    public abstract void exibirConteudo();
}








//private Salas(String nome){
//    this.nome = nome;
//}
//Salas(int alunos){
//    this.alunos = alunos;
//}
