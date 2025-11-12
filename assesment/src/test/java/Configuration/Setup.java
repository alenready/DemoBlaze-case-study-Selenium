package Configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Setup {

	

	
	    public static void main(String[] args) throws InterruptedException {
	        
	        
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoblaze.com/");
	        
	        
	        String title = driver.getTitle();
	        if (title.contains("STORE")) {
	            System.out.println(" Homepage loaded successfully.");
	        } else {
	            System.out.println(" Homepage not loaded properly.");
	        }

	        
	        WebElement loginButton = driver.findElement(By.id("login2"));
	        loginButton.click();
	        Thread.sleep(2000); // 

	        
	        driver.findElement(By.id("loginusername")).sendKeys("Admin");
	        driver.findElement(By.id("loginpassword")).sendKeys("Admin@123");

	        
	        driver.findElement(By.xpath("//button[text()='Log in']")).click();

	        Thread.sleep(3000); 

	        
	        WebElement welcomeMsg = driver.findElement(By.id("nameofuser"));
	        if (welcomeMsg.isDisplayed()) {
	            System.out.println("Login successful: " + welcomeMsg.getText());
	        } else {
	            System.out.println(" Login failed.");
	        }

	        
	        driver.quit();
	    }
	}

	

