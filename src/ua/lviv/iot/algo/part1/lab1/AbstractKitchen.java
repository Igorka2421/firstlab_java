package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString(of = {"name", "capacity" , "size"})

public abstract class AbstractKitchen extends KitchenManager {
   protected String name;

   protected int capacity;

   protected int size;

    public void addRestaurant(final Restaurant restaurant) {

    }

    public abstract void addGuests(int guests);

    public abstract boolean kitchenType();
}
