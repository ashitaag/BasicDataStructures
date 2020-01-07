/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author ashit
 */
public class Array1D { 
    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    int l = arr.length;
    int i;
    
    
    public void takeInput(){
        System.out.println("enter the array values");
        for(int i=0; i<5; i++){
            this.arr[i] = sc.nextInt();
        }
        
        
    } 
    
    public boolean Insertion(int val,int loc){
        if(loc<0 && loc>(l-1)){
            System.out.println("Hi");
            return false;}
        
        else{
            if(this.arr[loc]==0){
                this.arr[loc]=val;
                return true;}
            else{
                return false;           
        }}
            
    }
   public void printArray(){
       System.out.println("Array is"+ Arrays.toString(this.arr));
   } 
   public boolean searchValue(int num){
       for(i=0;i<l;i++){
           if(arr[i]==num)
               return true;
        }
       return false;
   }
   public void delete(int loc){
       arr[loc] = Integer.MIN_VALUE;
   }
}
