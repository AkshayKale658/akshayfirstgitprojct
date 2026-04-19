package Seleni;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Curentsiglwindowhandling {

	public static void main(String[] args) throws InterruptedException {
		   
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
				

				
				WebDriver driver=new ChromeDriver();
				
		        driver.manage().window().maximize();
		        driver.navigate().to("https://demo.guru99.com/popup.php");
		        
		        String parentWindow=driver.getWindowHandle();   //stores the ID of current window
				
				WebElement link=driver.findElement(By.xpath("//a[text()='Click Here']"));
				link.click();
				
				Set<String> allwindows=driver.getWindowHandles();   // stores ID of all windows opened by the selenium
				
				for(String childWindow:allwindows)
				{
					while(!parentWindow.equals(childWindow)) {
							driver.switchTo().window(childWindow);    // transfer control to new/child windows
							WebElement emaildFiled =driver.findElement(By.xpath("//input[@name='emailid']"));
							emaildFiled.sendKeys("lahu@gmail.com");
							
							WebElement submitBtn=driver.findElement(By.xpath("//input[@name='btnLogin']"));
							submitBtn.click();
							
					}
				}
				
				
				
				
				

			}

	}

