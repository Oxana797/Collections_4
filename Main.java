package com.example.mydemo.task4;

import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    System.out.println("Task 4");
    Set<String> set = new HashSet<>();
    set.add("1");
    set.add("2");
    set.add("3");
    // We use the already existing value here - it will be ignored.
    set.add("2");
    // We use the already existing value here - it will be ignored.
    set.add("1");
    for(String value : set) {
      System.out.println(value);
    }
  }
}
