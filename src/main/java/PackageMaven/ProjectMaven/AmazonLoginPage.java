package PackageMaven.ProjectMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage {
	
	WebDriver driver;
	//Step 1
		@FindBy(name="email")
		WebElement username;
		
		@FindBy(id="continue")
		WebElement continue_button;
		
		@FindBy(id="ap_password")
		WebElement password;
		
		@FindBy(id="signInSubmit")
		WebElement submit_button;
		
		
		//Step 2
		public void Amazon_username()
		{
			username.sendKeys("6294244991");
		}
		
		public void continuebutton()
		{
			continue_button.click();
		}
		
		public void Amazon_password()
		{
			password.sendKeys("6294244991");
		}
		
		
		public void submitbutton()
		{
			submit_button.click();
		}
		
		//step 3
		
		public AmazonLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);//this keyword>lolocal to global value
		}

}
