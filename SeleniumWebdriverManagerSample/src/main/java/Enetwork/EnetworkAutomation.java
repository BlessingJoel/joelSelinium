package Enetwork;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnetworkAutomation {

	
		WebDriver driver;
		@BeforeTest
		public void enetworkbrowser() {
			
		WebDriverManager.edgedriver();
      driver =new EdgeDriver();
   driver.navigate().to("https://enetwork.co.in/");
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		}
		@Test(priority =0,enabled = true)
		public void networksollution() throws Throwable {
    driver.findElement(By.xpath("//*[text()='Home'][1]")).click();
    
    Thread.sleep(3000);
    JavascriptExecutor executor=(JavascriptExecutor)driver;
  executor.executeScript("window.scroll(0,1000)", "");
    driver.findElement(By.xpath("(//*[text()='Datacenter Solutions'])[2]")).click();
    
    driver.navigate().back();
    Thread.sleep(3000);
    executor.executeScript("window.scroll(0,1200)", "");
    driver.findElement(By.xpath("(//*[text()='Digital Displays'])[4]")).click();
   driver.navigate().back();
    Thread.sleep(3000);
    executor.executeScript("window.scroll(0,1500)", "");
    driver.findElement(By.xpath("(//*[text()='Services'])[4]")).click();
    driver.navigate().back();
     Thread.sleep(3000);
     executor.executeScript("window.scroll(0,1700)", "");
     driver.findElement(By.xpath("(//*[text()='Printing & Imaging'])[4]")).click();
     driver.navigate().back();
    Thread.sleep(3000);
    executor.executeScript("window.scroll(0,1700)", "");
    driver.findElement(By.xpath("//*[text()='End User Computing']")).click();
    driver.navigate().back();
  executor.executeScript("window.scroll(0,1800)","");
  driver.findElement(By.xpath("//*[text()='3D printing Solutions']")).click();
  driver.navigate().back();
  executor.executeScript("window.scroll(0,1800)","");
  driver.findElement(By.xpath("//*[text()='More Solutions']")).click();
  
  driver.findElement(By.xpath("//*[@id='accordion-box']/li[1]/div[1]")).click();
  executor.executeScript("window.scroll(0,1800)","");
  driver.findElement(By.xpath("//*[@id=\'accordion-box\']/li[2]/div[1]")).click();
  executor.executeScript("window.scroll(0,1800)","");
  driver.findElement(By.xpath("//*[@id='accordion-box']/li[1]/div[1]")).click();
  driver.findElement(By.xpath("//*[@id='accordion-box']/li[4]/div[1]")).click();
  driver.findElement(By.xpath("//*[@id='accordion-box']/li[5]/div[1]")).click();
  driver.findElement(By.xpath("//*[@id='accordion-box']/li[6]/div[1]")).click();
  driver.findElement(By.xpath("//*[@id='accordion-box']/li[7]/div[1]")).click();
  driver.findElement(By.xpath("//*[@id='accordion-box']/li[8]/div[1]")).click();
  driver.findElement(By.xpath("//*[@id='accordion-box']/li[9]/div[1]")).click();
		}
      @Test(priority =1,enabled = true)
  public void Elshaddainetworksollution() throws Throwable {
      
    driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[3]/a")).click();
	 driver.findElement(By.xpath("(//*[text()='Active Network'])[1]")).click();
	 driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[3]/a")).click();
	 
	 driver.findElement(By.xpath("//*[text()='Cyber Security Solutions']")).click();
	 
     driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[3]/a")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//*[text()='Data Security'])[1]")).click();
  
	Thread.sleep(3000);
   driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[3]/a")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("(//*[text()='Network Security'])[1]")).click();
   driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[3]/a")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("//a[@routerlink='endpoint' and contains(@href,'/endpoint') and text()='End Point Security']")).click();
   driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[3]/a")).click();
   driver.findElement(By.xpath("//*[text()='Digital Displays']")).click(); 
   Thread.sleep(3000);
   driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[3]/a")).click();
   driver.findElement(By.xpath("//*[text()='Services']")).click();
   driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[3]/a")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("(//*[text()='Printing & Imaging'])[1]")).click(); 
   Thread.sleep(3000);
   driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[3]/a")).click();
   driver.findElement(By.xpath("(//*[text()='User Computing'])[1]")).click();
   driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[3]/a")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("(//*[text()='Accessories'])[1]")).click();
   WebElement to1 = driver.findElement(By.xpath("(//*[text()='Hard Disk'])[3]"));
   Actions act=new Actions(driver);
   act.moveToElement(to1).perform();
   
   WebElement to2 = driver.findElement(By.xpath("(//*[text()='RAM'])[3]"));
   Actions act1=new Actions(driver);
   act.moveToElement(to1).perform();
   
   WebElement to3 = driver.findElement(By.xpath("//*[text()='Original Laptop Battery, Compatible laptop Battery']"));
   Actions act2=new Actions(driver);
   act.moveToElement(to1).perform();
   
   WebElement to4 = driver.findElement(By.xpath("(//*[text()='Power Adapter'])[4]"));
   Actions act3=new Actions(driver);
   act.moveToElement(to1).perform();
   WebElement to5 = driver.findElement(By.xpath("(//*[text()='Power Adapter'])[4]"));
   Actions act4=new Actions(driver);
   act.moveToElement(to1).perform();
   
   WebElement to6 = driver.findElement(By.xpath("(//*[text()='Docking Stations'])[4]"));
   Actions act5=new Actions(driver);
   act.moveToElement(to1).perform();
   
   WebElement to7 = driver.findElement(By.xpath("//*[text()='Keyboard & Mouse']"));
   Actions act6=new Actions(driver);
   act.moveToElement(to1).perform();
   
      }
 
  //Solution page
@Test(priority =2,enabled = true)
public void Softwaresollutionpage() throws Throwable {
Thread.sleep(3000);
//By usage

	driver.findElement(By.xpath("(//*[text()='Software Solutions'])[1]")).click();
	driver.findElement(By.xpath("(//*[text()='3D Printers'])[1]")).click();
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-printer/section[3]"
			+ "/div/div/div[2]/div/div/div/div/ul/li[1]/div[1]")).click();
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-printer/section[3]"
			+ "/div/div/div[2]/div/div/div/div/ul/li[2]/div[1]")).click();
