package br.edu.ifms.exceptionhandling.controller;

import br.edu.ifms.exceptionhandling.exception.InvalidCharacterException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sum")

public class somaController {
    @GetMapping("/{num1}/{num2}")
    public ResponseEntity<Integer> sum(@PathVariable String num1, @PathVariable String num2) {


    try{

      Integer numero1 = Integer.parseInt(num1);
      Integer numero2 = Integer.parseInt(num2);
      return ResponseEntity.ok(numero1 + numero2);

    }catch(ArithmeticException e){

       throw new ArithmeticException("Letras não são permitidas!");
    }
}
}
