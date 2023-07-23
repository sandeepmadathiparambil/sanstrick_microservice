package com.example.sanstrick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SanstrickApplication {

	public static void main(String[] args) {
		SpringApplication.run(SanstrickApplication.class, args);
	}

}
@RestController
@CrossOrigin(origins = "http://localhost:3000")
class HelloWorldController {
    @GetMapping("/")
    public String helloWorld() {
        return "This part is coming from Micro Services";
    }
}