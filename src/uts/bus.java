/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author ASUS
 */
public class bus {
    
    private int jumlahOrg;
    private String tujuan;
    
    bus(int a, String b){
        this.jumlahOrg = a;
        this.tujuan = b;
    }
    
    bus(int a){
        this.jumlahOrg = a;
    }
    
    public void menuju(){
        System.out.println(""+this.jumlahOrg+" penumpang menuju "+this.tujuan);
    }
    
    public String setTujuan(String a){
        return this.tujuan = a;
    }
    
    public int tambah(int a){
        int t = this.jumlahOrg + a;
        return this.jumlahOrg = t;
    }
    
    public int kurang(int a){
        int k = this.jumlahOrg - a;
        return this.jumlahOrg = k;
    }
    
    public int naik(int a){
        int t = this.jumlahOrg + a;
        System.out.println("Jumlah penumpang yang naik: "+a);
        this.jumlahOrg = t;
        return this.jumlahOrg;
    }
    
    public int turun(int a){
        int t = this.jumlahOrg - a;
        System.out.println("Jumlah penumpang yang turun: "+a);
        this.jumlahOrg = t;
        return this.jumlahOrg;
    }
    
    public void sampai(){
        System.out.println("Bus sampai di Halte "+this.tujuan);
    }
    
    public void statusBUS(){
        System.out.println("Jumlah Penumpang saat ini adalah "+this.jumlahOrg);
    }
    

}
    

