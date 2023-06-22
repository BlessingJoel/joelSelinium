package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipagePage {
      
	@Test
	public void m1() {
		
		WebDriverManager.edgedriver();
		WebDriver driver= new EdgeDriver();
		driver.get("https://thronerecliners.com/#/");
		
	}
	
}
