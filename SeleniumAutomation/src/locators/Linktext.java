package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("identify_email")).sendKeys("jfvhu");
		Thread.sleep(3000);
		driver.findElement(By.id("did_submit")).click();
		
	

	}

}
