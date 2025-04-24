package com.pluralsight;

public class Product {
   private String itemId = "";
   private String item ="";
   private float price =0;

   public Product(String itemId, String item, float price) {
      this.itemId = itemId;
      this.item = item;
      this.price = price;
   }
   public String getItemId() {
      return itemId;
   }

   public void setItemId(String itemId) {
      this.itemId = itemId;
   }

   public float getPrice() {
      return price;
   }

   public void setPrice(float price) {
      this.price = price;
   }

   public String getItem() {
      return item;
   }

   public void setItem(String item) {
      this.item = item;
   }

   @Override
   public String toString() {
      return "Products " +
              "itemId=" + itemId+
              ", item=" + item +
              ", price=" + price;
   }

}
