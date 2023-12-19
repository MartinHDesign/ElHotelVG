package GUI;

import Rooms.FrameHandler;

import javax.swing.*;
import java.awt.*;

public class ShowRoom extends JPanel {
    private JTextArea centerText = new JTextArea();

    private JLabel image = new JLabel();

    private JPanel buttonPanel = new JPanel();
    private JButton boka = new JButton("book");
    private JButton next = new JButton(">>");
    private JButton previous = new JButton("<<");

    private JButton cancel = new JButton("Back to Menu");
    private JPanel centerPanel = new JPanel();
    private int showRoomCounter = 0;
    private FrameHandler frameHandler;

    public ShowRoom(FrameHandler frameHandler, BookRoomPanel bookRoomPanel){
        this.frameHandler = frameHandler;
        setLayout(new BorderLayout());

        centerPanel.setLayout(new GridLayout(2,1));
        image.setHorizontalAlignment(SwingConstants.CENTER);
        centerText.setEditable(false);
        centerPanel.add(image);
        centerPanel.add(centerText);


        buttonPanel.setLayout(new GridLayout(1,3));
        buttonPanel.add(previous);
        buttonPanel.add(boka);
        buttonPanel.add(next);

        boka.addActionListener(e -> {
            bookRoomPanel.setRoomNumber(showRoomCounter);
            bookRoomPanel.setRoomInfo(frameHandler.getAvailableRoomsData(showRoomCounter));
            frameHandler.showPage(Panels.BOOKROOM.name());
        });
        cancel.addActionListener(e -> {
            frameHandler.showPage(Panels.MENU.name());});

        previous.addActionListener(e -> {
            changeRoom(-1);
            setCenterPanelData(showRoomCounter);
            frameHandler.revalidate();
            frameHandler.repaint();});

        next.addActionListener(e -> {
            changeRoom(1);
            setCenterPanelData(showRoomCounter);
            frameHandler.revalidate();
            frameHandler.repaint();
        });

        add(centerPanel,BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(cancel, BorderLayout.NORTH);
        setVisible(true);
    }
    public void setCenterPanelData(int number){
        centerText.setText(frameHandler.getAvailableRoomsData(number));
        image.setIcon(new ImageIcon(frameHandler.getAvailableRoomsImagePath(number)));
    }
    public void changeRoom(int number){
        if (showRoomCounter + number == -1){
            showRoomCounter = frameHandler.availableRoomSize()-1;
        } else if (showRoomCounter + number > frameHandler.availableRoomSize()-1) {
            showRoomCounter = 0;
        } else
            showRoomCounter += number;
    }
}
