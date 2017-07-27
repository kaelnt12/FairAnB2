package interfaces;

public class ShoppingCart {

	public static final String ITEM_NAME = "//td[@data-th='Item']//strong[contains(.,'%s')]";
	public static final String ITEM_QUANTITY = "//td[@data-th='Item']//strong[contains(.,'%s')]/ancestor::td/following-sibling::td[@data-th='Quantity']";
	public static final String ITEM_PRICE = "//td[@data-th='Item']//strong[contains(.,'%s')]/ancestor::td/following-sibling::td[@data-th='Price']";
	public static final String ITEM_TOTAL_PRICE = "//td[@data-th='Item']//strong[contains(.,'%s')]/ancestor::td/following-sibling::td[@data-th='Total']";
	public static final String ITEM_REMOVE_BTN = "//td[@data-th='Item']//strong[contains(.,'%s')]/ancestor::td/following-sibling::td//button[@class='btn btn-danger btn-sm']";
	public static final String ITEM_SUBTOTAL_PRICE = "//tr[@class='subt']//strong[contains(.,'Sub-total')]/parent::td/following-sibling::td/strong[@class='sub-total']";
	public static final String ITEM_TOTAL_ALL_PRICE = "//tr[@class='subt']//strong[contains(.,'Total')]/parent::td/following-sibling::td/strong[@class='sub-total']";
	public static final String CHECKOUT_BTN = "//button[@id='checkoutButton']";
	public static final String CONTINUE_SHOPPING_BTN = "//table[@id='mainCartTable']//a[@class='btn btn-warning']";
	public static final String RECALCULATE_BTN = "//table[@id='mainCartTable']//a[contains(.,'Recalculate')]";

}
