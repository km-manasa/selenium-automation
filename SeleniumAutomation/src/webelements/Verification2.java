package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification2 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebElement enb = driver.findElement(By.id("gh-ac"));
	    if(enb.isEnabled())
	    {
	    	System.out.println("Pass:The element is enabled");
	    }
	    else
	    {
	    	System.out.println("Fail:The element is disabled");
	    	
	    }
	    driver.close();
	    

	}

}
