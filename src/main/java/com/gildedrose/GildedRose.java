package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            SimpleItem simpleItem = createItem(item);
            simpleItem.updateQuality();
            simpleItem.updateSellIn();
        }

    }

    private SimpleItem createItem (Item item){
        switch (item.name) {
            case "Aged Brie":
                return new BrieItem(item);
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurusItem(item);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackStageItem(item);
            default:
                return new RegularItem(item);
        }
    }

}