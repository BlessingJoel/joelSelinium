import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Automation.FileinputStream;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatecamwithProduct {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver();
		WebDriver driver =new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream fes1=new FileInputStream("./src/test/resources/xcelfile");
		Properties fe2=new Properties();
		fe2.load(fes1);
		
		String URL = fe2.getProperty("url");
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(fe2.getProperty("mail"));
		driver.findElement(By.id("pass")).sendKeys(fe2.getProperty("pass"));
		
	}

}
