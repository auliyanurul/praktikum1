/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author Acer
 */
public class Praktikum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Keramik k1=new Keramik();
        k1.sisiA=30;
        k1.sisiB=30;
        k1.isi=10;
        k1.harga=54000;
        System.out.println("--------------------------------------");
        System.out.println("KERAMIK A");
        System.out.println("Luas Keramik 1 BOX          = "+k1.luasKeramik()+ "satuan luas");
        System.out.println("Kebutuhan Keramik           ="+k1.kebutuhanKeramik());
        System.out.println("Harga eceran Keramik        ="+k1.hargaSatuan());
        System.out.println("Harga total seluruh Keramik ="+k1.hargaKeramik());
        System.out.println("--------------------------------------");
        
        Keramik k2=new Keramik();
        k2.sisiA=30;
        k2.sisiB=40;
        k2.isi=8;
        k2.harga=60000;
        System.out.println("--------------------------------------");
        System.out.println("KERAMIK B");
        System.out.println("Luas Keramik 1 BOX          ="+k2.luasKeramik()+ "satuan luas");
        System.out.println("Kebutuhan Keramik           ="+k2.kebutuhanKeramik());
        System.out.println("Harga eceran Keramik        ="+k2.hargaSatuan());
        System.out.println("Harga total seluruh Keramik ="+k2.hargaKeramik());
        System.out.println("--------------------------------------");
        
        Keramik k3=new Keramik();
        k3.sisiA=40;
        k3.sisiB=40;
        k3.isi=5;
        k3.harga=65000;
        System.out.println("--------------------------------------");
        System.out.println("KERAMIK C");
        System.out.println("Luas Keramik 1 BOX          ="+k3.luasKeramik()+ "satuan luas");
        System.out.println("Kebutuhan Keramik           ="+k3.kebutuhanKeramik());
        System.out.println("Harga eceran Keramik        ="+k3.hargaSatuan());
        System.out.println("Harga total seluruh Keramik ="+k3.hargaKeramik());
        System.out.println("--------------------------------------");
    }
    
}
