package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Painter {
	
	@FindBy(xpath="//*[@id=\"pencil\"]")
	private WebElement pencil;
	
	@FindBy(xpath="//*[@id=\"color\"]")
	private WebElement colour;
	
	@FindBy(xpath="//*[@id=\"catch\"]")
	private WebElement canvas;
	
	
	public void method(ChromeDriver driver) {
		Actions action = new Actions(driver);
		pencil.click();
		colour.click();
		action.moveToElement(canvas).moveByOffset(-300,0).clickAndHold().moveByOffset(0,-100)
		.moveByOffset(100, 0).moveByOffset(0, 50).moveByOffset(-100,0).moveByOffset(100,50)
		.release()//end of R
		.moveByOffset(20,0).clickAndHold().moveByOffset(0,-100).moveByOffset(50,50).moveByOffset(50,-50).moveByOffset(0,100)
		.release()//end of M
		.moveByOffset(20,0).clickAndHold().moveByOffset(0,-100)
		.release()//end of I
		.moveByOffset(70,100).clickAndHold().moveByOffset(0,-100).moveByOffset(-50,0).moveByOffset(100,0)
		.release()//end of T
		.moveByOffset(20,100).clickAndHold().moveByOffset(0,-100).moveByOffset(-50,0).moveByOffset(100,0)
		.release()//end of T
		.moveByOffset(20,100).clickAndHold().moveByOffset(0,-100)
		.moveByOffset(100, 0).moveByOffset(0, 50).moveByOffset(-100,0).moveByOffset(100,50)
		.release()//end of R
		.moveByOffset(20,0).clickAndHold().moveByOffset(0,-100).moveByOffset(100, 0).moveByOffset(0,100)
		.moveByOffset(0,-50).moveByOffset(-100, 0)
		.release()//end A
		.perform();
	}

}
