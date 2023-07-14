/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_collections;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author abdullahalabid
 */
public class Linkedlist_Collections {
    public static void main(String[] args){
        
        Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(12);
        queue.offer(22);
        queue.offer(33);
        queue.offer(44);
        
        System.out.println("Queue: " + queue);
        
        System.out.println(queue.poll());
        
        System.out.println("Queue: " + queue);
        
        System.out.println(queue.peek());
    }
}
