package br.com.meli.apidiploma.apidiploma.unit.service;

import br.com.meli.apidiploma.apidiploma.dto.StudentDTO;
import br.com.meli.apidiploma.apidiploma.dto.SubjectDTO;
import br.com.meli.apidiploma.apidiploma.service.ApiDiplomaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CertificateServiceImplTest {

    private ApiDiplomaService service = new ApiDiplomaService();

    private List<SubjectDTO> subjects;

    @Test
    public void shouldReturnTheAverageOfNotes() {
        //Arrange
        SubjectDTO s1 = new SubjectDTO("Programação Orientada a Objetos", 9);
        SubjectDTO s2 = new SubjectDTO("Estrutura de Dados", 8);
        this.subjects = new ArrayList<>(Arrays.asList(s1, s2));

        //Act
        double expectedAverage = (double) 17/2;
        double responseAverage = service.calculateAverage(subjects);

        //Assert
        Assertions.assertEquals(expectedAverage, responseAverage);
    }

    @Test
    public void shouldReturnMessageWithHonors() {
        //Arrange
        SubjectDTO s1 = new SubjectDTO("Programação Orientada a Objetos", 9);
        SubjectDTO s2 = new SubjectDTO("Estrutura de Dados", 10);
        this.subjects = new ArrayList<>(Arrays.asList(s1, s2));

        //Act
        String message = service.withHonors(subjects);

        //Assert
        Assertions.assertTrue(message.contains("PARABÉNS!!"));
    }


}
