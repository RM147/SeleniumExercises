package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressFrontPage {
	
	//http://automationpractice.com/index.php
	@FindBy (xpath="//*[@id=\"search_query_top\"]")
	private WebElement search;
	
	@FindBy (xpath="//*[@id=\"searchbox\"]/button")
	private WebElement button;
	
	public void searchText(String input) {
		search.sendKeys(input);
		button.submit();
	}

}
