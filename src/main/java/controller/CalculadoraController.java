package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import service.CalculadoraService;

@RestController
public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @PostMapping("/divisao/{a}/ {b} ")
    public ResponseEntity<Double> divisao(@PathVariable double a, @PathVariable double b) {
        if (b == 0) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Divisão por zero não permitida"
            );
        }
        return ResponseEntity.ok(calculadoraService.dividir(a, b));
    }
}
