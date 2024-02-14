package com.example.demo3;

import com.example.demo3.entity.Product;
import com.example.demo3.repository.ProductRepesitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
				public  class Demo3Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}
	@Autowired
	private ProductRepesitory productRepesitory ;

	@Override
	public void run(String... args) throws Exception {
//		Product product2 = new Product("ilias2",22222);
//		productRepesitory.save(product2);
//		Product product3 = new Product("ilias3",33333);
//		productRepesitory.save(product3);
//		Product product4 = new Product("ilias4",444444);
//		productRepesitory.save(product4);

	}
}
