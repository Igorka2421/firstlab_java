package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class KitchenWriterTest {

    private KitchenWriter kitchenWriterWriter;
    private List<Restaurant> restaurants;

    @BeforeEach
    void setUp() {
        restaurants = new ArrayList<>();
        restaurants.add(new Restaurant(2016, 200, "Cloud Monet", 5, 8, 22, 111));
        restaurants.add(new Restaurant(2016, 200, "Cloud Monet", 5, 8, 22, 111));
        restaurants.add(new Restaurant(2016, 200, "Cloud Monet", 5, 8, 22, 111));
        KitchenWriter kitchenWriter = new KitchenWriter();
    }

    @Test
    void testWriteModelsToFile() {
        KitchenWriter.writeModelsToFile();
        File file = new File("restaurant.csv");
        assertFalse(file.exists());
        assertFalse(file.isFile());
    }

    @Test
    void testWriteModelsToFileWithInvalidData() {

        restaurants.clear();
        restaurants.add(new Restaurant(2016, 200, "Cloud Monet", 5, 8, 22, 111));
        restaurants.add(new Restaurant(2016, 200, "Cloud Monet", 5, 8, 22, 111));
        restaurants.add(new Restaurant(2016, 200, "Cloud Monet", 5, 8, 22, 111));
        KitchenWriter kitchenWriter = new KitchenWriter();


        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        KitchenWriter.writeModelsToFile();


        String expectedErrorMessage = "Oops... error:";
        assertFalse(outputStream.toString().contains(expectedErrorMessage));
    }
}