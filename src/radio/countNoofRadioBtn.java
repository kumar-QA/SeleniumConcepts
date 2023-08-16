package radio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countNoofRadioBtn {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/demo-site");
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='radio']"));
	    System.out.println("total button are: "+list.size());
	    
	    
	}

}
