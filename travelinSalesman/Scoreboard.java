import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class Scoreboard extends JPanel {

    public Scoreboard(){

        //set the size of the panel and its background color
        setPreferredSize(new Dimension(400,210));
        setBackground(Color.WHITE);

        //create a scoreTable to display the scores
        String[] columnsNames = {"player","money","power","treasures"};
        Object[][] data = {{"player 1","0","0","0"},{"player 2","0","0","0"}};

        JTable scoreTable = new JTable(data,columnsNames);
        scoreTable.setEnabled(false);
        scoreTable.setBounds(0,0,400,210);

        //set font for scoreTable
        Font font = new Font("Verdana",Font.PLAIN,14);
        scoreTable.setFont(font);

        //set color for scoreTable
        scoreTable.setForeground(Color.BLACK);
        scoreTable.setBackground(Color.WHITE);

        JScrollPane sp = new JScrollPane(scoreTable);

        //add scoreTable to panel
        add(sp);
    }
}
