package Seleni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Dropdownhandle {
 
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub	
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		

		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		
//		WebElement selCountry=driver.findElement(By.xpath("//select[@name='country']"));
//		
//		Select sel=new Select(selCountry);
		
//		sel.selectByVisibleText("INDIA");
//		sel.selectByVisibleText("ZIMBABWE");
//		sel.selectByIndex(10);
//		sel.selectByValue("SWITZERLAND");
		
		
		List<WebElement> countryList=driver.findElements(By.xpath("//select[@name='country']/option"));
		
		for(WebElement wb:countryList)
		{
			String countryName=wb.getText();
			
			if(countryName.equals("AMERICAN SAMOA")) {
				wb.click();
			}
		}
		
		
		

	}

}



