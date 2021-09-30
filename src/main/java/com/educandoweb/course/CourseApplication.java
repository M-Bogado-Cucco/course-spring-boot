package com.educandoweb.course;

/*Antes de rodar o projeto, ir no terminal e digitar: sudo systemctl stop tomcat9, 
pois a máquina inicia com o tomcat ligado e isso impede o springboot de acessar a porta*/


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}

}
