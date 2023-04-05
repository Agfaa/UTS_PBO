/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Bus berangkat dari PULL/Kantor");
        bus BUS_ori = new bus(5);
        BUS_ori.statusBUS();
        bus[] BUS;
        BUS = new bus[20];
        BUS[0] = new bus(3, "PORONG");
        BUS[0].menuju();
        BUS[1] = new bus(2, "GRESIK"); 
        BUS[1].menuju();
        
        System.out.println("");
        halte porong = new halte(2, "PORONG");
        porong.statusHalte();
        BUS[0].sampai();
        BUS[0].turun(3);
        BUS[0].naik(2);
        BUS_ori.kurang(3);
        BUS_ori.tambah(2);
        porong.berkurang(2);
        BUS[0].setTujuan("SURABAYA");
        BUS_ori.statusBUS();
        porong.statusHalte();
        
        System.out.println("");
        halte surabaya = new halte(5, "SURABAYA");
        surabaya.statusHalte();
        BUS[0].sampai();
        BUS[0].turun(1);
        BUS[0].naik(5);
        surabaya.berkurang(5);
        BUS[0].setTujuan("GRESIK");
        BUS_ori.tambah(3);
        BUS_ori.statusBUS();
        surabaya.statusHalte();
        
        System.out.println("");
        halte gresik = new halte("GRESIK");
        gresik.statusHalte();
        BUS[0].sampai();
        BUS[0].turun(8);
        BUS_ori.kurang(7);
        BUS_ori.statusBUS();
    }
    }
    
