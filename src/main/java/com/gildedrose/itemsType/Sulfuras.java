package com.gildedrose.itemsType;

import com.gildedrose.ItemAttributes;
import com.gildedrose.Item;

public class Sulfuras extends ItemAttributes {
	
	/*
	- "Sulfuras", being a legendary item, never has to be sold or decreases in Quality
	Just for clarification, an item can never have its Quality increase above 50, however "Sulfuras" is a
	legendary item and as such its Quality is 80 and it never alters.
	*/
	
	
	public void updateQuality (Item item) {		
		super.setQualityValue(item, 80);
	}
	

	
	public void updateSellIn(Item item) {
		//Sulfuras never has to be sold
		super.setSellIn(item, 999);
		
		
	}

	

}
