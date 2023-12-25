package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {
        Queue<Person> market = new LinkedList<>();
        market.add(new Person("James", 28));
        market.add(new Person("Paul", 29));
        market.add(new Person("Collins", 28));
        market.add(new Person("Victor", 20));
        market.add(new Person("David", 24));
        market.add(new Person("Samuel", 19));
        System.out.println(market.size());
        System.out.println(market.poll());
        System.out.println(market.poll());
        System.out.println(market.peek());
        System.out.println(market.size());

    }
    static record Person(String Name, int age){};
}
