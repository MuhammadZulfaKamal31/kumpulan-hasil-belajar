package com.tutorial;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import javax.naming.spi.DirStateFactory.Result;

public class main {

    public static void main(String[] args) {

        Set s = new LinkedHashSet();
        s.add("1");
        s.add(1);
        s.add(3);
        s.add(2);

        System.out.println(s);
    }
}
