package Automation_Batch.August_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser_launch {

	public static void main(String[] args) {
		
		//WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.linkedin.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(null));
		
		System.out.println(driver.getTitle());
		
		//findElement - id
		driver.findElement(By.id("hmenu-container"));
		
		//findElement - class name
		driver.findElement(By.className("navLeftFooter nav-sprite-v1"));
		
		//findElement - name
		driver.findElement(By.name("abc"));
		
		//findElement - linktext
		driver.findElement(By.linkText("Mobiles"));
		driver.findElement(By.linkText("Today's Deals"));
		driver.findElement(By.linkText("Amazon miniTV"));
		driver.findElement(By.linkText("Sell"));
		driver.findElement(By.linkText("Best Sellers"));
		driver.findElement(By.linkText("Customer Service"));
		driver.findElement(By.linkText(" Electronics "));
		driver.findElement(By.linkText("Fashion"));
		
		//findElement - partial link
		driver.findElement(By.partialLinkText("Today's De"));
		
		//findelement - Tagname
		driver.findElement(By.tagName("option"));
		
		//findelement - tagname#idvalue (Combination)
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		//findelement - tagname.classvalue (Combination)
		driver.findElement(By.cssSelector("abc"));
		
		//css - single attributes
		driver.findElement(By.cssSelector("input[placeholder=\"Search Amazon.in\"]"));
		
		
		

	}

}
