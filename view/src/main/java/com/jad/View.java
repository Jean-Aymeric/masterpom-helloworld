package com.jad;

public class View implements IView {
    @Override
    public void display(final String message) {
        System.out.println(message);
    }
}
