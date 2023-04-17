package ua.lviv.iot.algo.part1.lab1;

import ua.lviv.iot.algo.part1.lab1.Restaurant;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class KitchenWriter extends Restaurant {
    private static final String FILENAME = "restaurants.csv";

    public void writeToFile(List<Restaurant> restaurants) {
        try (FileWriter writer = new FileWriter(FILENAME)) {
            // записуємо заголовки у файл
            writer.write(restaurants.get(0).getHeaders() + "\n");

            // записуємо об'єкти у файл
            for (Restaurant restaurant : restaurants) {
                writer.write(restaurant.toCSV() + "\n");
            }

            System.out.println("Файл успішно записано!");
        } catch (IOException e) {
            System.err.println("Помилка запису у файл: " + e.getMessage());
        }
    }
}