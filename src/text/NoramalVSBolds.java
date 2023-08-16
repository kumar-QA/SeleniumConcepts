package text;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoramalVSBolds {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		List<WebElement>countBoldText=driver.findElements(By.tagName("b"));
		List<WebElement>countNormalText=driver.findElements(By.tagName("p"));
		System.out.println("Bold Text Count "+countBoldText.size());
		System.out.println("Normal Text Count "+countNormalText.size());
		
	}

}
