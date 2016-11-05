package selenium;

import java.util.concurrent.TimeUnit;

//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest2 {
	WebDriver driver;

	@Before
	public void maakSeleniumKlaar() {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void gaNaarHln() throws InterruptedException {

		driver.get("http://www.hln.be/");
		Thread.sleep(3000);
		WebElement tekstVeld = driver.findElement(By.id("email"));
		tekstVeld.sendKeys("Frankske@hotmail.com");
		driver.findElement(By.xpath(".//*[@id='container']/div/form/input[2]")).click();
//		driver.findElement(By.xpath(".//*[@id='subscriptionsForm']")).click();
		
		WebElement formulier = driver.findElement(By.id("subscriptionsForm"));
		WebElement knopVolgende = formulier.findElement(By.tagName("input"));
		
		knopVolgende.click();
		
		//boolean gewoonNaam = driver.getPageSource().contains("Uw e-mail is niet correct");

	//	if (gewoonNaam == false) {
		//	Assert.fail("E-mail is verplicht.");
	}
		}
	


