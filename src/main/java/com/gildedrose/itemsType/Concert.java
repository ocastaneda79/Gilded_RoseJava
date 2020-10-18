package com.gildedrose.itemsType;

import com.gildedrose.ItemAttributes;
import com.gildedrose.Item;

public class Concert extends ItemAttributes {
	
	/*
	
	- "Backstage passes", like aged brie, increases in Quality as its SellIn value approaches;
				Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but
				Quality drops to 0 after the concert
	*/
	
    public void updateQuality(Item item) {
    	  	
    	increaseQuality(item);
    	
    	if(item.sellIn <=10 && item.sellIn>5) {
    		//2 in total
    		increaseQuality(item);	
    	}
    	if (item.sellIn<6 && item.sellIn>=0) {
    		//3 in total
    		increaseQuality(item);
    		increaseQuality(item);	
    	}
    	if(item.sellIn<0) {
    		setQualityValue(item, 0);
    	}
    }

}
