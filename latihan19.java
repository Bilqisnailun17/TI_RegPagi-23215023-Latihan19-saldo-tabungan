/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62818
 */
public class latihan19 {
   public static void main(String[] args) {
        double saldoAwal = 2875000; // Initial balance
        double bunga = 0.15; // Interest rate of 15%
        int bulan = 6; // Number of months

        for (int i = 1; i <= bulan; i++) {
            saldoAwal += saldoAwal * bunga; // Increase balance by interest rate
            System.out.printf("Saldo di bulan ke-%d Rp.%,.0f%n", i, saldoAwal);
        }
    }
} 

