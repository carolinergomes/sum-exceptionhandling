package br.edu.ifms.exceptionhandling.controller;

import br.edu.ifms.exceptionhandling.exception.InvalidCharacterException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/calculator")

public class somaController {
    @GetMapping("/{num1}/{num2}")
    public ResponseEntity<Integer> add(@PathVariable("numero1") String numero1, @PathVariable("numero2") String numero2) {

        int num1 = 0;
        int num2 = 0;

         try{

            num1 = Integer.parseInt(numero1);
            num2 = Integer.parseInt(numero2);

         }catch(NumberFormatException e){

            throw new ArithmeticException("Letras não são permitidas!");
         }
         return ResponseEntity.ok(num1 + num2);
    }
}

