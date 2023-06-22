package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyAligment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriverManager.edgedriver();
    WebDriver driver = new EdgeDriver();
     driver.get("https://demo.actitime.com/login.do");
     int x1=driver.findElement(By.id("username")).getLocation().getX();
      int x2= driver.findElement(By.name("pwd")).getLocation().getX();
    if(x1==x2)
{
  System.out.println("username & password textbox are properly aligned");
}
  else
 {
   System.out.println("username & password textbox are not properly aligned");
 }
//driver.close();
	}

}
