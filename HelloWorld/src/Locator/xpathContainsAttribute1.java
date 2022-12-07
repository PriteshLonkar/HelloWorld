package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathContainsAttribute1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/l/29701334031");
		
		// click on amazon logo
		// xpath by contains attribute
		driver.findElement(By.xpath("//a[contains(@id, 'nav-logo')]")).click();
		
		// click on sign in
		// xpath by index for multiple matching expression
		driver.findElement(By.xpath("//a[contains(@class, 'nav-a nav-a-2   nav-progressive')][2]")).click();
		
		
		
	}

}
