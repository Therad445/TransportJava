package com.transport;

public class Truck extends Transport {
    private boolean isLoaded;
    public Truck(float speed, int weight, String color, byte[] coordinate, boolean isLoaded) {
        super(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
        getLoaded();
    }
    public Truck(int weight, byte[] coordinate) {
        super(weight, coordinate);
    }

    @Override
    public void setValue(float speed, int weight, String color, byte[] coordinate) {
        super.setValue(speed, weight, color, coordinate);
        System.out.println("Override method");
    }

        public void setLoaded(boolean loaded) {isLoaded = loaded;}
    public void getLoaded() {
        if(isLoaded)
            System.out.println("The truck is loaded\n");
        else
            System.out.println("The truck isn't loaded\n");
    }

}