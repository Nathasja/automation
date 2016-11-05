package selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest4 {
	private FirefoxDriver driver;
	@Before
	public void maakSeleniumKlaar() {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		
		@Test
		public void testReddit() throws InterruptedException {

			driver.get("http://www.reddit.com");
			driver.findElement(By.xpath(".//*[@id='sr-header-area']/div/div[1]/span")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[@id='sr-header-area']/div/div[2]/a[39]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[@id='thing_t3_5axe93']/div[2]/p[1]/a")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[@id='sr-more-link']")).click();
			driver.findElement(By.xpath(".//*[@id='sr-header-area']/div/div[3]/ul[1]/li[1]/a")).click();
			Thread.sleep(5000);
			WebElement tekstVeldje = driver.findElement(By.xpath(".//*[@id='search']/input[1]"));
			tekstVeldje.sendKeys("WTF");
			driver.findElement(By.xpath(".//*[@id='search']/input[2]")).click();
			driver.findElement(By.xpath("html/body/div[4]/div[3]/div/div/div[1]/header/a/mark")).click();
			
			
			boolean a = driver.getPageSource().contains("WTF");

			if (a == false) {
				Assert.fail("crash");
			}
			
			
			
			
			
			boolean containsError = driver.getPageSource().contains("Error");
			
			if ( containsError ) {
				
				System.out.print("Der is nen error gast!");
				Assert.fail("Der is nen error!!!!!!");
				
			}
			
			
			
		}

}
