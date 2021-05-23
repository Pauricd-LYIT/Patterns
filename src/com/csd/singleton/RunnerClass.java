package com.csd.singleton;

import com.csd.singleton.Kettle;

public class RunnerClass {

    public static void main(String[] args) {

        //get an instance of Early Initialisation Singleton
        EarlyInitialisationSingleton.getInstance();
        //get an instance of Lazy Initialisation Singleton
        LazyInitialisationSingleton.getInstance();

        //Two threads creating a kettle instance
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                Kettle k = Kettle.getInstance();
                System.out.println(k);
                k.fill();
                k.boil();
                k.emptyOut();
            }});

        Thread t2 = new Thread(new Runnable() {
            public void run()
            {
                Kettle k = Kettle.getInstance();
                System.out.println(k);
                k.fill();
                k.boil();
                k.emptyOut();
            }});

        t1.start();
        t2.start();


}
}
