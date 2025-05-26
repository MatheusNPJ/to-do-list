package model;

public class Tarefa extends Usuario {

    private int Id;
    private String Titulo;
    private String Descricao;

    public Tarefa(int id, String titulo, String descricao) {
        Id = id;
        Titulo = titulo;
        Descricao = descricao;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
}
