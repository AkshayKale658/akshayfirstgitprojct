package Seleni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String[] args) throws InterruptedException {
   
		
System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		

		
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/alerts\r\n");
        		WebElement promtBttn=driver.findElement(By.xpath("//button[@id='promtButton']"));
        		promtBttn.click();
        		
        		org.openqa.selenium.Alert alert=driver.switchTo().alert();
        		
        		Thread.sleep(3000);
        		
        		alert.sendKeys("MAI TERA HERO");
        		alert.accept();
        		alert.dismiss();
        		System.out.println(alert.getText());
        		
        		
        		
        		
        		
        		
	}
}
