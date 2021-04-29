package autpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import autbase.DriverScript;
/*
 * Title: EnterTime
 * Developer: Rahman
 * Date Created: 04/27/21
 * Date Modified: 04/27/21
 * Verified By: Sonya
 */

public class EnterTimePage extends DriverScript{
//*********************************Page Elements*************************************//
	@FindBy(xpath="//a[@id='logoutLink']")WebElement LogoutLink;
	//********************************Page Initialization*********************************//
		//Page Factory is a class which used to initialize the element for the respective pages
		
	public EnterTimePage()
	{
			PageFactory.initElements(driver, this);
//*******************************Page Method/Actions*********************************//
	}
	public void fn_LogOut()
	{
		LogoutLink.click();
	}
}