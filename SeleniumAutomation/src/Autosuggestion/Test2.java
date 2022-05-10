package Autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement a = driver.findElement(By.xpath("(//input[@class='gLFyf gsfi'])"));
    a.sendKeys("autom");
    
    Thread.sleep(3000);
	 List<WebElement> b = driver.findElements(By.xpath("(//li[@class='sbct'])"));
	System.out.println(b.size());
	
	for(WebElement c:b)
	
	{
		System.out.println(c.getText());
	}
	driver.close();
	

	} 

}
