/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author abdullahalabid
 */
public class ArrayList_Collections {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>(); // here we can implement likedlist.
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
       
        
        numbers.add(60);
        System.out.println(numbers);
        
        // To add an element to a particular index
        numbers.add(1, 100);
        System.out.println(numbers);
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(200);
        list.add(300);
        list.add(400);
        
        numbers.addAll(list);
        System.out.println(numbers);
        
        // To get an element
        System.out.println(numbers.get(4));
        
        // To delete an element by index
        numbers.remove(1);
        System.out.println(numbers);
        
        // To delete an element by value
        numbers.remove(Integer.valueOf(40));
        System.out.println(numbers);
        
        // To delete all the element
//        numbers.clear();
//        System.out.println(numbers);
        
        // To set an element with a new value
        numbers.set(3, 2000);
        System.out.println(numbers);
        
        // To know that an value is in the array
        System.out.println(numbers.contains(20));
        System.out.println(numbers.contains(5000));
        
        // To traverse the array
        
        // First way
        for(int i = 0; i < numbers.size(); i++){
            System.out.println("Array element " + numbers.get(i));
        }
        
        // second way **** Easy way to implement ******
        for(Integer element:numbers){
            System.out.println("Foreach " + element);
        }
        
        // third way
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()){
            System.out.println("Iterator " + it.next());
        }
        
    }
}
