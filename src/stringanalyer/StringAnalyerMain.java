/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringanalyer;

import java.util.Scanner;

/**
 *
 * @author Babatope
 */
public class StringAnalyerMain {
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
       // String a=scan.toString();
        StringAnalyer add= new StringAnalyer();
        add.add("Alice");
        add.add("BoB");
       System.out.println(add.numberOfSring());
        add.add("Charlie");
        //System.out.println(add.showname());
        System.out.println(add.numberOfSring());
                
    }
}
