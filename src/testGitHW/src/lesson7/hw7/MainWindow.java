package lesson7.hw7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    public static int LENGTH = 500;
    public static int HEIGHT = 300;
    public static int WINDOW_LENGTH = 650;
    public static int WINDOW_HEIGHT = 450;
    private Settings WindowSettings;
    MainWindow(){
        WindowSettings = new Settings(this);
        setTitle("Игра крестики-нолики");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(LENGTH,HEIGHT);
        setLocation(WINDOW_LENGTH,WINDOW_HEIGHT);
        JButton StartGame = new JButton("Новая игра");
        StartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WindowSettings.setVisible(true);
            }
        });
        JButton EndGame = new JButton("Выход");
        EndGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JPanel jPanel = new JPanel();
        add(jPanel);
        jPanel.setLayout(new GridLayout(1,2));
        jPanel.add(StartGame);
        jPanel.add(EndGame);
        add(jPanel,BorderLayout.SOUTH);

        setVisible(true);
    }
}
