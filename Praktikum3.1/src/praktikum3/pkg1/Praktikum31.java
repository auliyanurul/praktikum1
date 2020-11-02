/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3.pkg1;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Praktikum31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hai...nama saya Mr.Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 0s/d100. Silahkan ditebak ya");
        Scanner isi=new Scanner(System.in);
        int random= (int)(Math.random()*101);
        int tebak;
        do{
            System.out.println("Masukan Angka");
            tebak=isi.nextInt();
            if (tebak<random){
                System.out.println("Bilangan Tebakan Anda Telalu Kecil");
            }else if(tebak>random){
                System.out.println("Bilangan Tebakan Anda Telalu Besar");
            }else {
                System.out.println("Ye....Bilangan Tebakan Anda BENAR");
            }   
        }while(tebak != random);
       
    }   
}
