package com.gildedrose;

public class BrieStrategy implements IUpdate {

    @Override
    public boolean Apply(Item item) {
        if (item.name.contains("Brie")) return true;
        return false;
    }

    @Override
    public void Update(Item item) {
        item.quality++;
    }
}
