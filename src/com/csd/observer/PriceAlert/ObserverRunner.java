package com.csd.observer.PriceAlert;

public class ObserverRunner {
    public static void main(String[] args) {
        //create subject
        PriceAlertSubject currecyPriceAlert = new PriceAlertSubject();

        //create observers
        Observer obj1 = new PriceAlertObserver("Obj1");
        Observer obj2 = new PriceAlertObserver("Obj2");
        Observer obj3 = new PriceAlertObserver("Obj3");

        //register observers to the currency alert subject
        currecyPriceAlert.register(obj1);
        currecyPriceAlert.register(obj2);
        currecyPriceAlert.register(obj3);

        //attach observer to subject
        obj1.setCurrency(currecyPriceAlert);
        obj2.setCurrency(currecyPriceAlert);
        obj3.setCurrency(currecyPriceAlert);

        //check if any update is available
        obj1.update();

        //now send message to subject notifying currency change
        currecyPriceAlert.postMessage("Euro(€) has increased 2% against the GBP(£)");
    }
}
