package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressSearchPage {
	
	@FindBy (xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
	private WebElement result;
	
	public String firstResult() {
		return result.getText();
	}

}
