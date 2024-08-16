package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:some.db")) {
			System.out.println(conn);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
