package test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.Painter;

public class PaintTest {
	
	ChromeDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/Apps/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		driver.quit();
	}
	@Ignore
	@Test
	public void paintTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.youidraw.com/apps/painter/");		
		Painter paint = PageFactory.initElements(driver, Painter.class);
		paint.method(driver);
		Thread.sleep(2000);
	}
	
	@Test
	public void waitTest() {
		driver.manage().window().maximize();
		driver.get("https://christophperrins.github.io/TestingSite/");		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement hatred = driver.findElement(By.xpath("//*[@id=\"quote\"]/h2"));
		assertTrue(hatred.isDisplayed());
		
		
	}
	
	@Test
	public void waitTestEx() {
		driver.manage().window().maximize();
		driver.get("https://christophperrins.github.io/TestingSite/");		
		WebElement hatred = (new WebDriverWait(driver,10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"quote\"]/h2")));
		assertTrue(hatred.isDisplayed());
		
	}
	
	

}
