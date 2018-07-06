package com.gildedrose;

public class RegularItem implements SimpleItem {
    Item item;

    public RegularItem(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        item.quality -=1;
    }

    @Override
    public void updateSellIn() {
        item.sellIn -=1;
    }

}
