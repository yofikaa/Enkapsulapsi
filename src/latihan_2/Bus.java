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
public class Bus {
     private int penumpang;
    private int maxPenumpang;
    
    //konstruktor kelas Bus
    public Bus (int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    //method mutator untuk menambahkan penumpang
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if (temp >= maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else {
            this.penumpang = temp;
        }
    }
    public void cetak (){
        System.out.println("Penumpang Bus sekarang adalah " + penumpang);
        System.out.println("Penumpang Bus seharusnya adalah " +maxPenumpang);
    }
}
