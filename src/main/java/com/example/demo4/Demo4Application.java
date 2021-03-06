
package com.example.demo4;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo4Application {


	public static void main(String[] args) {
		SpringApplication.run(Demo4Application.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "namne", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

}
            