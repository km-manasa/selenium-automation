package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExpression 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("cdycbdch");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("niefei");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		System.out.println(driver.getTitle());
        driver.close();
		

		
		
	

	}

}



