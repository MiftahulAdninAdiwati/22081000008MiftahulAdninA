/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aninnanyea;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Aninnanyea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.println("SELAMAT DATANG");
        System.out.println("Perhitungan Body Mass Index");
        System.out.println("Masukkan berat badan & tinggi badan Anda");
        people people = new people();
        System.out.println("Masukkan Berat Badan Anda dalam Kilogram: ");
        people.weight = sc.nextDouble ();
        System.out.println("Masukkan Tinggi Badan Anda dalam Meter: ");
        people.height = sc.nextDouble ();
        people.calculateBMI () ;
        System.out.println("create by : Miftahul Adnin Adiwati");
        System.out.println("NIM : 22081000008");
        System.out.println("UNIVRSITAS MERDEKA MALANG");
        
                }            
    }
    
