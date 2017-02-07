package com.TestDEVPro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;




@ComponentScan({"com.TestDEVPro.*"})
@SpringBootApplication
public class TestDEVPro extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TestDEVPro.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(TestDEVPro.class, args);
	}
 }
