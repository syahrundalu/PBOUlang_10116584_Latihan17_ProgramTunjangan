/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programtunjangan;

import java.util.Scanner;

/**
 *
 * @author
 * NIM  : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        int gajiPokok; 
        int tunjangan; 
        int totalGaji;
        String Status;
        
        Scanner scan = new Scanner(System.in);   
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("================PROGRAM TUNJANGAN================");
        //Input
        System.out.print("Berapa Gaji Pokok anda Perbulan : Rp.");
        gajiPokok = scan.nextInt();
        System.out.print("Status Anda (Menikah/Belum)      : ");
        Status = keyboard.nextLine();
        //Proses
        if (Status.equals("Menikah")){
        tunjangan = gajiPokok * 35/100;
        }
        else {
                tunjangan = 0;
                } 
    
        totalGaji = gajiPokok + tunjangan;
        // Output
        System.out.println("");
        System.out.println("==========HASIL PERHITUNGAN GAJI ANDA=========");
        System.out.println("GAJI POKOK      : Rp." + gajiPokok+".0");
        System.out.println("TUNJANGAN       : Rp." + tunjangan+".0");
        System.out.println("TOTAL GAJI      : Rp." + totalGaji+".");
        System.out.println("(Developed by Muhammad Syahrun Dalu)");
                    
        
        
    }
    
}
