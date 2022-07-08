package uy.edu.ort.devops.productsserviceexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsServiceExampleApplication {

	public static void main(String[] args) {

		System.out.println("Products Url: " + args[0]);

		SpringApplication.run(ProductsServiceExampleApplication.class, args);
	}

}
