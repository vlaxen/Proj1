package com.company;

public class Main {

    public static void main(String[] args) {
        int[] ara = new int[6];
        for (int i = 0; i < ara.length; i++) {
            ara[i] = i * 10;
        }
        for (int i = 0; i < ara.length; i++){
            System.out.println(ara[i]);
        }
    }
}
