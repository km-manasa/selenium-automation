package Autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebElement auto = driver.findElement(By.name("keyword"));
     auto.sendKeys("a");
     
     List<WebElement> sugg = driver.findElements(By.xpath("(//li[@class='ui-menu-item'])"));
     System.out.println(sugg.size());

	
     for(Object z:sugg)
     {
    	 System.out.println(((WebElement) z).getText());
    	 
     }
     driver.close();
	}

}
