package br.com.meli.apidiploma.apidiploma.controller;

import br.com.meli.apidiploma.apidiploma.dto.DiplomaDTO;
import br.com.meli.apidiploma.apidiploma.dto.StudentDTO;
import br.com.meli.apidiploma.apidiploma.service.ApiDiplomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ApiDiplomaController {

    private final ApiDiplomaService service;

    @Autowired
    public ApiDiplomaController(ApiDiplomaService service) {
        this.service = service;
    }

    @GetMapping
    @RequestMapping("/analyzeNotes")
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<?> obterDiploma(@Valid @RequestBody StudentDTO studentDTO) {
        DiplomaDTO diplomaDTO = service.writeDiploma(studentDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(diplomaDTO);
    }
}
