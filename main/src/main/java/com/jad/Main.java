package com.jad;

public class Main {
    public static void main(final String[] args) {
        final Controller controller = new Controller(new View(), new Model());
        controller.start();
    }
}