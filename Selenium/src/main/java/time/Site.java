package time;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Site {
	
	@FindBy(xpath="//*[@id=\"quote\"]/h1")
	private WebElement hatred;
	
	public void implicit() {
		
	}
	

}
