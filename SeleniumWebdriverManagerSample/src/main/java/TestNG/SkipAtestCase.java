package TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipAtestCase {
	public class PriorityTestNG {
		@Test(priority=0)
		public void starThecar() {
			System.out.println("Star the car");
		}
		@Test(priority=1)
		public void putfirstGear() {
		}
		@Test(priority=2)
		public void  putSecondGear() {
			}
		@Test(priority=3)
		public void putthirdGear() {
			throw new SkipException("");
}
	}
}
