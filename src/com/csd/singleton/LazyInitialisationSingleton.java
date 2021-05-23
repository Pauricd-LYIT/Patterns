package com.csd.singleton;

public class LazyInitialisationSingleton {

    private LazyInitialisationSingleton(){
        System.out.println("Lazy Initialisation Singleton");
    }

    private static LazyInitialisationSingleton INSTANCE ;

    public static LazyInitialisationSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyInitialisationSingleton();
        }
        return INSTANCE;
    }
}