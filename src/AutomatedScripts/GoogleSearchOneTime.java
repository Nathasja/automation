package AutomatedScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleSearchOneTime {
	
	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
	

 WebDriver driver = new FirefoxDriver();
 
 driver.get("http://www.google.com");
 
 
 
 driver.findElement(By.id("lst-ib")).clear();
 driver.findElement(By.id("lst-ib")).sendKeys("google");
 
 driver.findElement(By.name("btnG")).click();
 
 Thread.sleep(2000);

 
 String pageTitle = driver.getTitle();
 
 System.out.println(pageTitle);
 
boolean titleContainsTerm = pageTitle.contains("google");

System.out.println(titleContainsTerm);

driver.quit();


 
 
 

		




		
		
		
	}

}
