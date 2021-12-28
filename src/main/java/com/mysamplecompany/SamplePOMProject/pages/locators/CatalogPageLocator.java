package com.mysamplecompany.SamplePOMProject.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPageLocator {
	@FindBy(css = "div.s-result-list")
	public WebElement searchList;
	
	@FindBy(xpath ="//div[contains(@class,'s-result-list')]//div[@data-component-type='s-search-result'][2]//h2//span[contains(@class,'a-size-base-plus')]")
	public WebElement itemInList;
	
	@FindBy(id="add-to-cart-button")
	public WebElement addToCart;
	
	@FindBy(id="nav-cart-count")
	public WebElement cartIcon;
	
	
}