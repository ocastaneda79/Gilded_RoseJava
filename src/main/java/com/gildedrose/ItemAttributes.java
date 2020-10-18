package com.gildedrose;

import com.gildedrose.itemsType.Brie;
import com.gildedrose.itemsType.Concert;
import com.gildedrose.itemsType.Elixir;
import com.gildedrose.itemsType.Sulfuras;
import com.gildedrose.itemsType.Vest;
import com.gildedrose.itemsType.Conjured;

public class ItemAttributes {
	
	

	public ItemAttributes selectCategory(Item item) {
	
		
    	if (item.name.equals("Elixir of the Mongoose")) {
    		return new Elixir();
    	}
     	if (item.name.equals("Aged Brie")) {
    		return new Brie();
    	}	
    	if (item.name.equals("+5 Dexterity Vest")) {
    		return new Vest();
    	}
    	if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
    		return new Sulfuras();
    	}	
    	if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
    		return new Concert();  		
    	}
    	if (item.name.equals("Conjured Mana Cake")) {
    		return new Conjured();
    	}
		return new ItemAttributes();
		
	}



	/*
	======================================
	- Once the sell by date has passed, Quality degrades twice as fast
	- The Quality of an item is never negative
	- The Quality of an item is never more than 50
	======================================
	*/
	
	public void updateItemAttributes(Item item) {	
		updateSellIn(item);
		updateQuality(item);
		
	}
	
	
	
	public void updateQuality (Item item) {
		decreaseQuality(item);
	
	}
	
	
	public void updateSellIn(Item item) {
		decreaseSellIn(item);
	}
	
	//======================================
			
	
	 protected void decreaseQuality(Item item) {
		if(item.quality<=50 && item.quality>0){
			item.quality--;
		}
	}
	 

	 protected void decreaseSellIn(Item item) {
		item.sellIn--;		
	}
	

	protected void increaseQuality(Item item) {		
		if(item.quality<50 && item.quality>=0){
			item.quality++;
		}
	}

	//======================================
	
	 
	protected void setQualityValue(Item item, int value) {	
		item.quality = value;
	}

	protected void setSellIn(Item item, int value) {
		item.sellIn = value;
	}
	
}

