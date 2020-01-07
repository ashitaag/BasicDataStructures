/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author ashit
 */
public class DoubleLinkedListNode {
    DoubleLinkedListNode next,prev;
    int val;
    
    public DoubleLinkedListNode(int x){
        this.val = x;
        this.next = null;
        this.prev = null;
        
    }
    
}
