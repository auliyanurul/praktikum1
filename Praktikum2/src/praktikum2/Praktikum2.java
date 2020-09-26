/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author Acer
 */
public class Praktikum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyKeramik k1=new MyKeramik(30, 30, 10, 54000);
        
        System.out.println("--------------------------------------");
        System.out.println("KERAMIK A");
        System.out.println("Luas Keramik 1 BOX          ="+k1.luasKeramik()+ " satuan luas");
        System.out.println("Kebutuhan Keramik           ="+k1.kebutuhanKeramik());
        System.out.println("Harga eceran Keramik        ="+k1.hargaSatuan());
        System.out.println("Harga total seluruh Keramik ="+k1.hargaKeramik());
        System.out.println("--------------------------------------");
        
        MyKeramik k2=new MyKeramik(40, 40, 5, 65000);
        
        System.out.println("--------------------------------------");
        System.out.println("KERAMIK A");
        System.out.println("Luas Keramik 1 BOX          ="+k2.luasKeramik()+ " satuan luas");
        System.out.println("Kebutuhan Keramik           ="+k2.kebutuhanKeramik());
        System.out.println("Harga eceran Keramik        ="+k2.hargaSatuan());
        System.out.println("Harga total seluruh Keramik ="+k2.hargaKeramik());
        System.out.println("--------------------------------------");
        
        MyKeramik k3=new MyKeramik(30, 40, 8, 60000);
        
        System.out.println("--------------------------------------");
        System.out.println("KERAMIK A");
        System.out.println("Luas Keramik 1 BOX          ="+k3.luasKeramik()+ " satuan luas");
        System.out.println("Kebutuhan Keramik           ="+k3.kebutuhanKeramik());
        System.out.println("Harga eceran Keramik        ="+k3.hargaSatuan());
        System.out.println("Harga total seluruh Keramik ="+k3.hargaKeramik());
        System.out.println("--------------------------------------");
    }
    
}
