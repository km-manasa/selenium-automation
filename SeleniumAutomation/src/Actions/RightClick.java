package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement rc = driver.findElement(By.id("twotabsearchtextbox"));
	Actions a = new Actions(driver);
	a.contextClick(rc).perform();
	driver.close();
	
	
	
	}

}
