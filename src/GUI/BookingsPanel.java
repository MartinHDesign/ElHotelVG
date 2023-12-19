package GUI;

import Rooms.Booking;
import Rooms.FrameHandler;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class BookingsPanel extends JPanel {
    private JButton menu = new JButton("Back to menu");
    private JButton cancelBooking = new JButton("Cancel booking");
    private JPanel bookOrders = new JPanel();
    public BookingsPanel(FrameHandler frameHandler){
        setLayout(new BorderLayout());


        bookOrders.setLayout(new GridLayout(10,1));


        JPanel buttonPanel = new JPanel();
        buttonPanel.setSize(new Dimension(500,10));

        menu.addActionListener(e -> {
            frameHandler.showPage(Panels.MENU.name());
        });

        cancelBooking.addActionListener(e -> {
            String bookingName = JOptionPane.showInputDialog(null,"Booking name:");
            int counter = 0;
            boolean remove = false;
            Component[] components = bookOrders.getComponents();
            for (Booking b : frameHandler.getBookingHandler().getBookings()){
                if (b.getBookingName().equals(bookingName)){
                    Component componentToRemove = components[counter];
                    remove = true;
                    bookOrders.remove(componentToRemove);
                    bookOrders.revalidate();
                    bookOrders.repaint();
                    break;
                }
                counter++;
            }
            if (remove)
                frameHandler.getBookingHandler().getBookings().remove(counter);
        });

        buttonPanel.add(menu);
        buttonPanel.add(cancelBooking);


        add(bookOrders, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

    }
    public void displayBookings(List<Booking> lista){
        bookOrders.removeAll();
        for ( Booking booking : lista){
            String temp = "Booking name: " + booking.getBookingName() + ".  Total price: " + booking.getTotalPrice()+ "kr";
            bookOrders.add(new JLabel(temp));
        }
        revalidate();
    }
}
