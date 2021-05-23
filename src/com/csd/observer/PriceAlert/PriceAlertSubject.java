package com.csd.observer.PriceAlert;

import java.util.ArrayList;
import java.util.List;

public class PriceAlertSubject implements Subject{

    private List<Observer> observers;
    private String message;

    private boolean changed;
    private final Object MUTEX = new Object();

    public PriceAlertSubject(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj){
        if(obj==null) throw new NullPointerException("Null Observer");
        //We use a MUTEX to ensure that only one tread can execute this section
        // of code at a time
        synchronized (MUTEX){
            //Not ont eh list add it
            if(!observers.contains(obj)) observers.add(obj);
        }
    }

    @Override
    public void unregister(Observer obj){
        synchronized (MUTEX){
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers(){
        List<Observer> observersLocal ;
        //synchronization is used to make sure any observer registered
        // after message is received is not notified
        synchronized (MUTEX){
            if(!changed)
                return;

            this.changed = false;
        }
        for(Observer obj : observers){
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj){
        return this.message;
    }
    //method used by the currency system to notify the
    // subject of a price change
    public void postMessage(String msg){
        System.out.println("Currency price alert for " + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}
