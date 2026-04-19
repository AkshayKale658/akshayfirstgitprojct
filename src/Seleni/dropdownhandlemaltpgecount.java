package Seleni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class dropdownhandlemaltpgecount {
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
		
		System.out.println("total countriess present in dropdown are:"+countryList.size());
		
		List<WebElement> linkCount=driver.findElements(By.xpath("//a"));

//                driver.navigate().to("https://demo.guru99.com/test/newtours/homepage.php"); for another page count navigate, locate,in 
//                                  xpath give only (//"a") anchor tag

		
		int regiStrationPageLinkCOunt=linkCount.size();
		int HomePageLinkCOunt=linkCount.size();
		int allLinkscount=regiStrationPageLinkCOunt+HomePageLinkCOunt;
		
		System.out.println("Links count:" +linkCount.size());
		
		List<WebElement> ImgCount=driver.findElements(By.xpath("//img"));
		
		System.out.println("images count:" +ImgCount.size());
		
		List<WebElement> BtnCount=driver.findElements(By.xpath("//button"));
		
		System.out.println("Button count:" +BtnCount.size());
		
		
		

	}

}




	

