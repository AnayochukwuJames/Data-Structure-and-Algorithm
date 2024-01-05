package org.example;
import java.util.Stack;
public class WorkingWithStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.empty());
        stack.push("James");
        stack.push("Desmond");
        stack.push("Victor");
        stack.push("Collins");
        stack.push("Queen");
        stack.push("Samuel");
        stack.push("David");
        stack.push("John");
        System.out.println(stack.empty());
        System.out.println(stack.search("Paul"));
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
