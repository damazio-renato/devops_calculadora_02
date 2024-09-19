package br.facens.devops.calculadora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @GetMapping("/somar")
    public int somar(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @GetMapping("/subtrair")
    public int subtrair(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }
    
    @GetMapping("/dividir")
    public int dividir(@RequestParam int a, @RequestParam int b) {
        try {
            return a / b;
        } catch (ArithmeticException ae) {
            throw new ArithmeticException("Não permitido divisão por zero");
        }
    }
    
    @GetMapping("/multiplicar")
    public int multiplicar(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }

}
