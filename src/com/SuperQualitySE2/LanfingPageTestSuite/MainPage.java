package com.SuperQualitySE2.LanfingPageTestSuite;

import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MainPage {

	WebDriver driver = new ChromeDriver();
	@BeforeClass
	public void EnvronmentSetup() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver.manage().window().maximize();//opens the chrome window and maximizes it
		//driver.get("https://ps.opensooq.com/ar");
	}
	@Test(priority=1)
	public void openhomepage(){
		driver.get("http://www.superquality.me/");
	}
	@Test
	public void click_on_right_element() throws NoSuchElementException {
	WebElement navElement= driver.findElement(By.xpath("(//ul[@class='nav navbar-nav'])[5]"));
	if(navElement.isDisplayed()) {	
	navElement.click();}
	
	}
	
	@AfterClass
	public void End() {
		driver.quit();
	}

}
