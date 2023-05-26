import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //create the map panel
        Map mapPanel = new Map();

//        //create the scoreboard panel
//        Scoreboard scoreboardPanel = new Scoreboard();

        //create data board panel
        DataBoard dataBoard = new DataBoard();
        //hgjhugu hjbjbjhb

        //create the main panel  and add the map and scoreboard panel to it
        JPanel mainPanel = new JPanel();
        mainPanel.add(mapPanel);
        mainPanel.add(dataBoard);

        //deleted the salam



        //create the frame and add the main panel to it
        JFrame frame = new JFrame("Traveling salesman");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);

        frame.setPreferredSize(new Dimension(1500,1000));
        frame.pack();
        frame.setVisible(true);



    }
}