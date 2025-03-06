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
public class hinhtru extends hinhtron {
    public float chieucao;
   public hinhtru(){
    ten="hinh tru";
   }
   public void nhapchieucao(){
    Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu cao:");
        chieucao = scanner.nextFloat();
   }
   public void tinhthetich(){
       thetich=dientich*chieucao;
}
}

