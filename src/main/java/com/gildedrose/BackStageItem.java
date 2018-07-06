package com.gildedrose;

public class BackStageItem implements SimpleItem {
    Item item;

    public BackStageItem(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality()
    {
        if (item.quality < 50) {
            item.quality += 1;
        }

        if (item.sellIn < 11) {
            if (item.quality < 50) {
                item.quality += 1;
            }
        }

        if (item.sellIn < 6) {
            if (item.quality < 50) {
                item.quality += 1;
            }
        }

    }

    @Override
    public void updateSellIn() {
        item.quality -=1;
    }

}
