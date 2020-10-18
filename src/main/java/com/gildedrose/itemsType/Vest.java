package com.gildedrose.itemsType;

import com.gildedrose.ItemAttributes;
import com.gildedrose.Item;

public class Vest extends ItemAttributes {
	
	/*
    	- Once the sell by date has passed, Quality degrades twice as fast
	*/
	
	
    public void updateQuality(Item item) {
    	decreaseQuality(item);
    	if(item.sellIn<=0) {
    	decreaseQuality(item);
    	}	
    }
    
  }
    	