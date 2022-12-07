package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathGmap1 
{
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\Selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/maps/dir///@18.7360445,73.7147664,15z");
		
		driver.findElement(By.xpath("//input[@aria-label=\"Choose starting point, or click on the map...\"]")).sendKeys("my location");
		
	    driver.findElement(By.xpath("//button[@class=\"mL3xi\"]")).click();
		
	    driver.findElement(By.xpath("//input[@placeholder=\"Choose destination...\"]")).sendKeys("pune");

	
		
		driver.findElement(By.xpath("//button[@jstcache=234]")).click();
	}

}



