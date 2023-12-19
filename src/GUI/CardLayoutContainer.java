package GUI;

import Rooms.FrameHandler;

import javax.swing.*;
import java.awt.*;

public class CardLayoutContainer extends JPanel {
    public CardLayoutContainer(CardLayout layout, FrameHandler frameHandler){
        BookingsPanel bookingsPanel = new BookingsPanel(frameHandler);
        BookRoomPanel bookRoom = new BookRoomPanel(frameHandler);
        ShowRoom showRoom = new ShowRoom(frameHandler, bookRoom);
        MenuPanel menuPanel = new MenuPanel(frameHandler, showRoom, bookingsPanel);
        InfoHotel infoHotel = new InfoHotel(frameHandler);
        PaymentPanel paymentPanel = new PaymentPanel(frameHandler);

        setLayout(layout);
        add(menuPanel, Panels.MENU.name());
        add(showRoom,Panels.SHOWROOM.name());
        add(bookRoom, Panels.BOOKROOM.name());
        add(infoHotel, Panels.INFO.name());
        add(paymentPanel,Panels.PAYMENT.name());
        add(bookingsPanel, Panels.BOOKINGS.name());
    }


}
