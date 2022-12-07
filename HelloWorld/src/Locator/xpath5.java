package Locator;
// xpath attribute method
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class xpath5 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjYzNTc4OTQ3LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&ars=facebook_login']")).click() ;  	// find create new account field and click to proceed
		
		
		
	
		
		//driver.findElement(By.xpath("xpathexpression")).sendKeys("user input data");  
		
		// findElement= finding element of webpage= username field and sendKeys to give input data
		
		
		// findElement(By args) - findElement() is webdriver method and By class contains static methods called locators
	}

}
