/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author ashit
 */
public class Array2D {
    int A[][];
    int m,n;
    public Array2D(int x,int y){
        Scanner sc = new Scanner(System.in);
        this.m = x;
        this.n = y;
        this.A = new int[m][n];
        System.out.println("Enter the value");
        for(int i = 0; i<this.m;i++){
            for(int j =0;j<this.n;j++){
                A[i][j]= sc.nextInt();
            }
                
        }
    }
    public void delete(int loc1,int loc2){
        if(loc1 < 0 || loc1 >= this.A.length||loc2 < 0 || loc2 >= this.A.length){
            System.out.println("Array index out of bounds");
        }
        else{
            A[loc1][loc2]= Integer.MIN_VALUE;
        }
    }
    public void display(){
       for(int i = 0; i< this.m;i++){
            for(int j =0;j<this.n;j++){
                System.out.println(this.A[i][j]);
            }
       
   } 
    
}
   public void search(int x){
       for(int i =0; i< this.m;i++){
           for(int j =0;j<this.n;j++)
           {
               if(this.A[i][j]==x)
                   System.out.println("The element is present");
                   return;
           }
           System.out.println("The element is not present");
       }
   }

}