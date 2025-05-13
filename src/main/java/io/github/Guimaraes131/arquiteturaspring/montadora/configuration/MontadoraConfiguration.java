package io.github.Guimaraes131.arquiteturaspring.montadora.configuration;

import io.github.Guimaraes131.arquiteturaspring.montadora.Motor;
import io.github.Guimaraes131.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motorAspirado() {
        var motor = new Motor();

        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.ASPIRADO);

        return motor;
    }

    @Bean
    public Motor motorEletrico() {
        var motor = new Motor();

        motor.setCavalos(150);
        motor.setCilindros(5);
        motor.setModelo("XPTO-1");
        motor.setLitragem(2.5);
        motor.setTipoMotor(TipoMotor.ELETRICO);

        return motor;
    }

    @Bean
    public Motor motorTurbo() {
        var motor = new Motor();

        motor.setCavalos(340);
        motor.setCilindros(6);
        motor.setModelo("XPTO-3");
        motor.setLitragem(3.4);
        motor.setTipoMotor(TipoMotor.TURBO);

        return motor;
    }
}
