package guru.springframework.joke;

import guru.springframework.joke.services.JokeService;
import guru.springframework.joke.services.JokeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5JokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5JokesAppApplication.class, args);

	}

}
