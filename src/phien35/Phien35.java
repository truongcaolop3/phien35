/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phien35;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Phien35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double time,mets,kph, mph;
        Scanner sc = new Scanner(System.in); 

            System.out.print("Nhap Met: ");
            float met = sc.nextFloat();

            System.out.print("Nhap Gio: ");
            float gio = sc.nextFloat();

            System.out.print("Nhap Phut: ");
            float phut = sc.nextFloat();

            System.out.print("Nhap Giay: ");
            float giay = sc.nextFloat();

            time = (gio*3600) + (phut*60) + giay;
            mets = met / time;
            kph = ( met/1000.0f ) / ( time/3600.0f );
            mph = kph / 1.609f;

            System.out.println("Your speed in meters/second is "+mets);
            System.out.println("Your speed in km/h is "+kph);
            System.out.println("Your speed in miles/h is "+mph);
            sc.close();
    }
    
}
