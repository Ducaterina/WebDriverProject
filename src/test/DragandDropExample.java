package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		//wait for 5 sec for your browser to load
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement From = driver.findElement(By.xpath("//li[@id='credit2']/a"));
		
		WebElement To = driver.findElement(By.xpath("//ol[@id='bank']/li"));
		
		Actions act = new Actions (driver);
		
		act.dragAndDrop(From, To).build().perform();
		
		
		
		WebElement From1 = driver.findElement(By.xpath("//li[@id='fourth']/a"));
		
		WebElement To1 = driver.findElement(By.xpath("//ol[@id='amt7']/li"));
		
		Actions act1 = new Actions (driver);
		
		act.dragAndDrop(From1, To1).build().perform();
	
		
		//act.contextClick(); //right click
		
		//doubleClick(): Performs double click on the element
		//clickAndHold(): Performs long click on the mouse without releasing it
		//dragAndDrop(): Drags the element from one point and drops to another
		//moveToElement(): Shifts the mouse pointer to the center of the element
		//contextClick(): Performs right-click on the mouse
		
	
	}

}
