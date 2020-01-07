/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;
import LinkedList.LinkedListNode;

/**
 *
 * @author ashit
 */
public class LinkedListLinear {
    LinkedListNode head, tail;
    int lennode;
    
    public LinkedListLinear(){  
        this.head = null;
        this.tail = null;
        this.lennode = 0;
            
    }
    
    public void addNode(int val) {
        if(this.head== null){
            LinkedListNode temp = new LinkedListNode(val) ;
            this.head = temp;
            this.tail = temp; 
            
        }
        else{
            LinkedListNode temp = new LinkedListNode(val);
            this.tail.next= temp;
            this.tail = temp;
            
        }
        this.lennode++;
    }   
    public void showLinkedList(){
        System.out.println("Traversing the list");
        if(this.head==null){
            
            System.out.println("Linked List is empty");
        }
        else{
        LinkedListNode temp = this.head;
        while(temp!= null){
            System.out.print(temp.val + "\t" );
            temp = temp.next;
        } 
            System.out.println();
    }    
        
    }
   
   public void deletenode(int x){
       if(head.val==x){
           head= head.next;
           this.lennode--;
           System.out.println("Element deleted successfully");
       }
       else if(this.head==null){
           System.out.println("There is no elements to delete");
       }
       else{
          LinkedListNode temp = this.head;
          LinkedListNode prev = null;
          
          while(temp!=null){
                if(temp.val==x){
                  if(temp==this.tail){
                      System.out.println("Deleting tail");
                      prev.next = null;
                      this.lennode--;
                      this.tail = prev;
                      return;
                  }
                  else{
                    prev.next = temp.next;
                    temp = null;
                    this.lennode--;
                      System.out.println("element deleted successfully");
                    return;
                  
                }
                }
                else{
                  prev = temp;
                  temp= temp.next;
                  
              }
            
           
          }
          if(temp==null)
               System.out.println("The node to be deleted doesnot exist");
       }
  
   }
   
   public void printPointers(){
       System.out.println("Length: "+ this.lennode + "\tHead : "+this.head.val + "\t Tail: "+ this.tail.val);
   }
   
   public void insert(int X, int loc){
       LinkedListNode x = new LinkedListNode(X);
       
       if(loc == 1){
           if(head==null){
               head = x;
           }
           else{
               x.next= head;
               head = x;
               
           }
       }
       else if(loc==this.lennode){
           
           tail.next = x;
       }
       
       else{
           int count = 1;
           LinkedListNode temp = head;
           while(count!=loc-1){
               temp = temp.next;
               count++;
           }
           x.next = temp.next;
           temp.next = x;
           
       }
       System.out.printf("Element inserted at position %d",loc); 
       System.out.println("");
       
   }
  
   
   public boolean search(int x){
       LinkedListNode temp = head;
       if(this.head==null){
           return false;
       }
       else{
          
           while(temp!= null){
               if (temp.val ==x){
                   return true;
                   
               }
               else{
                   temp= temp.next;
               }
               
           }
        return false;
              
       }
       
   }
   

   public void deleteList(){
       LinkedListNode temp = head;
       while(this.head != null){
            temp = head;
            head = head.next;
            temp= null;                               
       }      
   }
   
}
