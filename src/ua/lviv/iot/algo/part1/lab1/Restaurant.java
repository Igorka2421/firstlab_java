package ua.lviv.iot.algo.part1.lab1;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString(of = {"name", "rating", "maxCapacity", "currentCapacity"})

public class Restaurant {
    private String name;

    private int rating;

    private int maxCapacity;

    private int currentCapacity;

    private static Restaurant instance = new Restaurant();

    public static Restaurant getInstance() {
        return instance;
    }

    public boolean acceptReservation(int numOfGuests) {
        if (currentCapacity + numOfGuests <= maxCapacity) {
            currentCapacity += numOfGuests;
            return true;
        }
        else {
            return false;
        }
    }

    public void removeReservation(int numOfGuests) {
        currentCapacity = Math.max(currentCapacity - numOfGuests, 0);
    }

    public static void main (String[] args) {
        Restaurant[] restaurants = new Restaurant[4];

        restaurants[0] = new Restaurant();
        restaurants[1] = new Restaurant("Cloude Monet", 10, 100, 94);
        restaurants[2] = Restaurant.getInstance();
        restaurants[3] = Restaurant.getInstance();

        for(int i=0; i < restaurants.length; i++) {


            System.out.println(restaurants[i].toString());
        }
    }

}