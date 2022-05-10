package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
	WebDriver driver =  new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
	 WebElement b1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	WebElement b3 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
	Actions a = new Actions(driver);
	a.dragAndDrop(b1, b3).perform();
	

	}

}
