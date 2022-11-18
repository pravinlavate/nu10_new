package DEmo_QA_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amount_String_error_messagePOM6 {
	WebDriver driver;
	@FindBy(xpath="//input[@formcontrolname='fiatAmount']")
	WebElement amountfield;
	
	@FindBy(xpath="(//span[@class='font-bold'])[3]")
	WebElement aftercrptocurrncy;
	
	@FindBy(xpath="(//span[@class='font-bold'])[4]")
	WebElement afterusd;
	
	@FindBy(xpath="//button[text()='Purchase']")
	WebElement Purchasebutton;
	
	@FindBy(xpath="(//span[text()='Purchase'])[2]")
	WebElement LTCpurchase;
	

	public Amount_String_error_messagePOM6(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void enteramount() throws InterruptedException {
		
		LTCpurchase.click();
		Thread.sleep(4400);
		amountfield.sendKeys("abcdef");
		
		Thread.sleep(4000);

}
	public void functionality_pruchseButton() {
		boolean status = Purchasebutton.isEnabled();
		
		if (status=true) {
			System.out.println("purchase button is disable ");
		}
		else {
			System.out.println("purchase button is enable ");
		}
	}
	}
