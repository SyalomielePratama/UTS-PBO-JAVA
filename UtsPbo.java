package com.mycompany.mavenproject1;
import java.io.PrintWriter;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

class Biodata{
    String nama;
    int nim;
    String alamat;
    int umur;
    int tinggi;
}
public class UtsPbo {
    public static void main (String[] args )throws Exception{
        int [] nilai = {1,2,3,4,5};
        String [] teman = {"1. Tama", " 2. Ardi", "3. Bayu" , "4. Earl " , "5. Jovial"};
        
        // Array Record
        Biodata satu;
        satu = new Biodata();
        satu.nama="Syalomiele Pratama Agustinus Susanto";
        satu.nim=22201212;
        satu.alamat="Jl. Terusan Mergan Raya XIX/22,Malang";
        satu.tinggi=170;
        satu.umur= 20;
        
        //Print ke File Txt
        PrintWriter file = new PrintWriter("Text.txt");
        file.println("==================");
        file.println(Arrays.toString(teman));
        file.println(Arrays.toString(nilai));
        file.println("==================");
        file.print("Nama :" + satu.nama + "," + "NIM:"+ satu.nim+ ","+ "Alamat :" + satu.alamat+","+"umur:"+satu.umur+"tahun"+","+"tinggi"+satu.tinggi+"cm");
        file.close();   
        
        //Baca File txt 
        String fileName = "Text.txt";
        File myFile = new File(fileName);
        Scanner fileReader = new Scanner(myFile);
        
        while (fileReader.hasNextLine()){
            String data = fileReader.nextLine();
            System.out.println(data);
        }
    }

}
