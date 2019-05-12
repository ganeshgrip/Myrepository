package config;

import org.openqa.selenium.By;

import testbase.Testbaseg;

public class UIActionKeyword extends Testbaseg{
public static void enterEmail()
{
	Testbaseg.driver.findElement(By.id("email")).sendKeys("alkarpahaganesh");
}
public static void enterPassword()
{
	Testbaseg.driver.findElement(By.id("pass")).sendKeys("home@@822377831");
	
}
public static void clickLogin()
{
	Testbaseg.driver.findElement(By.xpath("//input[@value='Log In']")).click();

}
public static void applyWait() throws Exception{
	Thread.sleep(2000);
}
public static void closeBrowser(){
	Testbaseg.driver.close();	
}



}