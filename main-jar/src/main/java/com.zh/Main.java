package com.zh;

import com.zh.sbt.common.Common2;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("hello this is " + Common2.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
