package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocators5 {

	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("admin");
	driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).sendKeys("Qwerty5");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
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
