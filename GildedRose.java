package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : Item){
            updateItem(item);
            }
        }
    
    public static void updateItem(Item item){
        cheese(item);
        concert(item);
        !concert(item);
        handOfRagnaros(item);
    }    
    
    public void decrementQuality(){
        if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
            items[i].quality = items[i].quality - 1;
                               }
    
    public void incrementItem(){
        if (items[i].quality < 50) {
            items[i].quality = items[i].quality + 1;
        }
    }
    
    private static void cheese(Item item){
        if (!items[i].name.equals("Aged Brie")
        && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (items[i].quality > 0) {
                decrementQuality(item);
        }
            else {
                incrementItem(item);
            }
    }
        
     private static void concert(Item item){
         if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
             if (items[i].sellIn < 11 && item.SellIn < 6) 
             { 
                 incrementItem(item);
     }
     private static void !concert(Item item){
          if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert" && items[i].quality > 0) {       
                decrementQuality();
          }
          else{
              items[i].quality = items[i].quality - items[i].quality;
          }
          
}
      private static void handOfRagnaros(Item item){
           if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
               items[i].sellIn = items[i].sellIn - 1;
                       }      
      }       
         }
        