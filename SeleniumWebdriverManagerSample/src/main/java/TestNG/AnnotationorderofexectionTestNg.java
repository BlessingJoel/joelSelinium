package TestNG;

import java.security.PublicKey;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationorderofexectionTestNg {
	@Test

	public void test() {
		System.out.println();
	}
	@BeforeMethodoo
	public void beforeMethod() {
		System.out.println("before method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
		}
	@BeforeClass
	public void beforeclass() {
	System.out.println("before class");
	
	}
		@AfterClass 
		public void afterClass() {
			System.out.println("After class");
			
}
	@AfterTest
	public void beforeTest() {
		System.out.println("After test");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
		
	}
		@AfterSuite
		public void afterSuite() {
		
	}
	
}
