package com.gildedrose.itemsType;

import com.gildedrose.ItemAttributes;
import com.gildedrose.Item;

public class Brie extends ItemAttributes {

	
	/*	
	- "Aged Brie" actually increases in Quality the older it gets
	*/

    public void updateQuality(Item item) {
    	increaseQuality(item);	
    }
    

}
