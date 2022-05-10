package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	
     Dimension sz = search.getSize();
     System.out.println(sz.getHeight());
     System.out.println(sz.getWidth());
     
	
	driver.close();
	
	
	
	

	}

}
