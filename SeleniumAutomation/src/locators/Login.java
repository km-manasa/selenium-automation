package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("hrncjce");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("15236");
	    driver.findElement(By.name("login")).click();
	
		
		
		

	}

}
