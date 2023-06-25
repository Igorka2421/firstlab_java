package ua.lviv.iot.algo.part1.lab1;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString(of = {"yearOfFoundation", "maxCapacity", "name", "rating","openingTime", "closingTime", "currentCapacity"})

public class Restaurant extends AbstractKitchen {

    private int yearOfFoundation;
    private int maxCapacity;
    private String name;
    private int rating;
    private int openingTime;

    private int closingTime;
    private int currentCapacity;

    public void addRestaurant(final Restaurant restaurant) {

    }



    @Override
    public void addGuests(int guests) {
        if (guests <= capacity) {
            System.out.println(guests + " guests added to " + name);
        } else {
            System.out.println("Not enough space in " + name);
        }
    }
    @Override
    public boolean kitchenType() {
        return false;
    }

    public String getHeaders() {
        return "name,maxCapacity,rating";
    }

    public String toCSV() {
        return String.format("%s,%s,%d", name, maxCapacity, rating);
    }
}
