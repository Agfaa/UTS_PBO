/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author ASUS
 */
public class halte {
    private String nama;
    private int jumlahOrg;
    
    halte(int a, String nama){
        this.jumlahOrg = a;
        this.nama = nama;
    }
    
    halte(String nama){
        this.nama = nama;
    }
    
    public int berkurang(int a){
        int b = this.jumlahOrg - a;
        return this.jumlahOrg = b;
    }
    
    public void statusHalte(){
        System.out.println("Halte "+nama+": "+this.jumlahOrg+" Penumpang menunggu");
    }
    
}
