package DomaciPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ImdbPage {

	WebDriver driver;
	WebElement signInButton;
	 
	public ImdbPage(WebDriver driver, WebDriverWait wdwait) {
		super();
		this.driver = driver;
	}
	
	public WebElement getSignInButton() {
		return driver.findElement(By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[5]/a/div"));
	}

	public void clickSignInButton () {
		this.getSignInButton().click();
	}
		
	
	
}
