package com.yurii.constructor_confusion;

/**
 * Created by Yurii on 14.07.2015.
 */
public class ConstructorConfusion {
    private String s;

    public ConstructorConfusion(String s) {
        System.out.println("ConstructorConfusion(String) called");
        this.s = s;
    }

    public ConstructorConfusion(int i) {
        System.out.println("ConstructorConfusion(int) called");
        this.s = Integer.toString(i);
    }

    public String toString() {
        return s;
    }
}
