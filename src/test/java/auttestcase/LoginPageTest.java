package auttestcase;

import org.testng.annotations.Test;

import autbase.DriverScript;
import autpages.EnterTimePage;
import autpages.LoginPage;

public class LoginPageTest extends DriverScript{

	@Test(priority=1)
	public void testVerifyLogo()
	{
		initApplication();
		LoginPage loginpage = new LoginPage();
		boolean flag = loginpage.fn_VerifyActiLogo();
		System.out.println(flag);
	}
	@Test(priority=2)
	public void testVerifyPageTitle()
	{
		initApplication();
		LoginPage loginpage = new LoginPage();
		String actualtitle = loginpage.fn_VerifyLoginPage();
		System.out.println(actualtitle);
		CloseApplication();
	}
	@Test(priority=3)
	public void testLoginFn()
	{
		initApplication();
		LoginPage loginpage = new LoginPage();
		loginpage.fn_Login("admin", "manager");
		EnterTimePage entertpage = new EnterTimePage();
		entertpage.fn_LogOut();
		CloseApplication();
		
	}
}
