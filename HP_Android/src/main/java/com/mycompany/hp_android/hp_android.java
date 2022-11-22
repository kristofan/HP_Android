package com.mycompany.hp_android;

public class hp_android {
String Merk;
String Warna;
String Jenisprocessor;
String UkuranLayar;

    public static void main(String[] args) {
        hp_android androidku= new hp_android ();
        androidku.Merk="Vivo";
        androidku.Warna="Hitam";
        androidku.Jenisprocessor="Snapdragon";
        androidku.UkuranLayar="6 inchi";
        
        System.out.println("Merk           :"+ androidku.Merk);
        System.out.println("Warna          :"+ androidku.Warna);
        System.out.println("Jenis Processor:"+ androidku.Jenisprocessor);
        System.out.println("Ukuran Layar   :"+ androidku.UkuranLayar);

    }
    
}
