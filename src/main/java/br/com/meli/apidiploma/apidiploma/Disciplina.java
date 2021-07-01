package br.com.meli.apidiploma.apidiploma;

public class Disciplina {

    private String nome;
    private Double nota;

    public Disciplina(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}
