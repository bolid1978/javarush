package com.javarush.task.task08.task0805;

import java.util.Map;
import java.util.TreeMap;

/* 
На экране — значения!
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>() ;

        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printValues(map);
    }

    public static void printValues(Map<String, String> map) {
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getValue());
        }//напишите тут ваш код
    }
}
