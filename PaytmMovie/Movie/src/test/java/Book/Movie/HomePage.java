package Book.Movie;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;


	public HomePage(WebDriver driver) {
			this.driver = driver;	
			this.js = (JavascriptExecutor) driver;
	}
	
	public void open() throws InterruptedException {
		driver.get("https://paytm.com/movies/bengaluru");
		
		Thread.sleep(2000);
		
		WebElement lang = driver.findElement(By.xpath("//*[@id=\"Hindi\"]"));
		lang.click();
		
		Thread.sleep(3000);
		
		WebElement movie = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[2]/div[1]/span/div[1]/div[3]/div[1]/a/div[1]/div[1]/img"));
		movie.click();
		
		Thread.sleep(3000);
		
		
		WebElement date = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div[2]/a[3]/div"));
		date.click();
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,1000)");
		
		
		Thread.sleep(3000);
		
		WebElement theatre = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div[2]/div/div[2]/div/div[14]/div[2]/div[1]/div[2]"));
		theatre.click();
		
		Thread.sleep(3000);
		
		WebElement seat = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div[2]/ul/li[1]/div[2]/div[15]/span"));
		seat.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[3]/button")).click();
		
		Thread.sleep(10000);
		
	//	driver.switchTo().frame(2);
		 
		 WebElement frameElement = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[2]/button[2]"));
		 frameElement.click();
	   
		 Thread.sleep(3000);
		 
     //    driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[3]/div[2]/div/div[2]/div[1]/div[3]/div[2]/span[2]")).click();
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[3]/div[2]/div/div[2]/div[8]/div[3]/div[2]/span[2]")).click();
	//	 driver.switchTo().defaultContent();
		 
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[3]/div[2]/div/div[3]/div[2]")).click();
		 
		 Thread.sleep(3000);
		// driver.switchTo().frame(0);
		 
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div/button")).click();
		Thread.sleep(10000);
		
	}
	
	
	

}
