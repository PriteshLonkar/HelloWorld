package Locator;
//xpath attribute method
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class xpath1 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		                            // "//tagName[@attribute name= 'Attribute value']"
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz");  // find username field and put data as xyz
		
		
		
		
		//driver.findElement(By.xpath("xpathexpression")).sendKeys("user input data");  
		
		// findElement= finding element of webpage= username field and sendKeys to give input data
		
		
		// findElement(By args) - findElement() is webdriver method and By class contains static methods called locators
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
