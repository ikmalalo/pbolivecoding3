/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.postest3live.item;

/**
 *
 * @author ikmal
 */
public abstract class Item {
    private final String Nama;
    private int Stock = 0;
    
    public Item(String Nama, int Stock){
       this.Nama = Nama;
       this.Stock = Stock;
    }

    public String getNama() {
        return Nama;
    }

    public int getStock() {
        return Stock;
    }
   
    public abstract void DisplayItem();
    
    public void reducestock(int Amount){
        if (Amount <= Stock){
            Stock -= Amount;
        } else {
            System.out.println("Stok gk cukup");
        }
    }
            
}