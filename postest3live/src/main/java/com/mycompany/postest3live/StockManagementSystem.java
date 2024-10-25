/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.postest3live;

import com.mycompany.postest3live.item.FoodItem;
import com.mycompany.postest3live.item.elektronikitem;
import com.mycompany.postest3live.item.Item;
import java.util.ArrayList;

/**
 *
 * @author ikmal
 */
public class StockManagementSystem {

    public static void main(String[] args) {
        ArrayList<Item> item = new ArrayList<>();
        
        elektronikitem laptop1 = new elektronikitem(2015, "Acer", 70);
        FoodItem Burger1 = new FoodItem(2018 , "Burger Lunchly", 20);
        
        item.add(laptop1);
        item.add(Burger1);
        
        
        for (Item items : item){
            items.DisplayItem();
            System.out.println("-----------------------");
        }
        
        laptop1.reducestock(5);
        Burger1.reducestock(5);
        System.out.println("\n Berhasil DIkurang");
        for (Item items : item){
            items.DisplayItem();
            System.out.println("-----------------------");
        }
    }
}
