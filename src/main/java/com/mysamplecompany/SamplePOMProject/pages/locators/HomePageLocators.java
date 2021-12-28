package com.mysamplecompany.SamplePOMProject.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	@FindBy(id="twotabsearchtextbox")
	public WebElement searchBox;
	
	@FindBy(id="nav-search-submit-button")
	public WebElement searchSubmit;
}
