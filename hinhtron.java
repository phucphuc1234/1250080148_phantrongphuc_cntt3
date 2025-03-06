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

public class hinhtron extends hinh{
    public float bankinh;
    public hinhtron(){
        ten="hinh tron";
}
    public void nhapbankinh(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ban kinh:");
        bankinh=scanner.nextFloat();
}
    public void tinhdientich(){
        dientich=PI*bankinh*bankinh;
}
    public void tinhchuvi(){
        chuvi=2*PI*bankinh;
}
}
