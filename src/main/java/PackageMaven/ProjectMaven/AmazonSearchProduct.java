package PackageMaven.ProjectMaven;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchProduct {

	//Step 1
			@FindBy(xpath=("//a[@class=\"a-link-normal s-no-outline\"][1]"))
			WebElement firstshoe;
			
			//Step 2
			public void Amazon_firstproductclick(WebDriver driver)
			{
				firstshoe.click();
				Set<String> pcid= driver.getWindowHandles();// Return type is set of string
				Iterator<String> pc=pcid.iterator();
				String Pid=pc.next();// give parent id
				String Cid=pc.next();//Give id of child
				System.out.println("Parent id:" +Pid);
				System.out.println("Child id:" +Cid);
				System.out.println("Parent , Child id:" +pcid);
				driver.switchTo().window(Cid);
			}
			
			//step 3
			
			public AmazonSearchProduct(WebDriver driver)
			{
				PageFactory.initElements(driver, this);//this keyword>lolocal to global value
			}
			
}
