package PackageMaven.ProjectMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class A_195_Login {

	@Test
	public void TC1_loginWithAmazonWithEMAIL() throws InterruptedException
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement login=driver.findElement(By.id("nav-link-accountList"));
		login.click();
		
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys("piyasimondal29@gmail.com");
		
		Thread.sleep(3000);
		WebElement Contonue= driver.findElement(By.id("continue"));
		Contonue.click();
		
		Thread.sleep(3000);
		WebElement pwd= driver.findElement(By.id("ap_password"));
		pwd.sendKeys("12345678");
		
		WebElement Signin= driver.findElement(By.id("signInSubmit"));
		Signin.click();
	}
	
	
	public void TC2_loginWithAmazonWithphone() throws InterruptedException
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement login=driver.findElement(By.id("nav-link-accountList"));
		login.click();
		
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys("7602181120");
		
		Thread.sleep(3000);
		WebElement Contonue= driver.findElement(By.id("continue"));
		Contonue.click();
		
		Thread.sleep(3000);
		WebElement pwd= driver.findElement(By.id("ap_password"));
		pwd.sendKeys("12345678");
		
		WebElement Signin= driver.findElement(By.id("signInSubmit"));
		Signin.click();
	}
}
