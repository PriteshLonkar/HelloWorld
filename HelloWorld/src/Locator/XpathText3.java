package Locator;
// xpath by text
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathText3 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\Selenium\\\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("9604628674"); // xpath by attribute
	
	driver.findElement(By.xpath("//button[text()='Request OTP']")).click();//    //tagName[text()='text value']
	// xpath by attribute
	
	
}
}
