package com.example.javaproject;
import java.util.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CarroController {
    private CarrosManager carros = new CarrosManager();

    @GetMapping("api/carros")
   public List<Carro> Get() {
    return carros.getCarro();
   }
    
}
