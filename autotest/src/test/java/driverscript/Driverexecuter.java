package driverscript;

import config.UIActionKeyword;
import testbase.Testbaseg;
import util.utileg;

public class Driverexecuter {

	public static void main(String[] args) throws Exception {
		Testbaseg b=new Testbaseg();
	String sPath ="G:\\BensentTech\\KeywordDrivenFW.xlsx";

	utileg.setExcelData(sPath, "Sheet1");
	
	for(int iRow=1;iRow<=7;iRow++)
	{
		String sActionKeyword =utileg.getCellData(iRow, 3);
		if(sActionKeyword.equals("openBrowser"))
		{
			UIActionKeyword.openBrowser();
					}
		else if(sActionKeyword.equals("navigate"))
		{
			UIActionKeyword.navigate();
					}
		else if(sActionKeyword.equals("enterEmail")){
			UIActionKeyword.enterEmail();
					}
		else if(sActionKeyword.equals("enterPassword")){
			UIActionKeyword.enterPassword();
					}
		else if(sActionKeyword.equals("clickLogin")){
			UIActionKeyword.clickLogin();;
					}
		else if(sActionKeyword.equals("applyWait")){
			UIActionKeyword.applyWait();
					}
		else if(sActionKeyword.equals("closeBrowser")){
			UIActionKeyword.closeBrowser();
					}
	}
	}
}

