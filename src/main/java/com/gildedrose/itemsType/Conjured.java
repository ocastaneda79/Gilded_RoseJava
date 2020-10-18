package com.gildedrose.itemsType;

import com.gildedrose.ItemAttributes;
import com.gildedrose.Item;

public class Conjured extends ItemAttributes {
	
	
	/*
	- "Conjured" items degrade in Quality twice as fast as normal items
	- Once the sell by date has passed, Quality degrades twice as fast
	*/
	
	
    public void updateQuality(Item item) {
    	
    	decreaseQuality(item);
    	decreaseQuality(item);
    	
    	if(item.sellIn<0) {
    		//if sell date passed, quality degrades x2 (it was x2, so total of x4)
    	   	decreaseQuality(item);
        	decreaseQuality(item);
    		
    	}
    
    	
    }

  
}
