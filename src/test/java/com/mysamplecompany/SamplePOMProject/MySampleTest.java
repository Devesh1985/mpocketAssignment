package com.mysamplecompany.SamplePOMProject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mysamplecompany.SamplePOMProject.base.Page;
import com.mysamplecompany.SamplePOMProject.pages.actions.CartPage;
import com.mysamplecompany.SamplePOMProject.pages.actions.CatalogPage;
import com.mysamplecompany.SamplePOMProject.pages.actions.HomePage;


public class MySampleTest {
	
	@BeforeTest
	public void init() {
		Page.initConfiguration();
	}
	
	@Test
	public void searchProduct(){
		HomePage homePage = new HomePage();
		homePage
			.userLandTOHomePage()
			.userSearchValue();
	}
	
	@Test(dependsOnMethods = { "searchProduct" })
	public void addToCart() {
		CatalogPage cataLogPage=new CatalogPage();
		cataLogPage
			.waitForCatalogPage()
			.addToCart();
	}
	
	@Test(dependsOnMethods = { "addToCart" })
	public void updateCartCount() {
       
		CartPage cartPage=new CartPage();
		cartPage
			.waitForCartaPage()
			.cartUpdateFunctioanlity("10");
			
	}
	
	@Test(dependsOnMethods = { "updateCartCount" })
	public void deleteCartItem() {
		CartPage cartPage=new CartPage();
		cartPage
		.cartDeleteFunctioanlity();
		
	}
	@AfterTest
	public void tearDown() {
		CartPage cartPage=new CartPage();
		cartPage.emptyCart();
		Page.quitBrowser();
	}
}
