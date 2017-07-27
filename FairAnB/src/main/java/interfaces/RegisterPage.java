package interfaces;

public class RegisterPage {
	public static final String FIRST_NAME_TEXTBOX = "//input[@id='firstName']";
	public static final String LAST_NAME_TEXTBOX = "//input[@id='lastName']";
	public static final String GENRE_DROPDOWN = "//select[@id='gender']";
	public static final String COUNTRY_DROPDOWN = "//select[@id='registration_country']";
	public static final String STATE_TEXTBOX = "//div[@class ='controls']/select[@id='customer_zones']";
	public static final String PROVINCE_TEXTBOX = "//div[@class ='controls']/input[@id = 'hidden_zones']";
	public static final String EMAIL_TEXTBOX = "//input[@id='email']";
	public static final String USERNAME_TEXTBOX = "//input[@id='userName']";
	public static final String PASSWORD_TEXTBOX = "//input[@id='password']";
	public static final String REPEAT_PASSWORD_TEXTBOX = "//input[@id='passwordAgain']";
	public static final String SUBMIT_REGISTER_BUTTON = "//input[@id='submitRegistration']";
	public static final String ERROR_MESSAGE = "//div[@id='registrationError' and contains(.,'%s')]";
	// public static final String ERROR_MESSAGE =
	// "//div[@id='registrationError']";

}
