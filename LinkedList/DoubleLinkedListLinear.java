/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;
import LinkedList.DoubleLinkedListNode;

/**
 *
 * @author ashit
 */
public class DoubleLinkedListLinear {
    DoubleLinkedListNode head,tail;
    int lennode;
    
    public DoubleLinkedListLinear(){
        this.head = null;
        this.tail = null;
        this.lennode = 0;
    
    }
    
    public void add(int x){
        DoubleLinkedListNode temp = new DoubleLinkedListNode(x);
        if(this.head == null){
            this.head = temp; 
            this.tail = temp;
        }
        else{
            temp.prev = this.tail;
            this.tail.next = temp;
            this.tail = temp;    
        } 
        this.lennode++;
    }
    
    public void delete(int x){
        if(this.head== null){
            System.out.println("List is empty");
        }
        else{
           DoubleLinkedListNode temp = this.head;
           while(temp!= null){
               if(temp.val==x){
                   if(temp.next==null){
                       this.tail = temp.prev;
                       temp = null;
                       this.tail.next = null;
                       System.out.println(x + "Deleted successfully");
                       this.lennode--;
                       break;
                   }
                   else{
                     temp.prev.next = temp.next;
                     temp.next.prev = temp.prev;
                     temp = null;
                     System.out.println(x + "Deleted successfully");
                     this.lennode--;
                     break;
                   }
               }
               else
                   temp = temp.next;
               
           }
            
        }
    }
    
    public void traverse(){
            System.out.println("Traversing the list");
            if(this.head==null){
            System.out.println("Linked List is empty");
            }
        else{
            DoubleLinkedListNode temp = this.head;
            while(temp!= null){
                System.out.print(temp.val + "\t" );
                temp = temp.next;
            } 
                System.out.println();
        }    
        
    }
  
    public void show(){
        System.out.println("head\t" + this.head.val +"\ttail\t" + this.tail.val);
    }
   public void insert(int x, int loc){
       if(loc<0 || loc> this.lennode){
           System.out.println("Out of index");      
       }
       if(loc==1){
          DoubleLinkedListNode temp2 = new DoubleLinkedListNode(x);
          head.prev = temp2;
          temp2.next = head;
          head = temp2;
          
       }
       else if(loc== this.lennode+1){
           add(x);
   }
       else{
           DoubleLinkedListNode  temp = head;
           DoubleLinkedListNode temp2 = new DoubleLinkedListNode(x);
           int count = 1;
           while(count<loc-1){
               temp = temp.next;
               count++;
           }
           temp2.next = temp.next;
           temp2.prev = temp;
           temp.next = temp2;
       }  
   }
   
   public boolean search(int x){
       DoubleLinkedListNode temp = head;
       if(temp == null){
           System.out.println("List is empty");
       }
       else{
            while(temp!=null){
               if(temp.val==x)
                   return(true);
                temp= temp.next;
            return(false);    
           }
           
       }
      return(false); 
   }
}
