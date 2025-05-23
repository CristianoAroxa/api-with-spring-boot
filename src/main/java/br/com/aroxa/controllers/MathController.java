package br.com.aroxa.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.aroxa.SimpleMath;



@RestController
public class MathController {

    @GetMapping("/sum/{firstNumber}/{secondNumber}")
    public Double sum(@PathVariable String firstNumber,
                       @PathVariable String secondNumber ) {
        SimpleMath math = new SimpleMath();

        Double n1 = Double.parseDouble(firstNumber);
        Double n2 = Double.parseDouble(secondNumber);

        return math.sum(n1, n2);
    }
    
    @GetMapping("/sub/{firstNumber}/{secondNumber}")
    public Double sub(@PathVariable String firstNumber,
                       @PathVariable String secondNumber) {
        SimpleMath math = new SimpleMath();                
       
        Double n1 = Double.parseDouble(firstNumber);
        Double n2 = Double.parseDouble(secondNumber);

        return math.sub(n1, n2);                
    }

    @GetMapping("/mult/{firstNumber}/{secondNumber}")
    public Double mult(@PathVariable String firstNumber,
                       @PathVariable String secondNumber) {
        SimpleMath math = new SimpleMath();                
       
        Double n1 = Double.parseDouble(firstNumber);
        Double n2 = Double.parseDouble(secondNumber);

        return math.mult(n1, n2);                
    }

   @GetMapping("/div/{firstNumber}/{secondNumber}")
    public Double div(@PathVariable String firstNumber,
                      @PathVariable String secondNumber) {
        Double n1 = Double.parseDouble(firstNumber);
        Double n2 = Double.parseDouble(secondNumber);
        if (n2 == 0) {
            throw new IllegalArgumentException("O divisor não pode ser zero.");
        }
        SimpleMath math = new SimpleMath();
        return math.div(n1, n2);
    }
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgument(IllegalArgumentException ex) {
        // Retorna Bad Request com a mensagem da exceção
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
    

}
