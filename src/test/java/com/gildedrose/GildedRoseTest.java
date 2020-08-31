package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void WhenUpdatingSulfurasThenRemaisEqual() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10,  10) };
        //Arrange
        GildedRose app = new GildedRose(items);
        //Act
        app.updateQuality();
        //Assert
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
    }

}
