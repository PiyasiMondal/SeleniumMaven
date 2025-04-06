package PackageMaven.ProjectMaven;

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
	public void hoveroveronAccountsandlist(WebDriver driver) throws InterruptedException
	{
		Actions a1=new Actions(driver);
		Thread.sleep(6000);
		a1.moveToElement(accountsandList).perform();
	}
	
	public void signinclick()
	{
		signin.click();
	}
	
	public void search()
	{
		scarchproduct.sendKeys("laptop"+Keys.ENTER);
	}
	
	//step 3
	
	public AmazonHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);//this keyword>lolocal to global value
	}

}
