/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3.pkg2;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Praktikum32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hai...nama saya Mr.Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 0s/d100. Silahkan ditebak ya");
        Scanner isi=new Scanner(System.in);
        int random= (int)(Math.random()*101);
        int tebak;
        int score=100;
        int jumlah=0;
        do {
            jumlah++;
            System.out.println("Masukan Angka");
            tebak=isi.nextInt();
            if (tebak<random){
                score-=2;
                System.out.println("Bilangan Tebakan Anda Telalu Kecil");
                if (score<=0){
                    System.out.println("Maaf score Anda 0");
                    break;
                }
            }else if(tebak>random){
                score-=2;
                System.out.println("Bilangan Tebakan Anda Telalu Besar");
                if (score<=0){
                    System.out.println("Maaf score Anda 0");
                    break;
                }
            }else if (tebak==random){
                if(jumlah<5){
                    score+=50;
                    int total=score-50;
                    System.out.println("Ye....Bilangan Tebakan Anda BENAR");
                    System.out.println("Score Anda:"+ total);
                    System.out.println("Bonus : "+ 50);
                    System.out.println("Total Score :"+ score);
                    System.out.println("coba"+jumlah);
                }else{
                    System.out.println("Ye....Bilangan Tebakan Anda BENAR");
                    System.out.println("Score Anda"+ score);
                    System.out.println("Cooba "+jumlah);
                }
            }
        }while(tebak != random);    
    }     
}
