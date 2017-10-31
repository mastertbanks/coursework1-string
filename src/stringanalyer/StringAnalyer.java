/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package stringanalyer;

import java.util.*;

/**
 *
 * @author Babatope
 */
public class StringAnalyer {

    /**
     * @param args the command line arguments
     */
    private String names;
    private int count=0;
    private int nullCount=0;
    ArrayList<String> Names=new ArrayList<String>();
    
    
    
    
    public  void Addall(String a[]){
    for(int i=0; i< a.length; i++){
    add(a[i]);
    }
    // Add all from Array to names
    
    
    }
    
    public String showname(){
    return names;
    }
    //show all names inserted
    public int numberOfSring(){
    return count;
    }
    // returns all numbers of name 
    public void add(String a){
    if(a!=null){
            this.names+= " " +a;
            count++;
    }
    else{nullCount++;}
    }
    
    
}
