/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hinhhoc;

/**
 *
 * @author admin
 */
public class main {
    public static void main(String[] args) {
        hinhtron ht=new hinhtron();
        ht.nhapbankinh();
        ht.tinhdientich();
        ht.tinhchuvi();
        hinhchunhat cn=new hinhchunhat();
        cn.nhapchieudai();
        cn.nhapchieurong();
        cn.tinhchuvi();
        cn.tinhdientich();
        hinhtru htru=new hinhtru();
        htru.nhapchieucao();
        htru.tinhthetich();
        hinhvuong hv =new hinhvuong();
        hv.nhapcanh();
    }
}
