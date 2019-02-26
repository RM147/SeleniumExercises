package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.DemoLogin;
import pages.DemositeMakeUser;
import pages.DressFrontPage;
import pages.DressSearchPage;
import pages.StockFallers;
import pages.StocksRisers;

public class SeMaintainTest {
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
	public void Maintain1Test() {
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk/addauser.php");
		String input = "abcd";
		DemositeMakeUser DMU = PageFactory.initElements(driver, DemositeMakeUser.class);
		DMU.input(input);
		DemoLogin login = PageFactory.initElements(driver, DemoLogin.class);
		assertEquals("**Successful Login**",login.login(input));
	}
	@Ignore
	@Test
	public void Maintain2Test() {
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		String input = "dress";
		DressFrontPage page = PageFactory.initElements(driver, DressFrontPage.class);
		page.searchText(input);
		DressSearchPage result  =PageFactory.initElements(driver, DressSearchPage.class);
		assertEquals("Printed Summer Dress",result.firstResult());
	}
	
	@Test
	public void MaintainTest() {
		driver.manage().window().maximize();
		driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100/risers");
		StocksRisers stock = PageFactory.initElements(driver, StocksRisers.class);
		System.out.println(stock.answer());
		driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100/fallers");
		StockFallers stock2 = PageFactory.initElements(driver, StockFallers.class);
		System.out.println(stock2.answer());
		
	}

}
