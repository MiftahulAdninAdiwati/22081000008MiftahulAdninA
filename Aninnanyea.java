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
        people people = new people();
        System.out.println("input height in kilogram: ");
        people.weight = sc.nextDouble ();
        System.out.println("input height in meter: ");
        people.height = sc.nextDouble ();
        people.calculateBMI () ;
        
                }            
    }
    
