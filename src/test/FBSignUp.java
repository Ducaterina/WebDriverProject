package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
				
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		WebElement SignUp = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		SignUp.click();
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		WebElement Surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		WebElement Email = driver.findElement(By.xpath("//*[@aria-label='Mobile number or email address']"));
		
		WebElement DupEmail = driver.findElement(By.xpath("//*[@aria-label='Re-enter email address']"));
		
		WebElement NewPsw = driver.findElement(By.xpath("//input[@data-type='password']"));
		
		FirstName.sendKeys("Amanda");
		Surname.sendKeys("Stone");
		Email.sendKeys("abc@xyz.com");
		DupEmail.sendKeys("abc@xyz.com");
		NewPsw.sendKeys("abcd123");
		
		String strGender = "Female";
		
		//label[text()='Female']/following-sibling::input
		
		//creating the dynamic xpath
		
		String genXpath = "//label[text()='" + strGender + "']/following-sibling::input";
		
		WebElement gen = driver.findElement(By.xpath(genXpath));
		gen.click();
		
		
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		Select ddDay = new Select(Day);
		ddDay.selectByVisibleText("13");
		
		
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		Select ddMonth = new Select(Month);
		ddMonth.selectByVisibleText("Jul");
		
		
		WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
		Select ddYear = new Select(Year);
		ddYear.selectByVisibleText("2000");
		
		
		//driver.close();
		
		
		/*
		 * List<WebElement> Months =
		 * driver.findElements(By.xpath("//select[@title='Month']/option"));
		 * 
		 * for (WebElement elm : Months) { System.out.println(elm.getText()); }
		 * 
		 * // to choose the current month (also a dynamic value) WebElement CurMonth =
		 * driver.findElement(By.
		 * xpath("//select[@title='Month']/option [@selected= '1']"));
		 * 
		 * System.out.println("Current Month is " + CurMonth.getText());
		 * 
		 * List<WebElement> Days =
		 * driver.findElements(By.xpath("//select[@title='Day']/option"));
		 * 
		 * for (WebElement elm1 : Days) { System.out.println(elm1.getText()); }
		 * 
		 * // to choose the current day (also a dynamic value) WebElement CurDay =
		 * driver.findElement(By.xpath("//select[@title='Day']/option [@selected= '1']")
		 * );
		 * 
		 * 
		 * //this will only choose the gender as Male //WebElement gen =
		 * driver.findElement(By.xpath("//input[@value='2']")); //gen.click();
		 */		
		
		
			}
	
}
