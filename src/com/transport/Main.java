package com.transport;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car(260.5f, 2500, "Black", new byte[] {0, 0, 0});
        Truck truck = new Truck(190.0f, 5600, "Red", new byte[] {100, 0, 100}, true);
        Car daewoo = new Car(5600, new byte[] {100, 0, 100});
        Truck lightTruck = new Truck(5600, new byte[] {100, 0, 100});
    }
}