//Homeprinter
	
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-printer/section[3]"
		+ "/div/div/div[2]/div/div/div/div/ul/li[3]/div[1]")).click();		driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-printer/section[3]"
			+ "/div/div/div[2]/div/div/div/div/ul/li[4]/div[1]")).click();
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-printer/section[4]"			+ "/div/div/div[2]/div/div/div/div/ul/li[1]/div[1]")).click();
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-printer/section[4]"
			+ "/div/div/div[2]/div/div/div/div/ul/li[2]/div[1]")).click();
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-printer/section[4]"
			+ "/div/div/div[2]/div/div/div/div/ul/li[3]/div[1]")).click();
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-printer/section[4]"
	+ "/div/div/div[2]/div/div/div/div/ul/li[3]/div[1]")).click();
//Officeprinter
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-printer/section[5]"
			+ "/div/div/div[1]/div/div/div/div/ul/li[1]/div[1]")).click();
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-printer/section[5]"
			+ "/div/div/div[1]/div/div/div/div/ul/li[2]/div[1]")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-printer/section[5]"
			+ "/div/div/div[1]/div/div/div/div/ul/li[3]/div[1]")).click();	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-printer/section[5]"
			+ "/div/div/div[1]/div/div/div/div/ul/li[4]/div[1]")).click();
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-printer/section[5]"
			+ "/div/div/div[1]/div/div/div/div/ul/li[5]/div[1]")).click();
//	//Businessprinter
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-printer/section[6]"			+ "/div/div/div[2]/div/div/div/div/ul/li[1]/div[1]")).click();
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-printer/section[6]"
			+ "/div/div/div[2]/div/div/div/div/ul/li[2]/div[1]")).click();
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-printer/section[6]"
			+ "/div/div/div[2]/div/div/div/div/ul/li[3]/div[1]")).click();
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-printer/section[6]"
			+ "/div/div/div[2]/div/div/div/div/ul/li[4]/div[1]")).click();
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-printer/section[6]"
			+ "/div/div/div[2]/div/div/div/div/ul/li[5]/div[1]")).click();
	driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[4]/a")).click();	
	driver.findElement(By.xpath("(//*[text()=' Consultant'])[1]")).click();
	driver.findElement(By.xpath("//*[text()='Contact us']")).click();
	driver.findElement(By.name("name")).sendKeys("starc");
	driver.findElement(By.name("email")).sendKeys("commins");
	driver.findElement(By.name("number")).sendKeys("6382928743");
	driver.findElement(By.name("location")).sendKeys("australi");
	driver.findElement(By.xpath("//*[text()='Submit now']")).click();
}
	//footer page
	@Test(priority =3,enabled = true)
	public void EnetworkfooterArea() throws Throwable {
	
	
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/div[2]/footer/div[1]"
	+ "/div[1]/div/div[2]/div/div/ul[1]/li[1]/a")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/div[2]"
			+ "/footer/div[1]/div[1]/div/div[2]/div/div/ul[1]/li[2]/a")).click();
	Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/div/div[1]/div[2]/footer/div[1]"
			+ "/div[1]/div/div[2]/div/div/ul[1]/li[3]/a")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/div/div[1]/div[2]/footer/div[1]"
			+ "/div[1]/div/div[2]/div/div/ul[1]/li[4]/a")).click();
		Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/div[2]/footer/div[1]"
			+ "/div[1]/div/div[2]/div/div/ul[1]/li[5]/a")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/div[2]"
			+ "/footer/div[1]/div[1]/div/div[2]/div/div/ul[1]/li[6]/a")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/div[2]/footer/div[1]"
			+ "/div[1]/div/div[2]/div/div/ul[2]/li[1]/a")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/app-root/div/div[1]/div[2]/"
			+ "footer/div[1]/div[1]/div/div[2]/div/div/ul[2]/li[2]/a")).click();
	Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/div/div[1]/div[2]/footer/div[1]"
				+ "/div[1]/div/div[2]/div/div/ul[2]/li[3]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='popup']/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("name")).sendKeys("star");
		driver.findElement(By.name("email")).sendKeys("cool");
		driver.findElement(By.name("number")).sendKeys("6382928743");
		driver.findElement(By.name("location")).sendKeys("indian");
		driver.findElement(By.name("message")).sendKeys("SmS");
		driver.findElement(By.xpath("//*[text()=' Send Message ']")).click();
		
//		
//		WebElement alert1=driver.findElement(By.xpath("//*[text()='Front Desk: +91 9655604379']"));
//		alert1.click();
//		
//		Alert alert3=driver.switchTo().alert();
//		alert3.dismiss();

}	

  		@AfterTest(enabled = false)
   public void closed() {
	   driver.quit();
   		}
}
  		
    		
    		
  
	 
    
	
	


