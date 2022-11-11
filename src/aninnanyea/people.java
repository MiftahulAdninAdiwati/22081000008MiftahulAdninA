/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aninnanyea;

/**
 *
 * @author USER
 */
public class people {
    double height, weight, hasil; 
    
    void calculateBMI (){
        hasil = weight / (height * height); 
        System.out.println("Body Mass Index Anda adalah : " + hasil);
        
    }
}
