package RunnerClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import LiberyFile.BaseClass;
import pay_and_paywithnivapay_button_status.LoginPagebuttonfunctinality_pom1;
import pay_and_paywithnivapay_button_status.PaymentReciptbuttonfunctinality_pom2;
import pay_and_paywithnivapay_button_status.QuickpayButtonfunctinality_pom3;

public class buttonFunctinlaity {
  WebDriver driver;
	
	@Test
	public void paybuttonfunctionaity() throws InterruptedException {
		
		driver=BaseClass.Launchbrowserall("http://demo-web-alb-293560000.us-east-1.elb.amazonaws.com:3000/");
	Thread.sleep(3000);
		LoginPagebuttonfunctinality_pom1 a1 = PageFactory.initElements(driver, LoginPagebuttonfunctinality_pom1.class);
		 a1.clickOnaPaytoMerchant();
		 Thread.sleep(3000);
		 PaymentReciptbuttonfunctinality_pom2 a2=PageFactory.initElements(driver, PaymentReciptbuttonfunctinality_pom2.class);
		 a2.buttonfunctionality();
		 Thread.sleep(3000);
		 driver.close();
		
	}
}

