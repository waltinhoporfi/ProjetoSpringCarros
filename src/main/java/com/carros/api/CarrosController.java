package com.carros.api;

import com.carros.domain.Carro;
import com.carros.domain.CarroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/carros")
public class CarrosController {

    private CarroService service = new CarroService();

    @GetMapping
    public Iterable<Carro> get(){
        return service.getCarros();
    }

}
