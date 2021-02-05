package session3concepts;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebElements {
	WebDriver driver;

	@Before
	public void LaunchD() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cnn.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public void dealingWithDynamic() {
		WebElement ele1 = driver.findElement(By.xpath(
				"//span[@class='cd__headline-text vid-left-enabled']/ancestor::ul[@class='cn cn-list-hierarchical-xs cn--idx-0 cn-container_A73429E2-9528-71DB-3FE4-E48B81E1B1B4']"));
		ele1.click();
	}

}
