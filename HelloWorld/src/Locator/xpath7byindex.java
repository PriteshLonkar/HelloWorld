package Locator;
// xpath attribute method// by index
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class xpath7byindex 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		// close sign up
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click() ;    
		
		
		
		//click on mobiles
		driver.findElement(By.xpath("//div[@class=\"eFQ30H\"][2]")).click() ;  	
				
		//back to homepage
		driver.findElement(By.xpath("//img[@title=\"Flipkart\"]")).click();
		driver.navigate().refresh();
		
		// click on fashion
		driver.findElement(By.xpath("//div[@class=\"eFQ30H\"][3]")).click() ;  	
		
       //back to homepage
		driver.findElement(By.xpath("//img[@title=\"Flipkart\"]")).click();
	}
}       
