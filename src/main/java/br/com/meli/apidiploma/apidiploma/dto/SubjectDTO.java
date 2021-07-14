package br.com.meli.apidiploma.apidiploma.dto;

import javax.validation.constraints.*;

public class SubjectDTO {

    @NotNull(message = "O nome da disciplina é obrigatória")
    @Size(min = 8, max = 50, message = "O nome da disciplina pode ter no máximo 50 caracteres e no mínimo 8 caracteres")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "O nome da disciplina só pode possuir caracteres de a-z")
    private String name;

    @NotNull(message = "A nota da disciplina é obrigatória")
    @Min(value = 0, message = "A nota da disciplina não pode ser menor do que zero")
    @Max(value = 10, message = "A nota da disciplina não pode ser maior do que noventa e nove")
    private int note;

    public SubjectDTO() {
    }

    public SubjectDTO(String name, int note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public boolean equals(Object obj) {
        if (!obj.getClass().equals(SubjectDTO.class)) {
            return false;
        }
        SubjectDTO s = (SubjectDTO) obj;
        return this.name.equals(s.name) && this.note == s.note;
    }
}
