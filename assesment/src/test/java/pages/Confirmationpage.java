package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Confirmationpage {

	
	public class ConfirmationPage {
	    WebDriver driver;

	    By confirmationMessage = By.cssSelector(".order-confirmation");

	    public ConfirmationPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public String getConfirmationMessage() {
	        return driver.findElement(confirmationMessage).getText();
	    }
	}

	
}
