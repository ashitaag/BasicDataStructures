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
public class LinkedListCircular {
    LinkedListNode head,tail; 
    int lennode;
    public LinkedListCircular(){
        this.head = null;
        this.tail = null;
        lennode = 0;
    }
    public void addNode(int x){
        LinkedListNode temp = new LinkedListNode(x);
        if(this.head == null){
            
            this.head = temp;
            temp.next = this.head;
            this.tail = temp;
            
            
        }
        else{
            this.tail.next = temp;
            temp.next = this.head;
            tail = temp;
            
        } 
        this.lennode++;
    }
    
    public void show(){
        System.out.println("head\t" + this.head.val +"\ttail\t" + this.tail.val);
    }
    
    public void traverse(){
        System.out.println("Traversing the list");
        if(this.head==null){
            System.out.println("List is empty");
        }
        else{
            LinkedListNode temp = this.head;
            while(temp!= this.tail){
                System.out.print(temp.val + "\t");
                temp = temp.next;                
            }
            System.out.println(temp.val);
        }
    }
    
    public void delete(int x){
        if(head == null){
            System.out.println("There is no element in the list to delete");
        }
        else if(head.val == x){
            head = head.next;
            this.lennode--;
            System.out.println("deleted successfully"+ x);
        }
        else{
            LinkedListNode temp = this.head;
            LinkedListNode prev = null;
            while(temp!=tail){
                if(temp.val== x){
                    prev.next = temp.next;
                    temp = null;
                    System.out.println("deleted successfully\t"+ x);
                    this.lennode--;
                    return;
                }
                else{
                    prev = temp;
                    temp= temp.next;
                    
                }
            }
            if(temp.val == x){
                tail= prev;
                prev.next = head;
                this.lennode--;
                System.out.println("deleted successfully"+ x);
            }
        }
    }
    
    public void insert(int x, int loc){
        if(loc<0 || loc>this.lennode){
            System.out.println("The location is out of index");
        }
        else{ 
            LinkedListNode temp = new LinkedListNode(x);
            if(loc ==1){
                
                temp.next = head;
                head = temp;
                
            }
            else if(loc == this.lennode){
                addNode(x);
            }
            else{
                int count = 1;
                LinkedListNode temp1 = head;
                while(count!=loc-1){
                    temp1 = temp1.next;
                    count++;
                }
                temp.next = temp1.next;
                temp1.next = temp;
               }
    
            }
        }
}
