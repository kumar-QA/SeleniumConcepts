package radio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectFromList {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site");
	List<WebElement>noofBtn=driver.findElements(By.xpath("//input[@type='radio']"));
	List<WebElement>radiobtnNames=driver.findElements(By.xpath("//input[@name=\"vfb-31\"]//following-sibling::label"));
	for (int i = 0; i < radiobtnNames.size(); i++) {
		if(radiobtnNames.get(i).getText().equalsIgnoreCase("other")) {
			noofBtn.get(i).click();
			if(noofBtn.get(i).isSelected()) {
				System.out.println("button is selected");
			}else {
				System.out.println("Not selected");
			}
			
			
		}
	}
	
	}

}
