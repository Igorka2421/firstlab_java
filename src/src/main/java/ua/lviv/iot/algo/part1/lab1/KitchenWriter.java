package ua.lviv.iot.algo.part1.lab1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class KitchenWriter extends Restaurant {
    private static final String FILENAME = "restaurants.csv";

    public KitchenWriter() {

    }

    public static void writeModelsToFile() {
    }

    public void writeToFile(List<Restaurant> restaurants) {
        try (FileWriter writer = new FileWriter(FILENAME)) {

            writer.write(restaurants.get(0).getHeaders() + "\n");


            for (Restaurant restaurant : restaurants) {
                writer.write(restaurant.toCSV() + "\n");
            }

            System.out.println("Файл успішно записано!");
        } catch (IOException e) {
            System.err.println("Помилка запису у файл: " + e.getMessage());
        }
    }
}