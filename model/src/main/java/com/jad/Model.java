package com.jad;

public class Model implements IModel {
    private final HelloWorld helloWorld;

    public Model() {
        this.helloWorld = new HelloWorld("Bonjour le monde !");
    }

    @Override
    public String getHelloWorld() {
        return this.helloWorld.getMessage();
    }
}
