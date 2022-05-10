package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocators4 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/login/password");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("mobileNumberPass")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[2]")).sendKeys("Qwerty5");
		driver.findElement(By.xpath("//button[contains(@class,'btn primary')]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Myntra"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		 driver.close();
	
		
		
	

	}

}
