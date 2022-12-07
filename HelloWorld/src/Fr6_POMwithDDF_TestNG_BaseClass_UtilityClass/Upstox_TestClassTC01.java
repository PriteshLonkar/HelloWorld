package Fr6_POMwithDDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Fr5_POMwithDDF_TestNG.UpstoxHomePage;
import Practice_POMwithDDF.Upstox_Login1Page;
import Practice_POMwithDDF.Upstox_Login2Page;
import Practice_POMwithDDF.Upstox_WelcomePage;

public class Upstox_TestClassTC01 extends BaseClass
{


	Upstox_Login1Page login1;
	Upstox_Login2Page login2;
	Upstox_WelcomePage welcome;
	UpstoxHomePage home;
	
	
	@BeforeClass
	public void UpstoxOpenbrowser() throws EncryptedDocumentException, IOException 
	{ 
	 
	 	InitializeBrowser();   //open browser
	 
	  login1= new Upstox_Login1Page(driver);
	  login2= new Upstox_Login2Page(driver);
	  welcome= new Upstox_WelcomePage(driver);
      home = new UpstoxHomePage(driver);
	}
	
	
	@BeforeMethod
	public void UpstoxLoginToApp() throws EncryptedDocumentException, IOException 
	{
		 login1.inpUpstox_Login1Page_UN(UtilityClass.TestData(0,0));
		 login1.inpUpstox_Login1Page_Pass(UtilityClass.TestData(0,1));
		 login1.clickUpstox_Login1Page_Login();
		 
		 login2.inpUpstox_Login2Page_YOB(UtilityClass.TestData(0,2));
		 
		 welcome.clickUpstox_WelcomePage();
	}
	
	@Test
	public void VerifyProfileName() throws EncryptedDocumentException, IOException 
	{
		
		String ActResult = home.getUpstoxHomePageActPN();
	    String ExpResult = UtilityClass.TestData(0, 3);
		
		Assert.assertEquals(ActResult, ExpResult, "Results are failed");
	}
	
	
	@AfterMethod
	public void UpstoxLogoutFromApp() 
	{
		home.ClickUpstox_HomePage_Logout();
	}
	
	
	
	@AfterClass
	public void UpstoxCloseBrowser() 
	{
		driver.quit();
	}
	
	
	
	
}
