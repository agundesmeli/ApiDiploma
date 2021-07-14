package br.com.meli.apidiploma.apidiploma.dto;

import java.util.List;

public class DiplomaDTO {

    private String message;
    private double average;
    private String studentName;
    private List<SubjectDTO> subjects;

    public DiplomaDTO(String message, double average, String studentName, List<SubjectDTO> subjects) {
        this.message = message;
        this.average = average;
        this.studentName = studentName;
        this.subjects = subjects;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<SubjectDTO> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectDTO> subjects) {
        this.subjects = subjects;
    }
}
