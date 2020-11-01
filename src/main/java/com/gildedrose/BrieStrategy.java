package com.gildedrose;

public class BrieStrategy extends RegularStrategy {
    @Override
    public boolean Apply(Item item) {
        if (item.name.contains("Brie")) return true;
        return false;
    }

    @Override
    public void Update(Item item) {
        super.Update(item);
    }
}
