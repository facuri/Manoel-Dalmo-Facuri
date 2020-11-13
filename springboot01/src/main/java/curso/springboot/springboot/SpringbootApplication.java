package curso.springboot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages="curso.springboot.model")//Vai ler as Entidades
@ComponentScan(basePackages= {"curso.*"})//Mapear todas as pastas do curso
@EnableJpaRepositories(basePackages = {"curso.springboot.repository"})
@EnableTransactionManagement//Parte de transação
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
