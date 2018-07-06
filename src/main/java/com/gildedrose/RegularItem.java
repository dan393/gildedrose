package com.gildedrose;

public class RegularItem implements SimpleItem {
    Item item;

    public RegularItem(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        if (item.quality > 0 && item.sellIn > 0) {
            item.quality -= 1;
        } else  if (item.quality>1){
            item.quality -=2;
        }
    }
    @Override
    public void updateSellIn(){
        item.sellIn -=1;
    }

}
