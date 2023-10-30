/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package waktu.saat.ini;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author ASUS TUF
 */
public class WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Mencetak tanggal
        LocalDate tanggal = LocalDate.now();
        System.out.println("Tanggal: " + tanggal);

        // Mencetak waktu
        LocalTime waktu = LocalTime.now();
        System.out.println("Waktu: " + waktu);
    }
    
}
