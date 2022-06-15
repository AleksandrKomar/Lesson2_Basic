package hometasks.task2;

public class Car {
    private int year;
    private String color = "undefined";

    public Car() {
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "year = " + year + ", color = " + color;
    }
}
