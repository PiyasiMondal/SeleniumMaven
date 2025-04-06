package PackageMaven.ProjectMaven;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomepage 
{
	
	WebDriver driver;

	//Step 1
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	
	WebElement accountsandList;
	
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signin;
	
	@FindBy(xpath=("//input[@id=\"twotabsearchtextbox\"]"))
	WebElement scarchproduct;
	
	
	//Step 2
	public void hoveroveronAccountsandlist(WebDriver driver) 
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions a1=new Actions(driver);
		
		
		a1.moveToElement(accountsandList).perform();
	}
	
	public void signinclick() 
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		signin.click();
	}
	
	public void search() 
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(3000);
		scarchproduct.sendKeys("laptop"+Keys.ENTER);
	}
	
	//step 3
	
	public AmazonHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);//this keyword>lolocal to global value
	}

}
