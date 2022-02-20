package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			
			WebDriver driver = new ChromeDriver();
//			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			
			driver.manage().window().maximize();
			
			//wait for 5 sec for your browser to load
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			List<WebElement> tbRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
			System.out.println("Total Rows are " + tbRows.size());
			
			List<WebElement> tbColumns = driver.findElements(By.xpath("//table[@id='customers']//th"));
			System.out.println("Total Columns are " + tbColumns.size());
			
			//to display the data in line#3
			
			List<WebElement> tbData = driver.findElements(By.xpath("//table[@id='customers']//tr[4]/td"));
			for (WebElement elm : tbData) {
			System.out.println(elm.getText());
			}
						
			
			
			//find and print all the data in the first column 
			//*add a row of numbers to the left
			
			List<WebElement> tbColumnOne = driver.findElements(By.xpath("//table[@id='customers']//tr/td[1]"));
			
			int i = 1;
			for (WebElement clm : tbColumnOne) {
				System.out.print(i++);
				System.out.println("\t" + clm.getText());
			}
			
			driver.close();
			
			
			}
			
		}


