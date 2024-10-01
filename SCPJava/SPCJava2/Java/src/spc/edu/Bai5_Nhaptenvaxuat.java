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
public class Bai5_Nhaptenvaxuat {
    public static void main(String[] args) {
        System.out.println("CHUONG TRINH QUAN LY SINH VIEN");
        Scanner sc = new Scanner (System.in);
       System.out.print("Nhaphovaten");
       String hoten = sc.nextLine();
       
       System.out.print("Nhap nam sinh cua ban: ");
       int namsinh= sc.nextInt();
       
       System.out.println("Chao ban " + hoten);
       System.out.println("Tuoi cua ban la " + (2024-namsinh));
    }
    
    }
