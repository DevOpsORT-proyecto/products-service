package uy.edu.ort.devops.productsserviceexample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import uy.edu.ort.devops.productsserviceexample.domain.Product;
import uy.edu.ort.devops.productsserviceexample.logic.ProductsLogic;

@SpringBootTest
class ProductsServiceExampleApplicationTests {

	ProductsLogic productsLogic = new ProductsLogic();
	Product producto = new Product("123", "Producto 123", 10, "Este es un producto");
	
	@Test
	void productsLogicTest() {
		assertEquals("Producto 123", productsLogic.getProduct("123").getName() );
		assertEquals("Producto 321", productsLogic.getProduct("321").getName() );
		assertEquals("Producto 111", productsLogic.getProduct("111").getName() );
		assertEquals("Producto 222", productsLogic.getProduct("222").getName() );
		assertEquals("Producto 333", productsLogic.getProduct("333").getName() );

	}

	@Test
	void productTest() {
		assertEquals("Producto 123",producto.getName() );
		assertEquals("123",producto.getId() );
		assertEquals(10,producto.getStock() );
		assertEquals("Este es un producto",producto.getDescription() );
	}


}
