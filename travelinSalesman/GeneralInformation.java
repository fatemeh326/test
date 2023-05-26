import javax.swing.*;
import java.awt.*;

public class GeneralInformation extends JPanel {

    public GeneralInformation(){

        //set the size of the panel and its background color
        setPreferredSize(new Dimension(400,140));
        setBackground(Color.WHITE);

        //create a table to display the general information
        String[] columnsNames = {"time","quest item","turn","treasures"};
        Object[][] data = {{"o","0","0","0"}};

        JTable table = new JTable(data,columnsNames);
        table.setEnabled(false);
        table.setBounds(0,0,400,140);

        //set font for table
        Font font = new Font("Verdana",Font.PLAIN,14);
        table.setFont(font);

        //set color for table
        table.setForeground(Color.BLACK);
        table.setBackground(Color.WHITE);

        JScrollPane sp = new JScrollPane(table);

        //add table to panel
        add(sp);



    }

}
