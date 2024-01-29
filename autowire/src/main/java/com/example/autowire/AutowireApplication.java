package com.example.autowire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AutowireApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AutowireApplication.class, args);
		laptop l = context.getBean(laptop.class);

		l.show();
	}

}
