package Locator;
//xpath attribute method
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class xpath4 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click() ;  	// find create new account field and click to proceed
		
		
		
	
		
		//driver.findElement(By.xpath("xpathexpression")).sendKeys("user input data");  
		
		// findElement= finding element of webpage= username field and sendKeys to give input data
		
		
		// findElement(By args) - findElement() is webdriver method and By class contains static methods called locators
	}

}
