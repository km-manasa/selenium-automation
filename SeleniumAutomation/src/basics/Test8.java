package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.navigate().forward();
		 driver.navigate().refresh();
		 
		 driver.manage().window().fullscreen();
		 
		 driver.close();
		 
		

	}

}
