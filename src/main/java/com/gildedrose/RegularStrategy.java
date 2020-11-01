package com.gildedrose;

public class RegularStrategy implements IUpdate {
    @Override
    public void Update(Item item) {
        if(item.quality>0) item.quality -= 1;
        item.sellIn-=1;

    }

    @Override
    public boolean Apply(Item item) {
        return true;
    }
}
