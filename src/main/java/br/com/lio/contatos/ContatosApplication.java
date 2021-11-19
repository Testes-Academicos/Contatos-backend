package br.com.lio.contatos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "br.com.lio.contatos")
@EntityScan(basePackages = "br.com.lio.contatos.model")
@EnableJpaRepositories("br.com.lio.contatos.repository")
public class ContatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContatosApplication.class, args);
	}

}
