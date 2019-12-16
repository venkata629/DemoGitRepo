package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TestNgDemo {

	
	@Test
	public void sum() {
		System.out.println("Sum");
		
		int a =10;
		int b =20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void subtract() {
		System.out.println("Subtract");
		
		int a =10;
		int b =20;
		Assert.assertEquals(10, b-a);
	}
	
	@Test
	public void Division() {
		System.out.println("Division");
		
		int a =10;
		int b =20;
		Assert.assertEquals(2, b/a);
	}
	
	@Test
	public void Multi() {
		System.out.println("Multi");
		
		int a =10;
		int b =20;
		Assert.assertEquals(200, a*b);
	}
}
