package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocators2 {

	public static void main(String[] args)
	{
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.instagram.com/");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.findElement(By.name("username")).sendKeys("admin");
     driver.findElement(By.name("password")).sendKeys("Qwerty5");
     driver.findElement(By.xpath("//div[contains(@class,'qF0y9')][3]")).click();
     String title=driver.getTitle();
     System.out.println(title);
     if(title.equals("Instagram"))
     {
    	 System.out.println("PASS");
     }
     else
     {
    	 System.out.println("FAIL");
     }
     String url=driver.getCurrentUrl();
     System.out.println(url);
     driver.close();
     
     
     
     
     

	}
}
