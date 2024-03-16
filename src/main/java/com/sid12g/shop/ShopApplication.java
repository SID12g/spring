package com.sid12g.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
		var test = new Freind("lee");
		System.out.println(test.name);
	}

}

class Freind{
	String name;
	int age = 20;
	Freind(String name1){
		this.name = name1;
	}
}
