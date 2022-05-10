package Frames;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCount {

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
		  
		 List<WebElement> all = s.getOptions();
		 System.out.println(all.size());
		 

		for( WebElement a:all)
		 {
			 System.out.println(a.getText());
			 
		 }
		driver.close();
		
		 

	}

}
