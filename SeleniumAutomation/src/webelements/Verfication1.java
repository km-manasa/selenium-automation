package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verfication1 {
	public static void main(String args[]) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement dis = driver.findElement(By.id("twotabsearchtextbox"));
		 
		 if(dis.isDisplayed()) 
		 {
			 System.out.println("Pass:The element is present");
		 }
		 else
		 {
			 System.out.println("Fail:The element is not present");
		 }
		 driver.close();
		 
	}

}
