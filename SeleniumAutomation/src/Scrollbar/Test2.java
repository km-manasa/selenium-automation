package Scrollbar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none fluid-image-container'][1]"));
		Point loc = el.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window,scrollBy("+x+","+y+")");
		
		el.click();
		driver.close();
		

	}

}
