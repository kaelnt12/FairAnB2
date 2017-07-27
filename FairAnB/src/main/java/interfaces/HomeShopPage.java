package interfaces;

public class HomeShopPage {
	public static final String POPULAR_LISTINGS_PRODUCT_NAME = "//div[@class='product_item']//p[@class='pr-name' and contains(.,'%s')]";
	public static final String POPULAR_LISTINGS_BUY_NOW_BTN = "//article[contains(.,'POPULAR LISTINGS')]//div[@class='desc-detail' and contains(.,'%s')]//a[@title='Buy Now']";
	public static final String POPULAR_LISTINGS_CONTACT_SELLER_BTN = "//article[contains(.,'POPULAR LISTINGS')]//div[@class='desc-detail' and contains(.,'%s')]//a[@title='Contact Seller']";
	public static final String POPULAR_LISTINGS_ADD_TO_WATCHLIST_BTN = "//article[contains(.,'POPULAR LISTINGS')]//div[@class='desc-detail' and contains(.,'%s')]//a[@title='Add to Watchlist']";
	public static final String FRESHLY_DISCOUNTED_PRODUCT_NAME = "//article[contains(.,'FRESHLY DISCOUNTED')]//div[@class='title']//h4/a";
	public static final String FRESHLY_DISCOUNTED_NEWPRICE = "//article[contains(.,'FRESHLY DISCOUNTED')]//div[@class='price-box']//span[@class='d-price']";
	public static final String FRESHLY_DISCOUNTED_OLDPRICE = "//article[contains(.,'FRESHLY DISCOUNTED')]//div[@class='price-box']//span[@class='r-price']";
	public static final String FRESHLY_DISCOUNTED_BUY_NOW_BTN = "//article[contains(.,'FRESHLY DISCOUNTED')]//div[@class='control-btn']//a[@title='Buy Now']";
	public static final String FRESHLY_DISCOUNTED_CONTACT_SELLER_BTN = "//article[contains(.,'FRESHLY DISCOUNTED')]//div[@class='control-btn']//a[@title='Contact Seller']";
	public static final String FRESHLY_DISCOUNTED_ADD_TO_WATCHLIST_BTN = "//article[contains(.,'FRESHLY DISCOUNTED')]//div[@class='control-btn']//a[@title='Add to Watchlist']";
	public static final String PRODUCT_FOR_SALE_PRODUCT_NAME = "";
	public static final String PRODUCT_FOR_BID_PRODUCT_NAME = "";
	public static final String PRODUCT_CLOSED_SOON_FOR_BID_PRODUCT_NAME = "";
	public static final String PRODUCT_CATEGORIES = "";

}
