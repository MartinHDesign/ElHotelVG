package Rooms;

import java.nio.file.Path;
import java.time.LocalDate;

abstract interface Room  {
    String getDataRoom();
    int getPrice();
    String getPath();
    void setOccupied(boolean occupied);
}


