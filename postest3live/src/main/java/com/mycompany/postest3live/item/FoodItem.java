/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.postest3live.item;

/**
 *
 * @author ikmal
 */
public class FoodItem extends Item{
    private final int tgl_kadaluarsa;
    
    public FoodItem(int tgl_kadaluarsa, String Nama, int Stock) {
        super(Nama, Stock);
        this.tgl_kadaluarsa = tgl_kadaluarsa;
    }

    @Override
    public void DisplayItem() {
        System.out.println("Nama Item:" + getNama());
        System.out.println("Stock Item:" + getStock());
        System.out.println("Tahun:" + tgl_kadaluarsa);
    }
    
    
    
}

