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
class SinhVien {

    private String ten;
    private double diem;

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    public double getDiem() {
        return diem;
    }
}

public class Bai22_SapxepObject {

    public static void main(String[] args) {
        String ten;
        double diem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n = Integer.parseInt(sc.nextLine());

        SinhVien sv[] = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            sv[i] = new SinhVien();
            System.out.println("Nhap ten sinh vien");
            ten = sc.nextLine();
            sv[i].setTen(ten);
            System.out.println("Nhap diem: ");
            diem = sc.nextDouble();
            sv[i].setDiem(diem);
            
        }
        
    }
}
