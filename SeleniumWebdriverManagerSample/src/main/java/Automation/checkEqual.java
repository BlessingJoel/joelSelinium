package Automation;

import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class checkEqual {
	
	public void check() {
		
         Assert.assertEquals("king", "king");
         Assert.assertNotEquals("not", "king");
         Assert.assertTrue(true,"This should not be true");
         
         
         
         
         
}
}
