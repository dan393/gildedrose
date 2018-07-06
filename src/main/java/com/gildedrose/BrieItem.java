package com.gildedrose;

public class BrieItem implements SimpleItem {
    Item item;

    public BrieItem(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        item.quality +=1;
    }

    @Override
    public void updateSellIn() {
        item.quality -=1;
    }

}
