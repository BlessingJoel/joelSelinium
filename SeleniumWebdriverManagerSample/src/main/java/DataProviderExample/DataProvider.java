package DataProviderExample;

import org.testng.annotations.Test;

public class DataProvider {
	@Test(dataProvider ="star")
	public void bookTicket(String src,String des)
	{
System.out.println("Book tickets from" +src+ "to" +des);
	}
	
  @org.testng.annotations.DataProvider(name = "star")	
  public Object[][] dataProvider()
{
     Object[][] objarr=new Object[3][2];
     objarr[0][0]="Banglore";
     objarr[0][1]="goa";
     
     objarr[1][0]="Banglore";
     objarr[1][1]="Mysore";
     
     objarr[2][0]="Banglore";
     objarr[2][1]="Hyd";
     return objarr;
}
}
     
     
     