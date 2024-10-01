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
public class Bai9_BangCuuChuong {
    public static void main(String[] args) {
        System.out.println("Chuong trinh bang cuu chuong");
        Scanner sc = new Scanner(System.in);
        for (int i = 1;i <=9; i++) {
            System.out.println("Bang cuu chuong " + i + ":");
            for (int j = 1; j <= 10;j++){
                System.out.printf("%d x %d = %d\n", i , j , i * j);
            }
            System.out.println();
        }
    }
}

