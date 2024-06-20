package com.desafio.demo;

import com.desafio.demo.entities.Order;
import com.desafio.demo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Order order1 = new Order(1034, 150.00, 20.00);
		System.out.println(orderService.total(order1));
		System.out.println(order1.getBasic());

		Order order2 = new Order(2282, 800.00, 10.00);
		System.out.println(orderService.total(order2));

		Order order3 = new Order(1309, 95.90, 00.00);
		System.out.println(orderService.total(order3));

	}
}
