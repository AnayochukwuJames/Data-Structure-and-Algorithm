package org.example;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[]args){
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("black");
        colors.add("Orange");
        colors.add("pink");
        System.out.println(colors);

        System.out.println(colors.contains("blue"));
        System.out.println(colors.contains("Orange"));
        System.out.println(colors.size());

        for (String color : colors){
            System.out.println(color);
        }
        for (int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }

    }
}
