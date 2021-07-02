package br.com.meli.apidiploma.apidiploma;

import java.util.List;

public class Aluno {

    private String nome;
    private List<Disciplina> disciplinas;

    public Aluno(String nome, List<Disciplina> disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Double calcularMedia() {
        Double somaNotas = 0.0;
        for (Disciplina d : this.disciplinas) {
            somaNotas+=d.getNota();
        }
        Double media = somaNotas/this.disciplinas.size();
        return media;
    }

    public String escreverMensagem() {
        if (this.calcularMedia() > 9) {
            return "PARABÉNS!! Sua média foi: " + this.calcularMedia();
        }
        return "Sua média foi: " + this.calcularMedia();
    }
}
