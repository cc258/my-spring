package com.cc.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cc.demo.mapper")
@SpringBootApplication
public class MySpringApplication {

	public static void main(String[] args) {


		SpringApplication.run(MySpringApplication.class, args);



	}

}