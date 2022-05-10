package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocators3 {

	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://brandregistry.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("ap_email")).sendKeys("admin");
	driver.findElement(By.id("ap_password")).sendKeys("Qwerty5");
	driver.findElement(By.id("signInSubmit")).click();
	String title=driver.getTitle();
	System.out.println(title);
	if(title.equals("Amazon Sign In"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	String url=driver.getCurrentUrl();
	System.out.println(url);
	driver.close();
	
	
	

	}

}
