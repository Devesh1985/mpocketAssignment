
package com.mysamplecompany.SamplePOMProject.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.mysamplecompany.SamplePOMProject.base.Constants;
import com.mysamplecompany.SamplePOMProject.base.Page;
import com.mysamplecompany.SamplePOMProject.pages.locators.CartPageLocator;



public class CartPage extends Page {
	
	public CartPageLocator cartPage;
	//public CatalogPageLocator catlogpage;
	HomePage homePage =  new HomePage();
	String price;

	public CartPage(){	
		//this.catlogpage=new CatalogPageLocator();
		this.cartPage = new CartPageLocator();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,Constants.implicitwait);
		PageFactory.initElements(factory, this.cartPage);
	}	
		public CartPage waitForCartaPage() {
			//switchWindow();
			waitTillElementPresent(this.cartPage.ItemInCart);
			price=getText(this.cartPage.cartPrice);
			return this;
			
		}
		
		public CartPage cartUpdateFunctioanlity(String value) {
		    
			selectFromDropDown(this.cartPage.itemDropDown, value);			
			type(this.cartPage.dropDownValue,value);
			click(this.cartPage.countUpdateBtn);
			waitTillElementPresent(this.cartPage.cartPrice);
			System.out.println("updated price before");
			String updatedPrice=getText(this.cartPage.cartPrice);
			
			assert updatedPrice!=price;
			System.out.println("updated price after");
			return this;
		}
		
		public CartPage cartDeleteFunctioanlity() {
			
				waitTillElementPresent(this.cartPage.deleteCart);
				click(this.cartPage.deleteCart);
				waitTillElementPresent(this.cartPage.cartIcon);
				int cartCount=Integer.parseInt(getText(this.cartPage.cartIcon));
				System.out.println(cartCount);
				assert cartCount==0;
			
			return this;
			
					}
		
		public CartPage emptyCart() {
			int cartCount=Integer.parseInt(getText(this.cartPage.cartIcon));
			if(cartCount!=0) {
			click(this.cartPage.cartIcon);
			cartDeleteFunctioanlity();
			}
			return this;
			
		}
		
}