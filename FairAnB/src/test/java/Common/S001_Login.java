package Common;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import common.AbstractTest;
import common.CommonAction;
import common.Constant;
import page.DashboardPage;
import page.MyAccountPage;
import page.RegisterPage;

public class S001_Login extends AbstractTest {

	@BeforeClass(alwaysRun = true)
	@Parameters({ "browser" })
	public void setUp(String browser) {
		driver = openBrowser(browser, Constant.URL);
		dashboard = new DashboardPage(driver);
		register = new RegisterPage(driver);
		account = new MyAccountPage(driver);

		validUsername = "automation01";
		validPassword = "12345678";
		invalidUsername = "invalid";
		invalidPassword = "invalid";
		registerHeader = "Register";
		myAccountHeader = "My Account";
		firstNameErrorMsg = "First name is required";
		lastNameErrorMsg = "Last name is required";
		stateProviceErrorMsg = "State / Province is required";
		emailErrorMsg = "Email address is required";
		emailFormatErrorMsg = "Please provide a valid email address.";
		userNameErrorMsg = "User name is required";
		userNameLessThan6ErrorMsg = "User name must be at least 6 characters long";
		passwordErrorMsg = "A password is required";
		passwordLessThan6ErrorMsg = "Password must be at least 6 characters";
		repeatePasswordErrorMsg = "Repeated password is required";
		repeatePasswordNotMatchErrorMsg = "Both password must match";
		firstName = faker.name().firstName();
		lastName = faker.name().lastName();
		state = "Alabama";
		gender = "Male";
		country = "United States";
		emailWrongFormat = "emailwrongformat";
		email = firstName + CommonAction.getCommon().getRandomNumber() + "@gmail.com";
		username = firstName + lastName + CommonAction.getCommon().getRandomNumber();
		password = "12345678";
		passwordLessThan6 = "1234";
		usernameLessThan6 = "abcd";

	}

	@Test
	public void S001_Login_TC001_Register_With_Valid_Information() {
		log.info("Step 01: Click Login Drop");
		dashboard.clickLoginDrop();

		log.info("Step 02: Click 'Not yet registered?' button");
		dashboard.clickRegisterLink();

		log.info("VP 01. Is 'Register' header displayed");
		register.isDynamicHeaderDisplayed(registerHeader);

		log.info("Step 03: Check Error Message for Fist Name");
		verifyTrue(register.isErrorMessageDisplayed(firstNameErrorMsg));

		log.info("Step 04: Input First Name");
		register.inputFirstName(firstName);

		log.info("Step 05: Check Error Message for Last Name");
		verifyTrue(register.isErrorMessageDisplayed(lastNameErrorMsg));

		log.info("Step 06: Input Last Name");
		register.inputLastName(lastName);

		log.info("Step 07: Select Genre");
		register.selectGenre(gender);

		log.info("Step 08: Check Error Message for State/Provice");
		verifyTrue(register.isErrorMessageDisplayed(stateProviceErrorMsg));

		log.info("Step 09: Select Country");
		register.selectCountry(country);

		log.info("Step 10: Input State");
		register.inputState(state);

		log.info("Step 11: Check Error Message for Email");
		verifyTrue(register.isErrorMessageDisplayed(emailErrorMsg));

		log.info("Step 12: Input Email Address wrong format");
		register.inputEmailAddress(emailWrongFormat);

		log.info("Step 13: Check Error Message for Email Wrong Format");
		verifyTrue(register.isErrorMessageDisplayed(emailFormatErrorMsg));

		log.info("Step 14: Input Email Address");
		register.inputEmailAddress(email);

		log.info("Step 15: Check Error Message for Username");
		verifyTrue(register.isErrorMessageDisplayed(userNameErrorMsg));

		log.info("Step 16: Input username less than 6 characters ");
		register.inputUsername(usernameLessThan6);

		log.info("Step 17: Check Error Message for Username less than 6 characters");
		verifyTrue(register.isErrorMessageDisplayed(userNameLessThan6ErrorMsg));

		log.info("Step 18: Input UserName");
		register.inputUsername(username);

		log.info("Step 19: Check Error Message for Input Password");
		verifyTrue(register.isErrorMessageDisplayed(passwordErrorMsg));

		log.info("Step 20: Input Password less than 6 characters");
		register.inputPassword(passwordLessThan6);

		log.info("Step 21: Check Error Message for Password less than 6 characters");
		verifyTrue(register.isErrorMessageDisplayed(passwordLessThan6ErrorMsg));

		log.info("Step 22: Input Password");
		register.inputPassword(password);

		log.info("Step 23: Check Error Message for Repeate Password");
		verifyTrue(register.isErrorMessageDisplayed(repeatePasswordErrorMsg));

		log.info("Step 24: Input Repeate Password not match Password ");
		register.inputRepeatPassword(password + "not match");

		log.info("Step 25: Check Error Message for Repeate Password not match Password ");
		verifyTrue(register.isErrorMessageDisplayed(repeatePasswordNotMatchErrorMsg));

		log.info("Step 26: Input Repeate Password");
		register.inputRepeatPassword(password);

		log.info("Step 27: Click Submit Register button");
		register.clickSubmitRegisterButton();

		log.info("VP 02. Is My Account Header Displayed");
		account.isDynamicHeaderDisplayed(myAccountHeader);

		log.info("Step 28: Click My Account Information link");
		account.clickMyAccountInformationLink();

		log.info("VP 03. Verify Email, FirstName, LastName, Gender are the same as registered");
		verifyEquals(account.getDynamicMyAccountInformation("email"), email.toLowerCase());
		verifyEquals(account.getDynamicMyAccountInformation("First Name"), firstName.toLowerCase());
		verifyEquals(account.getDynamicMyAccountInformation("Last Name"), lastName.toLowerCase());
		verifyEquals(account.getDynamicMyAccountInformation("Gender"), gender.toLowerCase().subSequence(0, 1));

		log.info("Step 29: Click Billing & Shipping Information link");
		// account.clickBillingShippingInformationLink();

		// log.info("VP 04. Verify Country, State, ");
	}

