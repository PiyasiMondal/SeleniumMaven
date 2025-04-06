package PackageMaven.ProjectMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonProductPage1 {
	//Step 1
			@FindBy(name="email")
			WebElement wishlist;
			
			@FindBy(id="continue")
			WebElement continue_button;
			
			@FindBy(id="ap_password")
			WebElement password;
			
			@FindBy(id="signInSubmit")
			WebElement submit_button;
			
			
			
			
			//step 3
			
			public AmazonProductPage1(WebDriver driver)
			{
				PageFactory.initElements(driver, this);//this keyword>lolocal to global value
			}
}
