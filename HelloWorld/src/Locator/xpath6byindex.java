package Locator;
// xpath attribute method// by index
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class xpath6byindex 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		// close sign up
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click() ;    
		
		// click on Top offers
		driver.findElement(By.xpath("//div[@class=\"eFQ30H\"][1]")).click() ;  	
		
		//back to homepage
		driver.navigate().refresh();
		driver.navigate().back();
		
		
		
	}
}       
