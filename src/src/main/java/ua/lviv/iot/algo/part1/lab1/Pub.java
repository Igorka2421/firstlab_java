package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString(of = {"yearOfFoundation", "maxCapacity", "name", "rating","openingTime", "closingTime", "currentCapacity"})

public class Pub extends Restaurant {
    private int yearOfFoundation;
    private int maxCapacity;
    private String name;
    private int rating;
    private int openingTime;

    private int closingTime;
    private int currentCapacity;

    @Override
    public void addGuests(int guests) {

    }

    @Override
    public boolean kitchenType() {
        return false;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ",maxCapacity,rating";
    }

    @Override
    public String toCSV() {
        return String.format("%s,%s,%b", super.toCSV(), maxCapacity, rating);
    }
}


