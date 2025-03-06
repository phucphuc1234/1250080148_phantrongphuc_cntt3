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
public class hinhvuong extends hinhchunhat{
    public hinhvuong(){
    ten="hinh vuong";
    }
    public void nhapcanh(){
      Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh:");
        dai=rong=scanner.nextFloat();
    }
}
