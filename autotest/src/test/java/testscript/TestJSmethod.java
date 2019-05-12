package testscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import helper.Screenshotcapture;

import helper.JSExecutermethod;
import testbase.Testbaseg;
public class TestJSmethod {
	public static void main(String[] args) throws Exception {
		new Testbaseg();
		Testbaseg.openBrowser();
		Testbaseg.navigate();
		WebElement fg=Testbaseg.driver.findElement(By.linkText("Forgotten account?"));
		JSExecutermethod.clickElementByJS(fg,Testbaseg.driver);	
		WebElement fg1=Testbaseg.driver.findElement(By.linkText("Login help"));
		JSExecutermethod.scrollIntoView(fg1,Testbaseg.driver);	
		JSExecutermethod.drawBorder(fg1,Testbaseg.driver);	
		Screenshotcapture.getScreenshot(Testbaseg.driver,"KG");
	}	

}
