/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_collections;
import java.util.Stack;
/**
 *
 * @author abdullahalabid
 */
public class Stack_collections {
    public static void main(String[] args){
        Stack<String> animals = new Stack<>();
        
        // To add elements
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("cat");
        animals.push("Dog");
        animals.push("hippo");
        System.out.println("Stack : " + animals);
        
        System.out.println(animals.peek());
        
        animals.pop();
        
        System.out.println(animals.peek());
        
        System.out.println(animals);
    }
}
