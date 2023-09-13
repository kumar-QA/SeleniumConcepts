package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		
		WebElement srcElement=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement desElement=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act=new Actions(driver);
		
//		act.clickAndHold(srcElement)
//		.moveToElement(desElement).release().perform();
	
		act.dragAndDrop(srcElement, desElement).build().perform();
		
	}

}
