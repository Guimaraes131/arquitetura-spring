package io.github.Guimaraes131.arquiteturaspring.montadora.api;

import io.github.Guimaraes131.arquiteturaspring.montadora.CarroStatus;
import io.github.Guimaraes131.arquiteturaspring.montadora.Chave;
import io.github.Guimaraes131.arquiteturaspring.montadora.HondaHRV;
import io.github.Guimaraes131.arquiteturaspring.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    @Aspirado
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        var carro = new HondaHRV(motor);

        return carro.darIgnicao(chave);
    }
}
