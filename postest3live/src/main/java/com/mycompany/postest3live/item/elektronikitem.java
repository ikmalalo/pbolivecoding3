/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.postest3live.item;

/**
 *
 * @author ikmal
 */
public class elektronikitem extends Item{
    private final int Tahun;

    public elektronikitem(int Tahun, String Nama, int Stock) {
        super(Nama, Stock);
        this.Tahun = Tahun;
    }

    @Override
    public void DisplayItem() {
        System.out.println("Nama Item:" + getNama());
        System.out.println("Stock Item:" + getStock());
        System.out.println("Tahun:" + Tahun);
    }
    
    
    
}
