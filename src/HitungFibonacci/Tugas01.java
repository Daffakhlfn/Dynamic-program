/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HitungFibonacci;
import java.util.*;
/**
 *
 * @author Asus
 */
public class Tugas01 {
    public static void main(String[] args)
    {
        int uang = input();
        int[] Nominal = new int[]{5000, 2000, 1000, 500, 100};
        
        JumlahUang(uang, Nominal);
    }
    private static int input()
    {
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Jumlah Uang = Rp ");
        int uang = baca.nextInt();
        
        return uang;
    }
    private static void JumlahUang(int uang, int[] Nominal)
    {
        for(int i = 0; i < Nominal.length; i++)
        {
            int n = 0;
            while(uang >= Nominal[i])
            {
                uang = uang - Nominal[i];
                n++;
            }
            System.out.println(Nominal[i] + " Sebanyak " + n);
        }
    }
}
