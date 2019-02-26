package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

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
	
	@Test
	public void paintTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.youidraw.com/apps/painter/");		
		Painter paint = PageFactory.initElements(driver, Painter.class);
		paint.method(driver);
		Thread.sleep(2000);
	}
	
	

}
