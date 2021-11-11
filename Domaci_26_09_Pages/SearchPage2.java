package DomaciPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage2 {

	WebDriver driver;
	WebElement searchBox2;
	public SearchPage2(WebDriver driver) {
		super();
		this.driver = driver;
		
	}
	public WebElement getSearchBox2() {
		return driver.findElement(By.xpath("//*[@id=\"suggestion-search\"]"));
	}
	
	public void insertSearchBox2(String searchBox2Data) {
		
		this.getSearchBox2().clear();
		this.getSearchBox2().sendKeys(searchBox2Data);
		this.getSearchBox2().sendKeys(Keys.ENTER);
	}
	
	
}
