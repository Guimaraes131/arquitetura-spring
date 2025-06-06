package io.github.Guimaraes131.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);

		builder.bannerMode(Banner.Mode.OFF);
		builder.profiles("producao");

		builder.run(args);

		ConfigurableApplicationContext applicationContext = builder.context();
		ConfigurableEnvironment environment = applicationContext.getEnvironment();

		String applicationName = environment.getProperty("spring.application.name");

		System.out.println("Nome da aplicação: " + applicationName);
	}

}
