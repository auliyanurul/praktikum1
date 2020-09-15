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
public class Keramik {
    //membuat atribut
    double sisiA;
    double sisiB;
    double isi;
    double harga;
    
    //membuat methods
    double luasKeramik(){
        double luas;
        luas= (this.sisiA*this.sisiB*this.isi)/10000;
        return luas;
    }
    
    double kebutuhanKeramik(){
        double kebutuhan;
        kebutuhan= Math.ceil(100/this.luasKeramik());
        return kebutuhan;
    }
    
    double hargaSatuan(){
        double satuan;
        satuan= this.harga/this.isi;
        return satuan;
    }
    
    double hargaKeramik(){
        double total;
        total=this.harga*this.kebutuhanKeramik();
        return total;
    }
}
