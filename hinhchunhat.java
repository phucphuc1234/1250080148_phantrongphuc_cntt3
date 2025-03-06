/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hinhhoc;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class hinhchunhat extends hinh{
    public float dai;
    public float rong;
    public hinhchunhat(){
        ten="hinh chu nhat";
    }
    public void nhapchieudai(){
       Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai:");
        dai = scanner.nextFloat();
    }
    public void nhapchieurong(){
     Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu rong:");
        rong = scanner.nextFloat();
    }
    public void tinhchuvi(){
      chuvi=2*(dai+rong);
    }
    public void tinhdientich(){
      dientich=dai*rong;
    }
}
