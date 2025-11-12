package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cartpage {

	
	
	    WebDriver driver;

	    By productName = By.cssSelector(".cart-item .product-name");
	    By quantity = By.cssSelector(".cart-item .quantity input");
	    By price = By.cssSelector(".cart-item .price");
	    By checkoutButton = By.cssSelector(".checkout-button");

	    
		public void CartPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public String getProductName() {
	        return driver.findElement(productName).getText();
	    }

	    public String getQuantity() {
	        return driver.findElement(quantity).getAttribute("value");
	    }

	    public String getPrice() {
	        return driver.findElement(price).getText();
	    }

	    public void clickCheckout() {
	        driver.findElement(checkoutButton).click();
	    }
	}



