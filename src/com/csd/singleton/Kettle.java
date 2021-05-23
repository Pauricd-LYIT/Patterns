package com.csd.singleton;

public class Kettle {
    private static Kettle INSTANCE ;

    private boolean empty;
    private boolean boiled;

    private Kettle(){
        empty = false;
        boiled = false;
        System.out.println("Kettle created");
    }

    public static Kettle getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new Kettle();
        }
        return INSTANCE;
    }

    public void emptyOut(){
        if(!isEmpty() && isBoiled()){
            empty = true;
            System.out.println("com.csd.singleton.Kettle Emptied");
        }
        else System.out.println("com.csd.singleton.Kettle NOT Emptied");
    }

    public void fill(){
        if(isEmpty() ){
            empty = false;
            boiled = false;
            System.out.println("com.csd.singleton.Kettle Filled");
        }
        else System.out.println("com.csd.singleton.Kettle NOT Filled");
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            boiled = true;
            System.out.println("com.csd.singleton.Kettle boiled");
        }
        else System.out.println("com.csd.singleton.Kettle NOT boiled");
    }



    public boolean isBoiled() {
        return boiled;
    }

    public boolean isEmpty() {
        return empty;
    }


}
