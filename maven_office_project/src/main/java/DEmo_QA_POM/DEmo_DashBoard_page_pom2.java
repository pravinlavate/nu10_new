package DEmo_QA_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DEmo_DashBoard_page_pom2 {
	WebDriver driver;
	
	@FindBy(xpath="(//span[text()='Purchase'])[2]")
	WebElement LTCpurchase;
	
	public DEmo_DashBoard_page_pom2(WebDriver driver)
	{
		this.driver=driver;
	}

	public void clickonLTCPurchaseButton() {
		
		LTCpurchase.click();
	}
}
