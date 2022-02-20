package test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		
		//wait for 5 sec for your browser to load
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		String ParentWin = driver.getWindowHandle();
		System.out.println("Before clicking: " + ParentWin);
		
		WebElement element = driver.findElement(By.xpath("//button[@id='windowButton']"));
		element.click();
		
		System.out.println("After clicking new window button");
		
		// SET doesn't allow duplicate values
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> itr = handles.iterator();
		
		while (itr.hasNext()) {
			
			String currentVal = itr.next();
			System.out.println(currentVal);
			
			if (!currentVal.equals(ParentWin)) {
				driver.switchTo().window(currentVal);
			}
			
		}
		
		WebElement heading = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(heading.getText());
		
		driver.close();		//to close the current window
		
		driver.switchTo().window(ParentWin); 	//switch back to the original window
		
		WebElement element1 = driver.findElement(By.xpath("//button[@id='tabButton']"));
		element1.click();
		
		
		//driver.quit();		//to close all the windows
	}

}
