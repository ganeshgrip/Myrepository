package testcases;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testbase.Testbaseg;
import util.utileg;

import org.testng.annotations.*;


public class Dataprovideeg {
	@DataProvider(name="Authentication")
	public static Object[][] creds() throws Exception
	{
		//return new Object[][]
				//{{"alkarpahaganesh","home@@822377831"},{"sam","ram"}};
		utileg.setExcelData("C:\\Users\\karpaga\\eclipse-workspace\\autotest\\src\\main\\resources\\Autoscript.xlsx","Sheet1");
		Object [][] obj = utileg.getExcelData();
		return obj;

	}
  //Here we are calling data provider with its name;
	@Test(dataProvider="Authentication")
	public void test(String sUsername,String sPassword) throws Exception {
		
		Testbaseg t =new Testbaseg();
t.openBrowser();
		t.driver.findElement(By.id("email")).sendKeys(sUsername);
		t.driver.findElement(By.id("pass")).sendKeys(sPassword);
		t.driver.findElement(By.xpath("//input[@value='Log In']")).click();
		t.driver.close();

		
		
	}
	
}
