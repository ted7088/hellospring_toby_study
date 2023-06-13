package tobyspring.helloboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tobyspring.config.MySpringBootApplication;

@MySpringBootApplication
public class HellobootApplication {
	public static void main(String[] args) {
		SpringApplication.run(HellobootApplication.class,args);
	}

}
