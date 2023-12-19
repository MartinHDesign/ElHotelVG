package Rooms;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class PresidentialSuite implements Room {
    private String path = "src/GUI/images/deluxe.jpg";
    private boolean occupied;
    private int price = 3000;
    private String description = "\nA suite represents the epitome of luxury, offering spaciousness, \ndeluxe amenities, and exclusive comforts for an extravagant stay experience.";


    @Override
    public String getDataRoom() {
        return "For only " + price+"/Night"+description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getPath() {
        return null;
    }

    @Override
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

}
