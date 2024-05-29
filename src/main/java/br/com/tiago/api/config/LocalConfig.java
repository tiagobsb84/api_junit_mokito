package br.com.tiago.api.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.tiago.api.domain.User;
import br.com.tiago.api.repositories.UserRepositorie;

@Configuration
@Profile("local")
public class LocalConfig {

	@Autowired
	private UserRepositorie repositorie;
	
	@Bean
	public List<User> startDB() {
		User u1 = new User(null, "fulano", "fulano@gmail.com", "123");
		User u2 = new User(null, "beltrano", "belatrano@gmail.com", "123");
		
		return repositorie.saveAll(List.of(u1, u2));
	}
}
