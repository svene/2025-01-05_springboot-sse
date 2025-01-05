package org.svenehrke.demo.springbootsse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootsseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootsseApplication.class, args);
	}

}
