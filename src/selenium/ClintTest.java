package selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClintTest {

	WebDriver driver;
	
	@Before
	public void maakSeleniumKlaar() {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testEmailVerkeerd() throws InterruptedException {
		
		driver.get("http://www.clint.be");
		driver.findElement(By.linkText("nieuwsbrief")).click();

		WebElement tekstVeldjeVoorDeNaam = driver.findElement(By.id("Name"));
		tekstVeldjeVoorDeNaam.sendKeys("Tom");

		WebElement tekstVeldjeEmail = driver.findElement(By.id("Email"));
		tekstVeldjeEmail.sendKeys("slonske");

		driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div/div[1]/div/div/form/div[3]/input")).click();

	Thread.sleep(5000);

		boolean a = driver.getPageSource().contains("Please enter valid email address");

		if (a == false) {
			Assert.fail("Tekst staat er ni op!");
		}

	}

	@Test
	public void testLegeEmail() throws InterruptedException {

		driver.get("http://www.clint.be");
		driver.findElement(By.linkText("Schrijf je in voor de nieuwsbrief")).click();
		driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div/div[1]/div/div/form/div[3]/input")).click();

		Thread.sleep(5000);

		boolean a = driver.getPageSource().contains("The Email field is required.");

		if (a == false) {
			Assert.fail("email veld mag niet leeg zijn!");
		}
	}
	

	@Test
	public void testAuto() {
		driver.get("http://www.clint.be");
		driver.findElement(By.linkText("auto")).click();
	}

	}
