package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void lowerQualityForRegularItem() {
        Item[] items = new Item[] { new Item("foo", 5, 10),
                new Item("Aged Brie", 6, 8),
                new Item("Meatballs", -1, 8),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].quality);
        assertEquals(4, app.items[0].sellIn);

        assertEquals(9, app.items[1].quality);
        assertEquals(5, app.items[1].sellIn);

        assertEquals(6, app.items[2].quality);
        assertEquals(-2, app.items[2].sellIn);

        assertEquals(80, app.items[3].quality);
        assertEquals(0, app.items[3].sellIn);
    }
}
