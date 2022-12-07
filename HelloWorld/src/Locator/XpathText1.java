package Locator;
// xpath by text
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathText1 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\Selenium\\\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();//    //tagName[text()='text value']
}
}
