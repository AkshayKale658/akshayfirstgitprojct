package Seleni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatr {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub	
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
		driver.navigate().to("https://www.saucedemo.com/");   // open particular site
		
		WebElement un,pass,loginBtn;
		
		un=driver.findElement(By.name("user-name"));
		un.sendKeys("standard_user");
		
		pass=driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
		
		loginBtn=driver.findElement(By.id("login-button"));
		loginBtn.click();
	
	}
}
