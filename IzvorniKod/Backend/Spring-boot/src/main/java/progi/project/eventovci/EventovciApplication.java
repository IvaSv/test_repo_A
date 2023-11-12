package progi.project.eventovci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("progi.project.eventovci")
public class EventovciApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventovciApplication.class, args);
	}

}
