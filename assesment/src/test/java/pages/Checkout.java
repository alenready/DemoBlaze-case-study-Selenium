package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Checkout {

	
	

	
	    private WebDriver driver;

		public Checkout(WebDriver driver) {
		// TODO Auto-generated constructor stub
	    	this.driver=driver;
	}

		public static void main(String[] args) throws InterruptedException {

	        
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	       
	        driver.get("https://example.com/cart");
	        Thread.sleep(2000);

	        
	        String productName = driver.findElement(By.cssSelector(".cart-item .product-name")).getText();
	        String quantity = driver.findElement(By.cssSelector(".cart-item .quantity input")).getAttribute("value");
	        String price = driver.findElement(By.cssSelector(".cart-item .price")).getText();

	        
	      
	        driver.findElement(By.cssSelector(".checkout-button")).click();
	        Thread.sleep(2000);

	       
	        driver.findElement(By.id("billing_first_name")).sendKeys("Alen");
	       	        driver.findElement(By.id("country")).sendKeys("India");
	         driver.findElement(By.id("card")).sendKeys("123456");

	         driver.findElement(By.className("btn btn-success")).click();
	       // driver.findElement(By.id("place_order")).click();
	        Thread.sleep(3000);

	       
	        WebElement confirmMsg = driver.findElement(By.cssSelector(".order-confirmation"));
	        if(confirmMsg.getText().contains("Order Placed Successfully")) {
	            System.out.println("Order placed successfully!");
	        } else {
	            System.out.println("Order confirmation failed.");
	        }

	        driver.quit();
	    }
	}

	
	

