package br.com.meli.apidiploma.apidiploma.dto;

import javax.validation.Valid;
import javax.validation.constraints.*;

import java.util.List;

public class StudentDTO {

    @NotNull(message = "O nome do aluno é obrigatório")
    @Size(min = 8, max = 50, message = "O nome do aluno pode ter no máximo 50 caracteres e no mínimo 8 caracteres")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "O nome do aluno só pode possuir caracteres de a-z")
    private String name;

    @NotNull(message = "As informações sobre as disciplinas são obrigatórias")
    @Valid
    private List<SubjectDTO> subjects;

    public StudentDTO(String name, List<SubjectDTO> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubjectDTO> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectDTO> subjects) {
        this.subjects = subjects;
    }

    @Override
    public boolean equals(Object obj) {
        if (!obj.getClass().equals(StudentDTO.class)) {
            return false;
        }
        StudentDTO s = (StudentDTO) obj;
        return this.name.equals(s.name) && this.subjects.equals(s.subjects);
    }

}
