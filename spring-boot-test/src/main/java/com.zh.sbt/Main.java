package com.zh.sbt;

import com.zh.sbt.common.Common;
import com.zh.sbt.common.Common2;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("1:hello this is " + Common.name);
            System.out.println("2:hello this is " + Common2.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
