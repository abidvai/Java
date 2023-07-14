/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_collections;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;



/**
 *
 * @author abdullahalabid
 */
public class PriorityQueue {
    public static void main(String[] args){
        
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        System.out.println(pq);
        
        System.out.println(pq.poll());
        System.out.println(pq);
        
        System.out.println(pq.peek());
        
    }
}
