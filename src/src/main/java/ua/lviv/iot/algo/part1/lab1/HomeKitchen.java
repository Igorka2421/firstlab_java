package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString(of = {"typeOfTile", "typeOfOven"})
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class HomeKitchen extends AbstractKitchen {
    private String typeOfTile;

    private String typeOfOven;

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
}
