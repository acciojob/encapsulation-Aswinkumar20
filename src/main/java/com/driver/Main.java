package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly obj = new RWOnly();
//  System.out.println(obj.name = "aswin");
//    obj.name = "aswin";
//    java: name has private access in com.driver.RWOnly

    obj.setName("aswin");
    System.out.println(obj.getName());
  }

}