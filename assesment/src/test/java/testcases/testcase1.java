package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Cartpage;
import pages.Checkout;
import pages.Confirmationpage;

	
	
	public class testcase1 {
	    WebDriver driver;
	    Cartpage cartPage;
	    Checkout checkoutPage;
	    Confirmationpage confirmationPage;

	    @BeforeTest
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoblaze.com/index.html");
	        cartPage = new Cartpage(driver);
	        checkoutPage = new Checkout(driver);
	        confirmationPage = new Confirmationpage(driver);
	    }

	    @Test
	    public void verifyCheckoutProcess() throws InterruptedException {
	        
	        Assert.assertEquals(cartPage.getProductName(), "Expected Product Name", "Product mismatch");
	        
	        
	        cartPage.clickCheckout();
	        Thread.sleep(2000);

	        

	        String confirmationText = confirmationPage.getConfirmationMessage();
	        Assert.assertTrue(confirmationText.contains("Order Placed Successfully"), "Order not confirmed!");
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	    }
	}

	

