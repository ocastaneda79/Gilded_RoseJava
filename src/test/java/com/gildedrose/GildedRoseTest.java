package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {


    private Item[] testItems = new Item[]{
            new Item("Sulfuras, Hand of Ragnaros", 10,  10),
            new Item("Sulfuras, Hand of Ragnaros", 10,  80),
            new Item("Aged Brie", 10,  10),
            new Item("Aged Brie", 0,  10),
            new Item("Aged Brie", 0,  50),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15,  20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10,  20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50),
            new Item("Foo",  0, 10),
            new Item("Foo",  0, 0)

    };
    private GildedRose sut = new GildedRose(testItems);

    private GildedRoseTest() {

        sut.updateQuality();
    }

    //Sulfuras tests
    @Test
    void WhenUpdatingSulfurasThenRemaisEqual() {
        //Assert
        assertEquals("Sulfuras, Hand of Ragnaros", sut.items[0].name);
        assertEquals(10, sut.items[0].sellIn);
        assertEquals(10, sut.items[0].quality);
    }
    @Test
    void SulfatasMaxQuality() {

        //Assert
        assertEquals("Sulfuras, Hand of Ragnaros", sut.items[1].name);
        assertEquals(10, sut.items[1].sellIn);
        assertEquals(80, sut.items[1].quality);
    }
    //Aged Brie tests
    @Test
    void WhenUpdatingAgedBrieIncreasesQuality() {


        //Assert
        assertEquals("Aged Brie", sut.items[2].name);
        assertEquals(9, sut.items[2].sellIn);
        assertEquals(11, sut.items[2].quality);
    }
    @Test
    void WhenUpdatingAgedBrieIncreases2Quality() {


        //Assert
        assertEquals("Aged Brie", sut.items[3].name);
        assertEquals(-1, sut.items[3].sellIn);
        assertEquals(12, sut.items[3].quality);
    }
    @Test
    void WhenUpdatingAgedBrieDoesNotIncreaseQuality() {

        //Assert
        assertEquals("Aged Brie", sut.items[4].name);
        assertEquals(-1, sut.items[4].sellIn);
        assertEquals(50, sut.items[4].quality);
    }
    //Backstage passes tests
    @Test
    void PassesNormalUpdate() {

        //Assert
        assertEquals("Backstage passes to a TAFKAL80ETC concert", sut.items[5].name);
        assertEquals(14, sut.items[5].sellIn);
        assertEquals(21, sut.items[5].quality);
    }
    @Test
    void PassesDoubleUpdate() {

        //Assert
        assertEquals("Backstage passes to a TAFKAL80ETC concert", sut.items[6].name);
        assertEquals(9, sut.items[6].sellIn);
        assertEquals(22, sut.items[6].quality);
    }
    @Test
    void PassesTrippleUpdate() {

        //Assert
        assertEquals("Backstage passes to a TAFKAL80ETC concert", sut.items[7].name);
        assertEquals(4, sut.items[7].sellIn);
        assertEquals(23, sut.items[7].quality);
    }
    @Test
    void PassesQualtyToZero() {

        //Assert
        assertEquals("Backstage passes to a TAFKAL80ETC concert", sut.items[8].name);
        assertEquals(-1, sut.items[8].sellIn);
        assertEquals(0, sut.items[8].quality);
    }
    //Normal items tests
    @Test
    void WhenUpdatingNormalItemIfSellInhasPassedThenQualityDegradesTwiceAsFast() {

        //Assert
        assertEquals(-1, sut.items[9].sellIn);
        assertEquals(8, sut.items[9].quality);
    }
    @Test
    void WhenUpdatingNormalItemWithZeroQualityThenQualityRemainsZero() {

        //Assert
        assertEquals(-1, sut.items[10].sellIn);
        assertEquals(0, sut.items[10].quality);
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