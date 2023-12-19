package Rooms;

import java.time.LocalDate;

public class RoomFactory {

    public Room getRoom(ROOMS room){
        switch (room){
            case SUITE:
                return new PresidentialSuite();
            case DELUXE:
                return new DeluxeRoom();
            case LUXURY:
                return new LuxuryRoom();
            case ECONOMY:
                return new EconomyRoom();
            default:
                throw new IllegalArgumentException("Wrong input");
        }
    }


}
