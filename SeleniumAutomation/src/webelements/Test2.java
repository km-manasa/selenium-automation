package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) 
	{
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebElement loc = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
	 System.out.println(loc.getText());
	 
	 driver.close();
	 
	 
	 
	 
	 
	 

	}


	}


