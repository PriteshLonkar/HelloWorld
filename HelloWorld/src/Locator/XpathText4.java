package Locator;
// xpath by text
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathText4 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\Selenium\\\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	//open flipkart
	driver.get("https://www.flipkart.com/");
	
	
	//username enter- 9604628674
	driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("9604628674"); // xpath by attribute
	
	Thread.sleep(2000);
	
	// click on create new account
	//xpath by text
	driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']")).click(); // create new account 
	
	//input mobile no
   driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("9604628674"); // input mobile no
// xpath by attribute
   
   //click on login
   driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
}
}

