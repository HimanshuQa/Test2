package Keywords;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//import com.qait.automation.Tatocautomation.Errorpage;
//import com.qait.automation.Tatocautomation.FrameDungeon;

public class Basicauth {

	//
	// Errorpage error;
	// FrameDungeon frame;
	WebDriver web;

	@FindBy(linkText = "Basic Auth")
	private WebElement basicauth;

	public Basicauth(WebDriver web) {
		this.web = web;
	}

	public void initiaiseElements() {
		PageFactory.initElements(this.web, this);
	}

	public void click_on_redbox() throws InterruptedException {
		initiaiseElements();
		basicauth.click();
		Thread.sleep(2000);
		Alert alert = web.switchTo().alert();
		System.out.println(alert);

	}
	//
	// public void click_on_greenbox() {
	// openPage();
	//
	// Assert.assertTrue(green_box.isDisplayed(), "greenbox not displayed");
	// green_box.click();
	// frame = new FrameDungeon(this.web);
	// Assert.assertTrue(frame.isDisplayed());
	// }
}
