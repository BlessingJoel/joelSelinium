package Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoRobertClass {

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub
 WebDriverManager.edgedriver();
 WebDriver driver=new EdgeDriver();
// Runtime.getRuntime().exec("notepad");

 Runtime.getRuntime().exec("notepad");

//  Robot r = new Robot();
//
//  r.keyPress(KeyEvent.VK_SHIFT);
//  r.keyPress(KeyEvent.VK_Q);
//  r.keyRelease(KeyEvent.VK_SHIFT);
//
//  r.keyPress(KeyEvent.VK_S);
//  r.keyPress(KeyEvent.VK_P);
	}

}
