package mouseactions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToParticularElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		WebElement menu=driver.findElement(By.id("blogsmenu"));
		WebElement particularlink=driver.findElement(By.xpath("//span[contains(text(),'SeleniumOneByArun')]"));
	
		act.moveToElement(menu)
		.moveToElement(particularlink).click().perform();
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		
		
//				driver.findElement(By.name("fname")).clear();
//				driver.findElement(By.name("fname")).sendKeys("hello");
//				act.doubleClick(driver.findElement(By.name("fname")));
//				

				WebElement textbox=driver.findElement(By.name("fname"));		
		                   textbox.clear();
		                   textbox.sendKeys("Hello");
		             act.doubleClick(textbox).perform();
		
		
		
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement btn=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Thread.sleep(2000);
		act.contextClick(btn).perform();
		
		WebElement editLink=driver.findElement(By.xpath("(//span[contains(text(),'Edit')])[2]"));
		
		editLink.click();
		
//		String alertText=driver.switchTo().alert().getText();
//		driver.switchTo().alert().accept();
	     
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		
	}

}
