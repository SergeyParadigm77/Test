package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    String string = "Love is all you need";
    String[] wards = string.split(" ");
    for (String ward: wards) {
        System.out.println(ward);
    }
    System.out.println(Arrays.toString(wards));

    List<String> list  = List.of(string.substring(0,4), string.substring(5,7), string.substring(8, 11), string.substring(12,15), string.substring(16));
    System.out.println(list);
    }
}