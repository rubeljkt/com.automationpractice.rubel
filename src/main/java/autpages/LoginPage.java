package autpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import autbase.DriverScript;

/*
 * Title: LoginPage
 * Developer: Rahman
 * Date Created: 04/27/21
 * Date Modified: 04/27/21
 * Verified By: Rubel
 */

public class LoginPage extends DriverScript{
//*********************************Page Elements*************************************//
	@FindBy(id="username") WebElement usernameTB;
	@FindBy(name="pwd") WebElement passwordTB;
	@FindBy(xpath="//a[@id='loginButton']") WebElement loginButton;
	@FindBy(xpath="//div[@class='atLogoImg']") WebElement actiLogoImage;
	
//********************************Page Initialization*********************************//
	//Page Factory is a class which used to initialize the element for the respective pages
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
//*******************************Page Method/Actions*********************************//
	public void fn_Login(String username,String password)
	{
		usernameTB.sendKeys(username);
		passwordTB.sendKeys(password);
		loginButton.click();
	}
	public boolean fn_VerifyActiLogo()
	{
		return actiLogoImage.isDisplayed();
	}
	public String fn_VerifyLoginPage()
	{
		return driver.getTitle();
	}
	

}
