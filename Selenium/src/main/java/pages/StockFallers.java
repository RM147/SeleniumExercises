package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class StockFallers {
	
	@FindBys({
        @FindBy(tagName="tr"),
        @FindBy(tagName="td")
    })
	private List<WebElement> items;
	
	public String answer() {
		return items.get(1).getText()+" "+items.get(4);
	}
	

}
