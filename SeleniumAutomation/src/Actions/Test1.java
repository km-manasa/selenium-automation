package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
    WebElement mh = driver.findElement(By.xpath("//a[@data-group=\"home-&-living\"]"));
	Actions a = new Actions(driver);
	a.moveToElement(mh).perform();
	 driver.findElement(By.xpath("//a[text()='Wall Décor']")).click();
	
	
	

	}

}
