package br.com.meli.apidiploma.apidiploma.service;

import br.com.meli.apidiploma.apidiploma.dto.DiplomaDTO;
import br.com.meli.apidiploma.apidiploma.dto.StudentDTO;
import br.com.meli.apidiploma.apidiploma.dto.SubjectDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiDiplomaService {

    public double calculateAverage(List<SubjectDTO> subjects) {
        double sumNotes = 0.0;
        for (SubjectDTO s : subjects) {
            sumNotes+=s.getNote();
        }
        return sumNotes/subjects.size();
    }

    public String analyzeNotes(List<SubjectDTO> subjects) {
        return "Sua média foi: " + this.calculateAverage(subjects);
    }

    public String withHonors(List<SubjectDTO> subjects) {
        if (this.calculateAverage(subjects) < 9) {
            return analyzeNotes(subjects);
        }
        return "PARABÉNS!! Sua média foi: " + this.calculateAverage(subjects);
    }

    public DiplomaDTO writeDiploma(StudentDTO studentDTO) {
        double average = calculateAverage(studentDTO.getSubjects());
        String message = withHonors(studentDTO.getSubjects());
        return new DiplomaDTO(message, average, studentDTO.getName(), studentDTO.getSubjects());
    }
}
