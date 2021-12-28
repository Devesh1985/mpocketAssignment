
package com.mysamplecompany.SamplePOMProject.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.mysamplecompany.SamplePOMProject.base.Constants;
import com.mysamplecompany.SamplePOMProject.base.Page;
import com.mysamplecompany.SamplePOMProject.pages.locators.HomePageLocators;

public class HomePage extends Page {
	
	public HomePageLocators home;
	
	public HomePage(){
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,Constants.implicitwait);
		PageFactory.initElements(factory, this.home);
	}
	
	public HomePage userLandTOHomePage(){		
		waitTillElementPresent(this.home.searchBox);
		return this;
				
	}
	
	public HomePage userSearchValue() {
		
		type(this.home.searchBox,"menscap");
		click(this.home.searchSubmit);
		return this;
		}
	
	
	
	 
}
