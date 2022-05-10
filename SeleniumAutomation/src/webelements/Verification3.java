package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification3 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		  WebElement sel = driver.findElement(By.name("sex"));
		 
		 if(sel.isSelected())
		 {
			 System.out.println("Pass");
		 }
		 else
		 {
			 System.out.println("Fail");
		 }
		 driver.close();

	}

}
