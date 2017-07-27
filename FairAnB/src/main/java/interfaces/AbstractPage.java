package interfaces;

public class AbstractPage {
	public static final String LOGIN_DROP = "//a[@id = 'signinDrop']";
	public static final String USERNAME_TEXTBOX = "//input[@id='signin_userName']";
	public static final String PASSWORD_TEXTBOX = "//input[@id='signin_password']";
	public static final String LOGIN_BUTTON = "//button[@id='login-button']";
	public static final String MY_ACCOUNT = "//a[@title = 'My Account']";
	public static final String LOGIN_FAILED_MESSAGE = "//div[contains(.,'Login Failed. Username or Password is incorrect.')]";
	public static final String REGISTER_LINK = "//a[@class='registration-link']";
	public static final String DYNAMIC_PAGE_HEADER = "//span[contains(.,'%s')]";
	public static final String MINI_CART = "//div[@id='miniCart']//a[@id='open-cart']";
	public static final String MINI_CART_COUNT = "//div[@id='miniCart']//span[@id='cartinfo']/span";
	public static final String MINI_CART_PRODUCT_NAME = "//div[@id='shoppingcart']//td[contains(.,'%s')]";
	public static final String MINI_CART_DELETE_PRODUCT_NAME = "//div[@id='shoppingcart']//td[contains(.,'%s')]/following::td/button[@class='close removeProductIcon']";
	public static final String MINI_CART_PRODUCT_PRICE = "//div[@id='shoppingcart']//td[4)]";
	public static final String MINI_CART_TOTAL_PRODUCT_PRICE = "//div[@id='shoppingcart']//font[@class='total-box-price']";
	public static final String MINI_CART_CHECKOUT = "//div[@id='shoppingcart']//button[contains(.,'Checkout')]";

}
