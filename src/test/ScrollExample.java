package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		//wait for 5 sec for your browser to load
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		
		//arg[0] means the number of the element, there could be a few, then arg[1] to use the second one
		
		WebElement element = driver.findElement(By.xpath("//h2[text()='Table Rows']"));
		
		WebElement element1 = driver.findElement(By.xpath("//h2[text()='HTML Exercises']"));
		
		JavascriptExecutor obj = (JavascriptExecutor) driver;
		obj.executeScript("arguments[1].scrollIntoView();", element, element1);
		
		
		//to scroll to the bottom of the page
		//obj.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		
		
		//to scroll up
		//obj.executeScript("window.scrollTo(0,-document.body.scrollHeight);");
		
		driver.close();
	}
}
