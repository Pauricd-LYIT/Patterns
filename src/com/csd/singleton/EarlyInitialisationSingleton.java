package com.csd.singleton;

public class EarlyInitialisationSingleton {
    private static final EarlyInitialisationSingleton INSTANCE = new EarlyInitialisationSingleton();
    public static EarlyInitialisationSingleton getInstance() {
        return INSTANCE;
    }

    private EarlyInitialisationSingleton(){
        System.out.println("Early Initialisation Singleton");
    }
}