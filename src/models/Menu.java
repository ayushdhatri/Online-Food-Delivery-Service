package models;

import java.util.ArrayList;
import java.util.List;

public class Menu {
   List<MenuItem> items;

   public Menu(){
       this.items = new ArrayList<>();
   }

   void addItem(MenuItem item){
       this.items.add(item);
   }

   List<MenuItem> getItems(){
       return this.items;
   }

}
