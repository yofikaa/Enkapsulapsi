/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_2;

/**
 *
 * @author Yofika Audrey
 */
public class UjiBus {
    public static void main (String[] arg){
        
        //membuat objek busBesar dari class Bus
        Bus busBesar = new Bus(40);
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(15);//menambahkan 15 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(5);//menambhakan 5 peumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(26);//menambhakan 26 penumpang
        busBesar.cetak();
    }
}
