package page;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;

import common.Constant;
import common.ReadExcelFile;

public class RegisterPage extends AbstractPage {

	/**
	 * @author sangmai
	 * @param driver
	 */

	public RegisterPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	/**
	 * Input First Name
	 *
	 * @param value
	 */
	public void inputFirstName(String value) {
		waitForElement(driver, interfaces.RegisterPage.FIRST_NAME_TEXTBOX, timeWaits);
		type(driver, interfaces.RegisterPage.FIRST_NAME_TEXTBOX, value);
		sleep(1);
	}

	/**
	 * Input Last Name
	 *
	 * @param value
	 */
	public void inputLastName(String value) {
		waitForElement(driver, interfaces.RegisterPage.LAST_NAME_TEXTBOX, timeWaits);
		type(driver, interfaces.RegisterPage.LAST_NAME_TEXTBOX, value);
		sleep(1);
	}

	/**
	 * Select Genre
	 *
	 * @param value
	 */
	public void selectGenre(String value) {
		waitForElement(driver, interfaces.RegisterPage.GENRE_DROPDOWN, timeWaits);
		selectItemCombobox(driver, interfaces.RegisterPage.GENRE_DROPDOWN, value);
		sleep(1);
	}

	/**
	 * Select Country
	 *
	 * @param value
	 */
	public void selectCountry(String value) {
		waitForElement(driver, interfaces.RegisterPage.COUNTRY_DROPDOWN, timeWaits);
		selectItemCombobox(driver, interfaces.RegisterPage.COUNTRY_DROPDOWN, value);
		sleep(1);
	}

	/**
	 * Input State 8080
	 *
	 * @param value
	 */
	public void inputState(String value) {
		try {
			waitForElement(driver, interfaces.RegisterPage.PROVINCE_TEXTBOX, timeWaits);
			type(driver, interfaces.RegisterPage.PROVINCE_TEXTBOX, value);
			sleep(1);
		} catch (Exception e) {
			waitForElement(driver, interfaces.RegisterPage.STATE_TEXTBOX, timeWaits);
			selectItemCombobox(driver, interfaces.RegisterPage.STATE_TEXTBOX, value);
			sleep(1);
		}
	}

	/**
	 * Input Email Address
	 *
	 * @param value
	 */
	public void inputEmailAddress(String value) {
		waitForElement(driver, interfaces.RegisterPage.EMAIL_TEXTBOX, timeWaits);
		type(driver, interfaces.RegisterPage.EMAIL_TEXTBOX, value);
		sleep(1);
	}

	/**
	 * Input Username
	 *
	 * @param value
	 */
	public void inputUsername(String value) {
		waitForElement(driver, interfaces.RegisterPage.USERNAME_TEXTBOX, timeWaits);
		type(driver, interfaces.RegisterPage.USERNAME_TEXTBOX, value);
		sleep(1);
	}

	/**
	 * Input Password
	 *
	 * @param value
	 */
	public void inputPassword(String value) {
		waitForElement(driver, interfaces.RegisterPage.PASSWORD_TEXTBOX, timeWaits);
		type(driver, interfaces.RegisterPage.PASSWORD_TEXTBOX, value);
		sleep(1);
	}

	/**
	 * Input Repeat Password
	 *
	 * @param value
	 */
	public void inputRepeatPassword(String value) {
		waitForElement(driver, interfaces.RegisterPage.REPEAT_PASSWORD_TEXTBOX, timeWaits);
		type(driver, interfaces.RegisterPage.REPEAT_PASSWORD_TEXTBOX, value);
		sleep(1);
	}

	/**
	 * Click Submit Register Button
	 */
	public void clickSubmitRegisterButton() {
		waitForElement(driver, interfaces.RegisterPage.SUBMIT_REGISTER_BUTTON, timeWaits);
		click(driver, interfaces.RegisterPage.SUBMIT_REGISTER_BUTTON);
		sleep(5);
	}

	/**
	 * Check error message is displayed
	 *
	 * @param message
	 */
	public boolean isErrorMessageDisplayed(String message) {
		waitForElement(driver, interfaces.RegisterPage.ERROR_MESSAGE, message, timeWaits);
		return isControlDisplayed(driver, interfaces.RegisterPage.ERROR_MESSAGE, message);
	}

	/**
	 * Load data and Run from Excel file for data test
	 *
	 * @param path
	 * @param fileName
	 * @param sheetName
	 */
	public void runWithDataFromExcel(String path, String fileName, String sheetName) {
		try {
			excelSheet = file.readExcel(path, fileName, sheetName);
			int lastRowNum = excelSheet.getLastRowNum() - excelSheet.getFirstRowNum();
			for (int i = 1; i <= lastRowNum; i++) {
				Row row = excelSheet.getRow(i);
				firstName = row.getCell(1).toString();
				lastName = row.getCell(2).toString();
				genre = row.getCell(3).toString();
				country = row.getCell(4).toString();
				state = row.getCell(5).toString();
				email = row.getCell(6).toString();
				userName = row.getCell(7).toString();
				password = row.getCell(8).toString();
				repeatPassword = row.getCell(9).toString();
				message = row.getCell(10).toString();
				inputFirstName(firstName);
				inputLastName(lastName);
				selectGenre(genre);
				selectCountry(country);
				inputState(state);
				inputEmailAddress(email);
				inputUsername(userName);
				inputPassword(password);
				inputRepeatPassword(repeatPassword);
				clickSubmitRegisterButton();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	String firstName, lastName, genre, country, state, email, userName, password, repeatPassword, message;
	ReadExcelFile file = new ReadExcelFile();
	Sheet excelSheet;
	protected WebDriver driver;
	int timeWaits = Constant.TimeWait;
}
