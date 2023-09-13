package radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRadioBtn {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site");
WebElement	radioBtn=driver.findElement(By.id("vfb-31-6"));
      radioBtn.click();
	
	
		 if(radioBtn.isSelected()) {
			 System.out.println("option is selected");
		 }else {
			 System.out.println("Not selected");
		 }
	}
}
