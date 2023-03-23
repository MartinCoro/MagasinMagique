package com.magasin;

class Magasin {
    Item[] items;

    public Magasin(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Comté") && !items[i].name.equals("Pass VIP Concert") && !items[i].name.equals("Kryptonite")){
                if (items[i].quality > 0){
                    items[i].quality = items[i].quality - 1;
                    if (items[i].sellIn < 0){
                        items[i].quality = items[i].quality - 1;
                    }
                }
            }

            if (items[i].name.equals("Comté") && items[i].quality < 50){
                items[i].quality = items[i].quality +1;
                if (items[i].sellIn < 0){
                    items[i].quality = items[i].quality +1;
                }
            }

            if (items[i].name.equals("Pass VIP Concert") && items[i].quality < 50){
                items[i].quality = items[i].quality +1;
                if (items[i].sellIn < 11){
                    items[i].quality = items[i].quality +1;
                }
                if (items[i].sellIn < 6){
                    items[i].quality = items[i].quality +1;
                }
                if (items[i].sellIn < 0){
                    items[i].quality = 0;
                }
            }

            if (!items[i].name.equals("Kryptonite")) {
                items[i].sellIn = items[i].sellIn - 1;
            }
        }
    }
}
