package Locator;
// xpath by text
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathContainsText1 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\Selenium\\\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	//open flipkart
	driver.get("https://www.flipkart.com/");
	
	
	// click on create new account
	//xpath by text
	driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']")).click(); // create new account 
	
	
}
}

