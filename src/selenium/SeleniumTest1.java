package selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest1 {
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
		driver.findElement(By.linkText("Salontafel IKEA ontploft spontaan")).click();
		Thread.sleep(6000);
		driver.get("http://www.hln.be/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Vriend schutter fitnessmoord is brein achter mislukte deal")).click();
		Thread.sleep(6000);
		driver.get("http://www.hln.be/");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='searchDestinationForm2']/a")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("kx-proxy-KkeIWTGT" )).click();
		
		
		
		

	// boolean a =
	// driver.getPageSource().contains("The Email field is required.");

	// if (a == false) {
	// Assert.fail("email veld mag niet leeg zijn!");
}
}