package PackageMaven.ProjectMaven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class A_194_DataFetching {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream f1=new FileInputStream("C:\\Users\\pinak\\eclipse-workspace\\ProjectMaven\\ExcelSheet\\DDT.xlsx");//Step 1	
		Workbook w1=WorkbookFactory.create(f1);		
			
		
		String username=	NumberToTextConverter.toText(w1.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		System.out.println(username);
		
		
		String PWD=	w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();	
		System.out.println(PWD);
		
		
		EdgeDriver driver=new EdgeDriver();	
		driver.get("https://www.amazon.in");	
		driver.manage().window().maximize();	
		
		WebElement login=driver.findElement(By.id("nav-link-accountList"));
		login.click();
		
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys(username);
		
		Thread.sleep(3000);
		WebElement Contonue= driver.findElement(By.id("continue"));
		Contonue.click();
		
		Thread.sleep(3000);
		WebElement pwd= driver.findElement(By.id("ap_password"));
		pwd.sendKeys(PWD);
		
		WebElement Signin= driver.findElement(By.id("signInSubmit"));
		Signin.click();
				
		

	}

}
