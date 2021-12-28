
package com.mysamplecompany.SamplePOMProject.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.mysamplecompany.SamplePOMProject.base.Constants;
import com.mysamplecompany.SamplePOMProject.base.Page;
import com.mysamplecompany.SamplePOMProject.pages.locators.CatalogPageLocator;


public class CatalogPage extends Page {
	
	public CatalogPageLocator catalog;
	HomePage homePage =  new HomePage();
	

	public CatalogPage(){
		
		this.catalog = new CatalogPageLocator();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,Constants.implicitwait);
		PageFactory.initElements(factory, this.catalog);
		
	}
	
	public CatalogPage waitForCatalogPage() {
		waitTillElementPresent(this.catalog.itemInList);
		return this;
		
	}
	
	public CatalogPage addToCart() {
		click(this.catalog.itemInList);
		switchWindow();
		waitTillElementPresent(this.catalog.addToCart);
		click(this.catalog.addToCart);
		click(this.catalog.cartIcon);
		return this;
		
	}
}
