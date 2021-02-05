package session3concepts;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginTestExc {
	WebDriver driver;

	@Before
	public void Launcher() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@class='form-control'][1]"))));
	}

	
	@Test
	public void LoginTesting() {
		WebElement userID = driver.findElement(By.xpath("//input[@class='form-control'][1]"));
		WebElement userPwd= driver.findElement(By.xpath("//input[@type='password']"));
//		WebDriverWait wait = new WebDriverWait(driver, 6);
//		wait.until(ExpectedConditions
//				.visibilityOf(driver.findElement(By.xpath("//button[@class='btn btn-success block full-width']"))));
		WebElement Sub_buttom = driver.findElement(By.xpath("//button[@class='btn btn-success block full-width']"));

		userID.sendKeys("demo@techfios.com");
		userPwd.sendKeys("abc123");
		//WebDriverWait wait = new WebDriverWait(driver, 6);
	//	wait.until(ExpectedConditions.visibilityOf(Sub_buttom));
		Sub_buttom.click();
		
		boolean PageStatus;
		try {
		WebElement NewPage = driver.findElement(By.xpath("//h2[text()=' Dashboard ']"));
		//wait.until(ExpectedConditions.visibilityOf(NewPage));
		 PageStatus= true;
		}
		catch(NoSuchElementException e) {
			 PageStatus= false;

		}
	//System.out.println(NewPage.getText());
		Assert.assertTrue("Dashboard Page Not Found", PageStatus);
////*[@id="side-menu"]/li[3]/a/span[1]
	}

}
