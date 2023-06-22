package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyPaseOpenSource {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		   WebDriverManager.edgedriver();
	        WebDriver driver = new EdgeDriver();
	        driver.get("https://www.facebook.com/login/");
	        driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"ac");
	        Thread.sleep(2000);
	        driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"av");

	}

}
