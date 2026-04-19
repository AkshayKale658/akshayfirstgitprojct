package Seleni;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators 
{
	
	private static final WebElement Addtocart = null;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub	
		System.setProperty("webdriver.chrome.driver","E:\\Software\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://cloudeccountant.com/");
		
		
driver.navigate().to("https://www.saucedemo.com/");   // open particular site
		
		WebElement un,pass,loginBtn;
		
		un=driver.findElement(By.name("user-name"));
		un.sendKeys("standard_user");
		
		pass=driver.findElement(By.name("password"));
		pass.sendKeys("secret_sauce");
		
		loginBtn=driver.findElement(By.name("login-button"));
		loginBtn.click();
		
//		WebElement productLink=driver.findElement(By.linkText("Sauce Labs Backpack"));
		WebElement productLink=driver.findElement(By.partialLinkText("Sauce Labs Backpac"));
		productLink.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().back();     // it take back to previous page
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().forward();  // it take to page which is open after particular click
		driver.navigate().refresh();
		
		WebElement addtocart=driver.findElement(By.name("add-to-cart"));
		addtocart.click();
		 
		
		driver.navigate().forward();

	}


		
	}

		