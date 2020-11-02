package com.gildedrose;

public class RegularStrategy implements IUpdate {


    public void Update(Item item) {
        if(item.quality>0) item.quality -= 1;
        item.sellIn-=1;

    }
    public boolean Apply(Item item) {
        return true;
    }
}
