package Rooms;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class EconomyRoom implements Room {
    private String path = "src/GUI/images/economy.jpg";
    private boolean occupied;
    private int price = 299;
    private String description = "\nThis room offers, comfort, affordability, \nessential amenities, clean space; \nperfect for value-seeking travelers looking for a simple yet cozy stay.";
    @Override
    public String getDataRoom() {
        return "Price " + price+"/Night "+ description;
    }
    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public String getPath() {
        return path;
    }
    @Override
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
