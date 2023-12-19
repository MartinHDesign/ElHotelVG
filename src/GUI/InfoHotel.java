package GUI;

import Rooms.FrameHandler;

import javax.swing.*;
import java.awt.*;

public class InfoHotel extends JPanel {
    private String infoText = """
            El Hotell är ett nyöppnat hotell som har rum för alla, oavsett budget!
            Adress: Lurstigen 18, stockholm
            Reception: 08-1234567
            """;
    private JTextArea info = new JTextArea(infoText);
    private JButton tillbaka = new JButton("tillbaka");
    public InfoHotel(FrameHandler frameHandler){
        setLayout(new BorderLayout());
        info.setSize(new Dimension(500,490));
        setVisible(true);
        tillbaka.addActionListener(e -> {
            frameHandler.showPage(Panels.MENU.name());
        });
        add(info, BorderLayout.CENTER);
        add(tillbaka, BorderLayout.SOUTH);
    }
}
