package br.com.meli.apidiploma.apidiploma;

import java.util.List;

public class AlunoDTO {

    private String nome;
    private List<Disciplina> disciplinas;
    private Double media;

    public AlunoDTO(String nome, List<Disciplina> disciplinas, Double media) {
        this.nome = nome;
        this.disciplinas = disciplinas;
        this.media = media;
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

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }
}
