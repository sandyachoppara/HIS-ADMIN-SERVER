package com.his;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class HisAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HisAdminServerApplication.class, args);
	}

}
