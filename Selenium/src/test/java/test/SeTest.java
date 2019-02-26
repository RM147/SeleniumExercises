package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeTest {
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
	public void task1Test() {
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk/addauser.php");
		WebElement login = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		login.sendKeys("abcd");
		WebElement pass = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		pass.sendKeys("abcd");
		WebElement button = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		button.submit();
		WebElement link = driver.findElement(
				By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
		link.click();
		WebElement login2 = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		login2.sendKeys("abcd");
		WebElement pass2 = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		pass2.sendKeys("abcd");
		WebElement button2 = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
		button2.submit();
		WebElement text = driver
				.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));

		assertEquals("Nope", "**Successful Login**", text.getText());

	}
	@Ignore
	@Test
	public void task2Test() {
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		WebElement search = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
		search.sendKeys("dress");
		WebElement button = driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
		button.submit();
		WebElement dresscheck = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a"));
		
		assertEquals("Nope", "Printed Summer Dress",dresscheck.getText());
		
		
		
		
	}

}
