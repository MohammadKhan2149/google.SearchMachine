package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		Actions act=new Actions(driver);
		WebElement box1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		WebElement box2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
		if(box1.isSelected()) {
			System.out.println("checkbox 1 is selected");
			
			
		}
		else {
			box1.click();
			box2.click();
			
		}
		
	}

}
