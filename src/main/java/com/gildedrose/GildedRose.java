package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

    	for (int i=0; i<items.length;i++) {	
    		ItemAttributes itemAttributes = new ItemAttributes();
    		itemAttributes.selectCategory(items[i]).updateItemAttributes(items[i]);
  		}		
    }  
}