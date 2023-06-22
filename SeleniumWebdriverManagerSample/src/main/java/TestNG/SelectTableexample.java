package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectTableexample {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver();
WebDriver driver= new EdgeDriver();
driver.get("http://www.leafground.com/pages/autoComplete.html");
//WebElement input=driver.findElement(By.id("tags"));
//input.sendKeys("s");
//Thread.sleep(4000);
// List<WebElement> optionsList = driver.findElements(By.xpath("//*[@id='ui-1']/1i"));
// System.out.println(optionsList.size());

	}

}
