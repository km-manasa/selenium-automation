package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		
		
		
		Thread.sleep(3000);
		driver.navigate().to("https://Skillrary.com");
		
		//BACK
		driver.navigate().back();
		
		//Forward
		driver.navigate().forward();
		
		//Refresh
		driver.navigate().refresh();
		
		
		driver.close();
	

	}

}
