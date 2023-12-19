package Rooms;

import java.nio.file.Path;
import java.nio.file.Paths;

public class DeluxeRoom implements Room {
    private String path = "src/GUI/images/deluxe.jpg";
    private boolean occupied;
    private int price = 799;
    private String description = "\nA deluxe room epitomizes luxury, offering spaciousness, \npremium amenities, and refined comfort for an \nindulgent and opulent stay experience.";
    @Override
    public String getDataRoom() {
        return "For only " + price+"/Night "+description;
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
