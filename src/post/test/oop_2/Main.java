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
public class Main {
    public static void main(String[] args) {
        Pohon cemara = new Pohon();
        cemara.setNama();
        cemara.setTinggi();
        System.out.println("----------------------------");
        cemara.getNama();
        cemara.getTinggi();
        System.out.println("============================");
        
        Pohon kelapa = new Pohon();
        kelapa.setNama();
        kelapa.setTinggi();
        System.out.println("----------------------------");
        kelapa.getNama();
        kelapa.getTinggi();
    }
}
