package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuiteExample {
	@Test(priority = 0)
	public void opengoogle() {
		long startTime=System.currentTimeMillis();
		WebDriverManager.edgedriver();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime= endTime-startTime;
		System.out.println("google--times==="+startTime);
		System.out.println("google--times==="+endTime);
		System.out.println("google--times==="+totalTime);
}
	@Test(priority = 1)
	public void openBing() {
		long startTime=System.currentTimeMillis();
		WebDriverManager.edgedriver();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.bing.com/");
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime2= endTime-startTime;
		System.out.println("google--times==="+startTime);
		System.out.println("google--times==="+endTime);
		System.out.println("bing--times==="+totalTime2);
		
	}
	@Test(priority = 2)
	public void openYahoo() {
		long startTime=System.currentTimeMillis();
		WebDriverManager.edgedriver();
		WebDriver driver=new EdgeDriver();
		driver.get("https://login.yahoo.com/");
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime3= endTime-startTime;
		System.out.println("google--times==="+startTime);
		System.out.println("google--times==="+endTime);
		System.out.println("yahoo--times==="+totalTime3);
	}
}