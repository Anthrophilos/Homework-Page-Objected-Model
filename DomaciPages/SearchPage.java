package DomaciPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

	WebDriver driver;
	WebElement searchBox;
	

	public SearchPage(WebDriver driver) {
		super();

		this.driver = driver;

	}

	public WebElement getSearchBox() {
		return driver.findElement(By.xpath("//*[@id=\"suggestion-search\"]"));
	}

	public void insertSearchBox(String searchBoxData) {

		this.getSearchBox().clear();
		this.getSearchBox().sendKeys("Malignant");
		this.getSearchBox().sendKeys(Keys.ENTER);
	}

}
