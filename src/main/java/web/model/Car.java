package web.model;

import java.util.List;

public class Car {
    private String name;
    private String color;
    private int year;

    public Car(String name, String color, int year) {
        this.name = name;
        this.color = color;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
