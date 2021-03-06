package br.com.meli.apidiploma.apidiploma.exception;

import br.com.meli.apidiploma.apidiploma.dto.ExceptionFieldDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

@ControllerAdvice
public class ApiExceptionControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> argumentNotValidHandler(MethodArgumentNotValidException e) {
        BindingResult result = e.getBindingResult();

        List<FieldError> fieldErrors = result.getFieldErrors();
        ExceptionFieldDTO exceptions = FieldErros.processFieldErrors(fieldErrors);

        return ResponseEntity.badRequest().body(exceptions);
    }
}
