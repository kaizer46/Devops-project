package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.dvops.maven.eclipse.Cart;
import com.dvops.maven.eclipse.Furniture;

class cart_test {
	private	Cart C;
	private Furniture s1;
	private Furniture s2;
	private Furniture s3;
	private Furniture s4;
	private final int CARTSIZE = 3;

	@BeforeEach
	void setUp() throws Exception {
		C = new Cart();
		s1 = new Furniture("1","GreySofa","GreySofa.jpg","2500");
		s2 = new Furniture("2","GreyTable","GreyTable.jpg","2000");
		s3 = new Furniture("3","GreySofa2","GreySofa2.jpg","800");
		C.addCart(s1);
		C.addCart(s2);
		C.addCart(s3);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetCart() {
		fail("Not yet implemented");
	}

	@Test
	void testAddCart() {
	//fail("Not yet implemented");
		List<Furniture> testC = C.getCart();
		assertEquals(testC.size(), CARTSIZE);
		C.addCart(s1);
		assertEquals(C.getCart().size(),CARTSIZE+1);
	
	}

}
