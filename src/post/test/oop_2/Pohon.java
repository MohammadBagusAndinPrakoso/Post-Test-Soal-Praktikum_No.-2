/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package post.test.oop_2;

/**
 *
 * @author MOKLET1
 */
import java.util.Scanner;
public class Pohon {
    Scanner input = new Scanner(System.in);
    
    String nama;
    double tinggi;
    
    void setNama(){
        System.out.print("Inputkan nama pohon           : ");
        nama = input.nextLine();
    }
    void setTinggi(){
        System.out.print("Inputkan tinggi (dalam meter) : ");
        tinggi = input.nextDouble();
    }
    
    void getNama(){
        System.out.println("Nama Pohon      : "+nama);
    }
    void getTinggi(){
        System.out.println("Tinggi Pohon    : "+tinggi+ " m");
    }
}
