package com.mysamplecompany.SamplePOMProject.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageLocator {
	
	
	@FindBy(css = "span.a-truncate-cut")
	public WebElement ItemInCart;
	
	@FindBy(id = "quantity")
	public WebElement itemDropDown;

	@FindBy(css = "input[name='quantityBox']")
	public WebElement dropDownValue;
	
	@FindBy(css = "a[data-action='update']")
	public WebElement countUpdateBtn;
	
	@FindBy(css = "span[id='sc-subtotal-amount-activecart'] > span")
	public WebElement cartPrice;
	
	@FindBy(css = "input[data-action='delete']")
	public WebElement deleteCart;
	
	@FindBy(id="nav-cart-count")
	public WebElement cartIcon;
	
	
	
	
	
	
	
	
	
	
	
}
