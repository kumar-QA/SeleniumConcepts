package handeAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoramlAlert {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();	
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
 //driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
		
//		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
//		Thread.sleep(2000);
////		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
//		
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
	    Alert elemnt=driver.switchTo().alert();
	    Thread.sleep(2000);
	    elemnt.sendKeys("Prasanna");
//	    elemnt.accept();
	    elemnt.dismiss();
		
		
		
		
	}

}
