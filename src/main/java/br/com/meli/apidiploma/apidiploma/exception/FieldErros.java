package br.com.meli.apidiploma.apidiploma.exception;

import br.com.meli.apidiploma.apidiploma.dto.ExceptionFieldDTO;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FieldErros {

    // cria um ExceptionFieldDTO para cada atributo que viola alguma validação
    public static ExceptionFieldDTO processFieldErrors(List<FieldError> fieldErrors) {
        Map<String, String> exceptions = new HashMap<>();
        for (FieldError fieldError: fieldErrors) {
            exceptions.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        return new ExceptionFieldDTO(exceptions);
    }
}
