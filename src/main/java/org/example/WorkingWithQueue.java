package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {
        Queue<Person> market = new LinkedList<>();
        market.add(new Person("James", 18));
        market.add(new Person("Micheal", 12));
        market.add(new Person("Paul", 77));
        market.add(new Person("Collins", 54));
        market.add(new Person("Victor", 35));
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
