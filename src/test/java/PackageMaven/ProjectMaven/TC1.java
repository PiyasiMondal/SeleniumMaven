package PackageMaven.ProjectMaven;

import org.testng.annotations.Test;

public class TC1 extends LaunchQuit{
	@Test
	public void login_search_wishlist_cart_logout() throws InterruptedException
	{
		AmazonHomepage homepage=new AmazonHomepage(driver);
		homepage.hoveroveronAccountsandlist(driver);
		homepage.signinclick();
		
		
		AmazonLoginPage loginpage=new AmazonLoginPage(driver);
		loginpage.Amazon_username();
		loginpage.continuebutton();
		loginpage.Amazon_password();
		loginpage.submitbutton();
		
		
		homepage.search();
		
		AmazonSearchProduct firstproduct=new AmazonSearchProduct(driver);
		firstproduct.Amazon_firstproductclick(driver);
		
	}
	
	/*
	 * Homwpage
	 * loginpage
	 * searchresultpage
	 * productpage
	 * 
	 */
}
