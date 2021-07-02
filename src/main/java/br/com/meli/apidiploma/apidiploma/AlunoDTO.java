package br.com.meli.apidiploma.apidiploma;

import java.util.List;

public class AlunoDTO {

    private String nome;
    private List<Disciplina> disciplinas;
    private Double media;
    private String mensagem;

    public AlunoDTO(String nome, List<Disciplina> disciplinas, Double media, String mensagem) {
        this.nome = nome;
        this.disciplinas = disciplinas;
        this.media = media;
        this.mensagem = mensagem;
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

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
