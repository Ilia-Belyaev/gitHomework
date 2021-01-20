package lesson7.hw7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings extends JFrame {
    private static final int WINDOW_LENGTH=350;
    private static final int WINDOW_HEIGHT=270;
    private MainWindow mainWindow;


    Settings(MainWindow mainWindow){
        this.mainWindow = mainWindow;
        setTitle("Настройки новой игры");
        setSize(WINDOW_LENGTH,WINDOW_HEIGHT);
        Rectangle WindowBounds =  mainWindow.getBounds();
        int x = (int)WindowBounds.getCenterX() - WINDOW_LENGTH/2;
        int y = (int)WindowBounds.getCenterY() - WINDOW_HEIGHT/2;
        setLocation(x,y);
        setResizable(false);

        JButton StartNewGame = new JButton("Начать игру");
        StartNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(StartNewGame);





    }

}
