package Rooms;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class LuxuryRoom implements Room{
    private String path = "src/GUI/images/luxury.jpg";
    private boolean occupied;
    private int price = 1200;
    private String description = "\nA luxury room exudes opulence, \nproviding lavish amenities and unparalleled comfort, \npromising a sophisticated and indulgent stay experience.";


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
        return path;
    }
    @Override
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }


}
