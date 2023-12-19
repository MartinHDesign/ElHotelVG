package GUI;

import Rooms.Booking;
import Rooms.FrameHandler;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {
    private String path = "src/GUI/images/Hotel.jpg";
    private JLabel image = new JLabel(new ImageIcon(path));
    private JButton availableRooms = new JButton("See available rooms");
    private JButton myBookings = new JButton("My bookings");
    private JButton infoHotel = new JButton("About the hotel");
    public MenuPanel(FrameHandler frameHandler, ShowRoom showRoom, BookingsPanel bookingPanel){
        setVisible(true);
        setLayout(new BorderLayout());

        infoHotel.addActionListener(e -> {
            frameHandler.showPage(Panels.INFO.name());});

        availableRooms.addActionListener(e -> {
            showRoom.setCenterPanelData(0);
            frameHandler.showPage(Panels.SHOWROOM.name());
        });

        myBookings.addActionListener(e -> {
            bookingPanel.displayBookings(frameHandler.getBookingHandler().getBookings());
            bookingPanel.revalidate();
            frameHandler.showPage(Panels.BOOKINGS.name());
        });


        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(3,1));
        southPanel.setSize(new Dimension(500, 20));
        southPanel.add(availableRooms);
        southPanel.add(myBookings);
        southPanel.add(infoHotel);





        add(image, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
    }

}