	@Test(enabled = false)
	public void S001_Login_TC002_Verify_Login_Function() {
		log.info("Step 01: Click Login Drop");
		dashboard.clickLoginDrop();

		log.info("Step 04: Click Login button");
		dashboard.clickLoginButton();

		log.info("VP 01. Is My Account button Displayed");
		verifyTrue(dashboard.isLoginFailedMessageDisplayed());

		log.info("Step 01: Click Login Drop");
		dashboard.clickLoginDrop();

		log.info("Step 02: Input invalid username");
		dashboard.inputUserName(invalidUsername);

		log.info("Step 03: Input invalid password");
		dashboard.inputPassword(invalidPassword);

		log.info("Step 04: Click Login button");
		dashboard.clickLoginButton();

		log.info("VP 01. Is My Account button Displayed");
		verifyTrue(dashboard.isLoginFailedMessageDisplayed());

		log.info("Step 01: Click Login Drop");
		dashboard.clickLoginDrop();

		log.info("Step 02: Input valid username");
		dashboard.inputUserName(validUsername);

		log.info("Step 03: Input valid password");
		dashboard.inputPassword(validPassword);

		log.info("Step 04: Click Login button");
		dashboard.clickLoginButton();

		log.info("VP 01. Is My Account button Displayed");
		verifyTrue(dashboard.isMyAccountButtonDisplayed());
	}

	@AfterClass(alwaysRun = true)
	public void tearsDown() {
		closeBrowser();
	}

	Faker faker = new Faker();
	DashboardPage dashboard;
	RegisterPage register;
	MyAccountPage account;

	String validUsername, validPassword, invalidUsername, invalidPassword;
	String registerHeader, myAccountHeader, emailWrongFormat, usernameLessThan6;
	String firstName, lastName, state, gender, country, email, username, password, firstNameErrorMsg, lastNameErrorMsg,
			stateProviceErrorMsg, emailErrorMsg, emailFormatErrorMsg, userNameErrorMsg, passwordErrorMsg,
			repeatePasswordErrorMsg, userNameLessThan6ErrorMsg, passwordLessThan6ErrorMsg, passwordLessThan6,
			repeatePasswordNotMatchErrorMsg;
}
