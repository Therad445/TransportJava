package com.transport;

public abstract class Transport {
    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

    public Transport(float speed, int weight, String color, byte[] coordinate) {
        System.out.println("Object created");
        setValue(speed, weight, color, coordinate);
        System.out.println(getValue());
    }

    public Transport(int weight, byte[] coordinate) {
        this.weight = weight;
        this.coordinate = coordinate;
        System.out.println(getValue());
    }

    protected void setValue(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    protected String getValue() {
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color + ". Coordinate: " + coordinate;
        String infoCoordinates = "Coordinates:\n";
        for (int i = 0; i < coordinate.length; i++) {
            infoCoordinates += coordinate[i] + "\n";
        }
        return info + infoCoordinates;
    }
}
