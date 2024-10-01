/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai21_String01 {
    public static void main(String[] args) {
        System.out.println("BAI TAP VE STRING");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ho va Ten:");
        String hovaten = sc.nextLine();
        
        System.out.println("HO: " + hovaten.substring(0, 4));
        System.out.println("Chu lot: " + hovaten.substring(5, 14));
        System.out.println("Ten: " + hovaten.substring(15));
        System.out.println("HO VA TEN: " + hovaten);
        System.out.println("Chu thach: " + hovaten.substring(5,10));
        System.out.println("Chu nam: " + hovaten.substring(11, 18));
        System.out.println("Do Dai: " + hovaten.length());
        
   }
}
