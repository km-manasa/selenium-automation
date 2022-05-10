package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream fis = new FileInputStream("./project url.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	String un = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	String pd = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("email")).sendKeys(un);
	driver.findElement(By.id("pass")).sendKeys(pd);
	
	
	

	}

}
