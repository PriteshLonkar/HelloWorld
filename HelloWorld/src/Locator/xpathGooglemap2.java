package Locator;
// search pune airport on google map

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathGooglemap2 
{
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\Selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/maps/@18.7360445,73.7147664,15z");
		
		driver.findElement(By.xpath("//input[@aria-label=\"Search Google Maps\"]")).sendKeys("pune airport");
		
	   driver.findElement(By.xpath("//button[@id='searchbox-searchbutton']")).click();
		
	

	
		
	}

}



