package DomaciPages;

import org.openqa.selenium.WebDriver;

public class Watchlist {

	
	WebDriver driver;
	String Maligant;
	String Solace;

	public Watchlist(WebDriver driver) {
		super();
		
		this.driver = driver;
	}

	public String getMaligant() {
		return driver.getTitle();
	}

	public String getSolace() {
		return driver.getTitle();
	}
	
	public void movieOneName(String name) {
		
		this.getMaligant().compareTo(getMaligant());
	}
	
	public void movieSecondName(String nameSecond) {
		this.getSolace().compareTo(getSolace());
	}
}
