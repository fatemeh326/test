import javax.swing.*;
import java.awt.*;

public class DataBoard extends JPanel {

    public DataBoard(){

        //set the size of the panel and its background color
        setPreferredSize(new Dimension(600,1000));
        setBackground(Color.WHITE);

        //create the scoreboard panel
        Scoreboard scoreboardPanel = new Scoreboard();

        //create the general information panel
        GeneralInformation generalInformationPanel = new GeneralInformation();

        //add panels to data panel
        add(scoreboardPanel);
        add(generalInformationPanel);



    }

}