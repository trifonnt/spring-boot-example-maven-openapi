package bg.aspar.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestExampleMavenApplication {

	public static void main(String[] args) {
		SpringApplication.from(ExampleMavenApplication::main).with(TestExampleMavenApplication.class).run(args);
	}

}
