package com.git;

import org.junit.Test;

public class GitTest {
    public static void main(String[] args) {
        System.out.println("创建gitProject");
    }
    @Test
    public void  gitTest(){
        int count = 0;
        int a = 5000;
        for (int i = 2; i < a; i++) {
            count++;
            if(a%i==0){
                System.out.println(count);
                System.out.println(i);
            }
        }
    }
}
