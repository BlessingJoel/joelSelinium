import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InterActWithActiveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver();
WebDriver driver= new EdgeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
activeEL
	}

}
