package com.autenticapc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class GestionVentasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionVentasApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "index";
	}

}
