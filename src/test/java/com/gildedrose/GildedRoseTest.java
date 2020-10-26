package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {
    private Item[] GetItems() {
        return new Item[]{new Item("Sulfuras, Hand of Ragnaros", 10,  10),
                new Item("Foo",  0, 10),
                new Item("Foo",  0, 0)};
    }
    private  Item[] SutItems = GetItems();


    @Test
    void WhenUpdatingSulfurasThenRemaisEqual() {

        //Arrange
        GildedRose app = new GildedRose(SutItems);
        //Act
        app.updateQuality();
        //Assert
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
    }
    @Test
    void WhenUpdatingNormalItemIfSellInhasPassedThenQualityDegradesTwiceAsFast() {

        //Arrange
        GildedRose app = new GildedRose(SutItems);
        //Act
        app.updateQuality();
        //Assert
        assertEquals(-1, app.items[1].sellIn);
        assertEquals(8, app.items[1].quality);
    }
    @Test
    void WhenUpdatingNormalItemWithZeroQualityThenQualityRemainsZero() {

        //Arrange
        GildedRose app = new GildedRose(SutItems);
        //Act
        app.updateQuality();
        //Assert
        assertEquals(-1, app.items[2].sellIn);
        assertEquals(0, app.items[2].quality);
    }
}
