package ua.lviv.iot.algo.part1.lab1;
import java.util.List;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class KitchenManager {

    public void addRestaurant(Restaurant restaurant) {

    }

    public List<Restaurant> findRestaurantsOpenedAfter2005(List<Restaurant> restaurantList) {
        List<Restaurant> result = new ArrayList<>();
        for (Restaurant restaurant : restaurantList) {
            if (restaurant.getYearOfFoundation() > 2005) {
                result.add(restaurant);
            }
        }
        return result;
    }

    public List<Restaurant> findRestaurantRatingHigherThan3(List<Restaurant> restaurantList) {
        List<Restaurant> result = new ArrayList<>();
        for (Restaurant restaurant : restaurantList) {
            if (restaurant.getRating() > 3) {
                result.add(restaurant);
            }
        }
        return result;
    }

    public static void main(String... args) {
        Restaurant restaurant1 = new Restaurant(2015, 200, "Cloud Monet", 5, 8, 22, 111);
        Restaurant restaurant2 = new Restaurant(2007, 170, "Victor", 3, 8, 22, 95);
        HomeKitchen kitchen1 = new HomeKitchen("Electric", "built in");
        HomeKitchen kitchen2 = new HomeKitchen("Electric", "built in");
        Pizzeria pizzeria1 = new Pizzeria(2011, 70, "Celentano", 4, 8, 22, 20);
        Pizzeria pizzeria2 = new Pizzeria(1999, 70, "Celentano", 4, 8, 22, 20);
        Pub pub1 = new Pub(2011, 70, "Celentano", 4, 8, 22, 20);
        Pub pub2 = new Pub(2011, 70, "Celentano", 4, 8, 22, 20);

        List<Restaurant> restaurantList = new ArrayList<>();
        restaurantList.add(restaurant1);
        restaurantList.add(restaurant2);

        List<Pizzeria> pizzeriasList = new ArrayList<>();
        pizzeriasList.add(pizzeria1);
        pizzeriasList.add(pizzeria2);

        List<Pub> pubList = new ArrayList<>();
        pubList.add(pub1);
        pubList.add(pub2);






        for (Restaurant restaurant : restaurantList) {
            System.out.println("Restaurant name is: " + restaurant.getName() + ", year of foundation: "
                    +  restaurant.getYearOfFoundation() +
                    "rating :" + restaurant.getRating());

        }

        for (Pizzeria pizzeria : pizzeriasList) {
            System.out.println("Pizzeria name is: " + pizzeria.getName() + ", year of foundation"
                    +  pizzeria.getYearOfFoundation() +
                    ", and rating is :" + pizzeria.getRating());

        }

        for (Pub pub: pubList) {
            System.out.println("Pub name is: " + pub.getName() + ", year of foundation"
                    +  pub.getYearOfFoundation() +
                    ", and rating is :" + pub.getRating());

        }
    }
}
