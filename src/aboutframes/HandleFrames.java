package aboutframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement textbox=driver.findElement(By.id("name"));
		textbox.sendKeys("Hello Iam in Main Page");
		Thread.sleep(1000);
		WebElement FirstFrame=driver.findElement(By.id("frm1"));
		driver.switchTo().frame(FirstFrame);
		Thread.sleep(1000);
		WebElement dropDownBtn=driver.findElement(By.id("course"));
		Select  sel=new Select(dropDownBtn);
		sel.selectByVisibleText("Dot Net");
		driver.switchTo().defaultContent();
		textbox.clear();
		textbox.sendKeys("Iam Back To Main Page");
		
		WebElement SecondFrame=driver.findElement(By.id("frm2"));
		driver.switchTo().frame(SecondFrame);
		driver.findElement(By.id("firstName")).sendKeys("Iam in Frame2");
		
	}

}
