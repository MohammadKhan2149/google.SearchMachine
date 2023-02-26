package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		
		WebElement boxA=driver.findElement(By.xpath("(//div[@id='column-a']"));
		WebElement boxB=driver.findElement(By.xpath("(//div[@id='column-b']"));
		
		Actions act=new Actions(driver);
   act.dragAndDropBy(boxA, 150,150).build().perform();		
   act.dragAndDrop(boxA, boxB).build().perform();		
			
		
		
	}

}
