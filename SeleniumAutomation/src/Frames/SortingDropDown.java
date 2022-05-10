package Frames;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortingDropDown {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.findElement(By.linkText("Create New Account")).click();
		 WebElement chk = driver.findElement(By.name("birthday_month"));
		Select s = new Select(chk);
		 //s.selectByIndex(3);
		 //s.selectByValue("5");
		 //s.selectByVisibleText("Feb");
		 System.out.println(s.isMultiple());
		  
		 List<WebElement> all = s.getOptions();
		 System.out.println(all.size());
		 
		 ArrayList al=new ArrayList<>();
		 
		 for(WebElement opp:all)
		 {
			 String text = opp.getText();
			 al.add(text);
			 System.out.println(text);
			 
		 }
		 Collections.sort(al);
		 System.out.println("After sorting");
		 for(Object b:al)
		 {
		 
		System.out.println(b);
		 }
driver.close();

	}

}
