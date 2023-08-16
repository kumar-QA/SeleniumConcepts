package radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRadioBtn {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site");
WebElement	maleradioBtn=driver.findElement(By.id("vfb-31-1"));
      maleradioBtn.click();
	
	int  a=10;
	
		 if(maleradioBtn.isSelected()) {
			 System.out.println("option is selected");
		 }else {
			 System.out.println("Not selected");
		 }
	}
}
