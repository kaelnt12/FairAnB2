package page;

import org.openqa.selenium.WebDriver;

import common.Constant;

public class DashboardPage extends AbstractPage {

	public DashboardPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	/**
	 * Input User Name
	 */
	public void inputUserName(String value) {
		waitForElement(driver, interfaces.AbstractPage.USERNAME_TEXTBOX, timeWaits);
		type(driver, interfaces.AbstractPage.USERNAME_TEXTBOX, value);
		sleep(1);
	}

	/**
	 * Input Password
	 * 
	 * @param value
	 */
	public void inputPassword(String value) {
		waitForElement(driver, interfaces.AbstractPage.PASSWORD_TEXTBOX, timeWaits);
		type(driver, interfaces.AbstractPage.PASSWORD_TEXTBOX, value);
		sleep(1);
	}

	/**
	 * Click Login Button
	 */
	public void clickLoginButton() {
		waitForElement(driver, interfaces.AbstractPage.LOGIN_BUTTON, timeWaits);
		click(driver, interfaces.AbstractPage.LOGIN_BUTTON);
		sleep(2);
	}

	/**
	 * Click Login Button
	 */
	public void clickLoginDrop() {
		waitForElement(driver, interfaces.AbstractPage.LOGIN_DROP, timeWaits);
		click(driver, interfaces.AbstractPage.LOGIN_DROP);
	}

	/**
	 * Click Register Link
	 */
	public void clickRegisterLink() {
		waitForElement(driver, interfaces.AbstractPage.REGISTER_LINK, timeWaits);
		click(driver, interfaces.AbstractPage.REGISTER_LINK);
	}

	/**
	 * Is My Account Button Displayed
	 * 
	 * @return
	 */
	public boolean isMyAccountButtonDisplayed() {
		waitForElement(driver, interfaces.AbstractPage.MY_ACCOUNT, timeWaits);
		return isControlDisplayed(driver, interfaces.AbstractPage.MY_ACCOUNT);
	}

	/**
	 * Is Login Failed Message Displayed
	 * 
	 * @return
	 */
	public boolean isLoginFailedMessageDisplayed() {
		waitForElement(driver, interfaces.AbstractPage.LOGIN_FAILED_MESSAGE, timeWaits);
		return isControlDisplayed(driver, interfaces.AbstractPage.LOGIN_FAILED_MESSAGE);
	}

	int timeWaits = Constant.TimeWait;
	WebDriver driver;
}
