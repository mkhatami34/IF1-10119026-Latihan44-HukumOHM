/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan44.hukumohm;

/**
 *
 * @author Asus
 * NAMA         : Muhammad Khatami
 * KELAS        : IF-1
 * NIM          : 10119026
 * Deskripsi Program : program ini untuk menampilkan hukum OHM
 */
public class Baterai {
    private float kuatArus;
    private float hambatan;
    
    public Baterai(){
        System.out.println("====Hukum OHM====");
        System.out.println("Kuat Arus yang mengalir pada suatu kawat penghatnatar\n" 
                            + "akan berbanding lurus dengan beda potensial\n"
                            + "pada ujung-ujung kawat penghantar tersebut\n"
                            + "asalkan suhu kawat dijaga konstan.\n");
    }
    
    public Baterai(float kuatArus, float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }
    
    public float getKuatArus(){
        return kuatArus;
    }
    
    public float getHambatan(){
        return hambatan;
    }
    
    public float hitungTegangan(){
        return kuatArus * hambatan;
    }
    
}
