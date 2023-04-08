package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString(of = {"name", "capacity" , "size"})
public abstract class AbstractKitchen  {
   protected String name;

   protected int capacity;

   protected int size;

    public abstract void addGuests(int guests);

    public abstract boolean kitchenType();
}
