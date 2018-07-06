package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
//            SimpleItem simpleItem = createItem(item);
//            simpleItem.
            if (item.name.equals("Aged Brie") || item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.quality < 50) {
                    item.quality += 1;
                    increaseQualityIfBackstagePasse(item);
                }
            } else {
                decreaseItemQualityExceptSulfurus(item);
            }

            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.sellIn -= 1;
            }

            if (item.sellIn < 0) {
                if (item.name.equals("Aged Brie")) {
                    if (item.quality < 50) {
                        item.quality += 1;
                    }
                } else {
                    if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        decreaseItemQualityExceptSulfurus(item);
                    } else {
                        item.quality = 0;
                    }
                }
            }
        }
    }

    private SimpleItem createItem(Item item) {
        switch (item.name) {
            case "Aged Brie":
                return new BrieItem(item);
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurusItem(item);
            default:
                return new RegularItem(item);
        }
    }

    private void decreaseItemQualityExceptSulfurus(Item item) {
        if (item.quality > 0) {
            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.quality -= 1;
            }
        }
    }

    private void increaseQualityIfBackstagePasse(Item item) {
        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
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
    }
}