package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Search {

	

	
	    public static void main(String[] args) throws InterruptedException {
	        
	       
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoblaze.com/");
	        Thread.sleep(2000);

	        
	        driver.findElement(By.linkText("Laptops")).click();
	        Thread.sleep(2000);

	        
	        driver.findElement(By.linkText("Sony vaio i5")).click();
	        Thread.sleep(2000);

	        
	        String productName = driver.findElement(By.className("name")).getText();
	        String productPrice = driver.findElement(By.className("price-container")).getText();
	        String productDesc = driver.findElement(By.id("more-information")).getText();

	        System.out.println("Product Name: " + productName);
	        System.out.println("Product Price: " + productPrice);
	        System.out.println("Product Description: " + productDesc);

	       

	        
	        driver.findElement(By.linkText("Add to cart")).click();
	        Thread.sleep(3000);

	       
	        driver.switchTo().alert().accept();
	        System.out.println("Product added ");

	        
	        driver.findElement(By.id("cartur")).click();
	        Thread.sleep(3000);

	        
	        WebElement cartItem = driver.findElement(By.xpath("//td[contains(text(),'Sony vaio i5')]"));
	        if (cartItem.isDisplayed()) {
	            System.out.println(" Product is present in the cart.");
	        } else {
	            System.out.println(" Product not found in cart.");
	        }

	        
	        driver.quit();
	    }
	}

	

