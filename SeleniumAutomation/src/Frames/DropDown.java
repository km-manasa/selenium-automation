package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebElement dd = driver.findElement(By.id("searchDropdownBox"));
	Select s = new Select(dd);
	 s.selectByIndex(3);
	 s.selectByValue("search-alias=fashion");
	 s.selectByVisibleText("Appliances");
	 
	 driver.close();
	 
	

	}

}
