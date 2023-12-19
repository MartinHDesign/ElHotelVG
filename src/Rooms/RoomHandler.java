package Rooms;

import java.util.ArrayList;
import java.util.List;

public class RoomHandler {
    private List<Room> rooms = new ArrayList<>();
    private RoomFactory roomFactory = new RoomFactory();
    public RoomHandler(){
        addNewRoom(ROOMS.ECONOMY);
        addNewRoom(ROOMS.DELUXE);
        addNewRoom(ROOMS.LUXURY);
    }

    private void addNewRoom(ROOMS room){
        rooms.add(roomFactory.getRoom(room));
    }
    public List<Room> getAvailableRooms(){
        return rooms;
    }
}
