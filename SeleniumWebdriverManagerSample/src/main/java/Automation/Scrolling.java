package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {

	  @Test
	public void m1() {
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.get("https://docs.phptravels.com/");
		//scrolBar1
		//WebElement element1 = driver.findElement(By.xp);
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/nav/div[1]/div[2]/div/div"
				+ "[4]/div[2]/div[1]/div/a/div"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		element.click();
		
		
		//scrollBar2
//		WebElement element1 = driver.findElement(By.xpath("//*[text()='License Error'][1]"));
//		JavascriptExecutor js1=(JavascriptExecutor)driver;
//		js.executeScript("argument[20].scrollIntoView();", element);
//		element.click();
//		Thread.sleep(4000);
		
		
		
		
	}

}
