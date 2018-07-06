package com.gildedrose;

public class SulfurusItem implements SimpleItem {
    Item item;

    public SulfurusItem(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        return;
    }

    @Override
    public void updateSellIn() {
        return;
    }

}
