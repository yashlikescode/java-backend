package in.yashlikescode.movie_list;
import in.yashlikescode.movie_list.run.Location;
import in.yashlikescode.movie_list.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.time.LocalDateTime;

@SpringBootApplication
public class Application {

	public static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
		log.info("Something Changed");
	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			Run run = new Run(2, "First Run", LocalDateTime.now(), LocalDateTime.now().plusHours(1),3, Location.OUTDOOR);
			log.info(String.valueOf(run));
		};

	}
	//Commandline runner runs after the application is started and application context has been created (Container of all the beans in the system)

}
