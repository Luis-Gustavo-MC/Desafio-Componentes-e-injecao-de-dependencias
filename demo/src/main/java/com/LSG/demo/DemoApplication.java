package com.LSG.demo;

import com.LSG.demo.entity.Order;
import com.LSG.demo.service.OrderService;
import com.LSG.demo.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	OrderService orderService = new OrderService();
	@Autowired
	ShippingService shippingService = new ShippingService();

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o código: ");
		Integer code = sc.nextInt();
		System.out.println("Escreva o valor básico: ");
		Double basic = sc.nextDouble();
		System.out.println("Escreva o desconto: ");
		Double discount = sc.nextDouble();
		Order order = new Order(code,basic,discount);

		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor Total: R$ " + orderService.total(order) + shippingService.shipment(order));
		sc.close();
	}
}
