package webelements;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) 
	{
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 WebElement un = driver.findElement(By.id("username"));
	 un.clear();
	 WebElement pd = driver.findElement(By.id("password"));
	 pd.clear();
	 WebElement sb = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
     sb.submit();
     
	 driver.close();
	 
	 
	 
	 
	
	
	 

	}

}
