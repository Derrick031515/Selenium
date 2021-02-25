package com.abcnull.testcase;

import org.testng.TestNG;

import java.util.ArrayList;

/**
 * @description;
 * @Author：Derrick
 * @Date：2021/2/25 10:16 上午
 */
public class RunTestCase {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        ArrayList<String> suitStr = new ArrayList<>();
        suitStr.add("src/test/resources/config/testng.xml");
        testNG.setTestSuites(suitStr);
        testNG.run();
    }
}
