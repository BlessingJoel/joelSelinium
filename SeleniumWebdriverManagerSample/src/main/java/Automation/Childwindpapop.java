package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Childwindpapop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriverManager.edgedriver();
	        WebDriver driver = new EdgeDriver();
	        driver.get("https://www.google.com");
	        String wh = driver.getWindowHandle();
	        System.out.println(wh);
	       // driver.close();
	}

}
