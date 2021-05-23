package com.csd.observer.PriceAlert;

public interface Observer {

    void update();

    void setCurrency(Subject priceAlertSubject);

}
