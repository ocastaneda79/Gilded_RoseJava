package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {
    //Sulfuras tests
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
    @Test
    void SulfatasMaxQuality() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10,  80) };
        //Arrange
        GildedRose app = new GildedRose(items);
        //Act
        app.updateQuality();
        //Assert
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
    }
    //Aged Brie tests
    @Test
    void WhenUpdatingAgedBrieIncreasesQuality() {
        Item[] items = new Item[] { new Item("Aged Brie", 10,  10) };
        //Arrange
        GildedRose app = new GildedRose(items);
        //Act
        app.updateQuality();
        //Assert
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
    }
    @Test
    void WhenUpdatingAgedBrieIncreases2Quality() {
        Item[] items = new Item[] { new Item("Aged Brie", 0,  10) };
        //Arrange
        GildedRose app = new GildedRose(items);
        //Act
        app.updateQuality();
        //Assert
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
    }
    @Test
    void WhenUpdatingAgedBrieDoesNotIncreaseQuality() {
        Item[] items = new Item[] { new Item("Aged Brie", 0,  50) };
        //Arrange
        GildedRose app = new GildedRose(items);
        //Act
        app.updateQuality();
        //Assert
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }
    //Backstage passes tests
    @Test
    void PassesNormalUpdate() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 15,  20) };
        //Arrange
        GildedRose app = new GildedRose(items);
        //Act
        app.updateQuality();
        //Assert
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(14, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
    }
    @Test
    void PassesDoubleUpdate() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10,  20) };
        //Arrange
        GildedRose app = new GildedRose(items);
        //Act
        app.updateQuality();
        //Assert
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
    }
    @Test
    void PassesTrippleUpdate() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20) };
        //Arrange
        GildedRose app = new GildedRose(items);
        //Act
        app.updateQuality();
        //Assert
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(23, app.items[0].quality);
    }
    @Test
    void PassesQualtyToZero() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50) };
        //Arrange
        GildedRose app = new GildedRose(items);
        //Act
        app.updateQuality();
        //Assert
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }
    //Normal items tests
    @Test
    void WhenUpdatingNormalItemIfSellInhasPassedThenQualityDegradesTwiceAsFast() {
        Item[] items = new Item[] { new Item("Foo",  0, 10) };
        //Arrange
        GildedRose app = new GildedRose(items);
        //Act
        app.updateQuality();
        //Assert
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
    }
    @Test
    void WhenUpdatingNormalItemWithZeroQualityThenQualityRemainsZero() {
        Item[] items = new Item[] { new Item("Foo",  0, 0) };
        //Arrange
        GildedRose app = new GildedRose(items);
        //Act
        app.updateQuality();
        //Assert
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    //Conjured items tests
    /* feature to be implemented
    @Test
    void WhenUpdatingNormalItemWithZeroQualityThenQualityRemainsZero() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake",  10, 10) };
        //Arrange
        GildedRose app = new GildedRose(items);
        //Act
        app.updateQuality();
        //Assert
        assertEquals("Conjured Mana Cake", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
    }
     */
}