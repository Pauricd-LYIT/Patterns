package com.csd.observer.PriceAlert;

public class PriceAlertObserver implements Observer{
    private String name;
    private Subject currency;

    public PriceAlertObserver(String name){
        this.name = name;
    }

    @Override
    public void update(){
        String message = (String) currency.getUpdate(this);
        if(message == null){
            System.out.println(name + ":: No Change in currency value");
        }else
            System.out.println(name + ":: Currency update :: " + message);
    }

    @Override
    public void setCurrency(Subject currency) {
        this.currency = currency;
            }
}
