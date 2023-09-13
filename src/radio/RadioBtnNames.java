package radio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnNames {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site");
//		driver.manage().timeouts()
		
List<WebElement>radiobtnNames=driver.findElements(By.xpath("//input[@name=\"vfb-31\"]//following-sibling::label"));
	for (int i = 0; i < radiobtnNames.size(); i++) {
		System.out.println(radiobtnNames.get(i).getText());
	}
	}
}
