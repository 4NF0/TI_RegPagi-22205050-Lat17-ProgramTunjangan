/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan17;
import java.util.Scanner;
/**
 *
 * @author nm
 */
public class Latihan17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=======Program Tunjangan========");

        System.out.print("Berapa gaji pokok anda perbulan?:");
        double gaji = scanner.nextDouble();

        System.out.print("Status Anda? (Menikah/Belum):");
        String status = scanner.next();

        System.out.println("=========Hasil Perhitungan Gaji Anda===========");
        double tunjangan = 0;
        if (status.equalsIgnoreCase("Menikah")) {
           tunjangan = 0.35*gaji;
        } else { 
            tunjangan = 0;
        }

        double totalgaji = gaji + tunjangan;

        System.out.println("Gaji Pokok: "+gaji);
        System.out.println("Tunjangan: "+tunjangan);
        System.out.println("Total gaji: "+totalgaji);
    }
    
}
