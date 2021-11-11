package DomaciPages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Movie1 {

	WebDriver driver;
	WebElement addButton;
	WebElement watchlistBox;
		
	public Movie1(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getAddButton() {
		return driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[2]/div[2]/div/div/button[1]/div"));
	}
	
	public WebElement getWatchlistBox() {
		return driver.findElement(By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[4]/a"));
		
	}
	
	public void clickWatchlistBox() {
		this.getWatchlistBox().click();

	}
	
	public void clickAddButton() {
		this.getAddButton().click();
	}
	
}
