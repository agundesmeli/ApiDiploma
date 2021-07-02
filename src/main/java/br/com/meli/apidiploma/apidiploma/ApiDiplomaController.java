package br.com.meli.apidiploma.apidiploma;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/diploma")
public class ApiDiplomaController {

    @GetMapping
    @RequestMapping("/{nome}")
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<?> obterDiploma(@RequestBody Aluno aluno) {
        AlunoDTO alunoDTO = new AlunoDTO(aluno.getNome(), aluno.getDisciplinas(), aluno.calcularMedia(), aluno.escreverMensagem());
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoDTO);
    }
}
