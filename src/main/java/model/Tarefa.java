package model;

public class Tarefa extends Dia{

    //Atributos da classe filha
    String titulo;
    String descricao;
    boolean status;

    //Construtor da classe tarefa herdando a super
    public Tarefa(int dia, String titulo, String descricao, boolean status) {
        super(dia);
        this.titulo =  titulo;
        this.descricao = descricao;
        this.status = false;
    }

    //Set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Get
    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean getStatus() {
        return status;
    }

    public void MarcarComoConcluida()
    {
        status = true;
    }

    @Override
    public String toString(){
        return  "Hoje " + getDia() +
                "\nTitulo: " + getTitulo() +
                "\nDescrição: " + getDescricao() +
                "\nStatus: " + getStatus();
    }
}
