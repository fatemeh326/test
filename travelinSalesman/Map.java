import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {

    private static final int SQUARE_SIZE = 70;
    private static final int NUM_CASTLE_HOUSES = 1;
    private static final int NUM_MARKET_HOUSES = 5;
    private static final int NUM_WALL_HOUSES = 5;
    private static final int NUM_PRECIOUS_TREASURES_HOUSES= 8;
    private static final int NUM_LOOT_HOUSES = 13;
    private static final int NUM_TRAP_HOUSES = 5;

    enum House{
        EMPTY,
        CASTLE,
        MARKET,
        WALL,
        PRECIOUS_TREASURES,
        LOOT,
        TRAP
    }
    private House[][] map = new House[10][10];


    //constructor method:
    public Map(){

        ////set the size of the map panel and its background color
        setPreferredSize(new Dimension(900,1000));
        setBackground(Color.WHITE);

        // Initialize the map with empty houses
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                map[i][j] = House.EMPTY;
            }
        }

        //add castle house
        map[4][5] = House.CASTLE;

        // Add market houses
        int numWallHouses = 0;
        while (numWallHouses < NUM_WALL_HOUSES) {
            int i = (int) (Math.random() * 10);
            int j = (int) (Math.random() * 10);
            if (map[i][j] == House.EMPTY) {
                map[i][j] =House.WALL;
                numWallHouses++;
            }
        }

        // Add precious treasures houses
        int numPreciousTreasuresHouses = 0;
        while (numPreciousTreasuresHouses < NUM_PRECIOUS_TREASURES_HOUSES) {
            int i = (int) (Math.random() * 10);
            int j = (int) (Math.random() * 10);
            if (map[i][j] == House.EMPTY) {
                map[i][j] = House.PRECIOUS_TREASURES;
                numPreciousTreasuresHouses++;
            }
        }

        // Add market houses
        int numMarketHouses = 0;
        while (numMarketHouses < NUM_MARKET_HOUSES) {
            int i = (int) (Math.random() * 10);
            int j = (int) (Math.random() * 10);
            if (map[i][j] == House.EMPTY) {
                map[i][j] = House.MARKET;
                numMarketHouses++;
            }
        }

        // Add loot houses
        int numLootHouses = 0;
        while (numLootHouses < NUM_LOOT_HOUSES) {
            int i = (int) (Math.random() * 10);
            int j = (int) (Math.random() * 10);
            if (map[i][j] == House.EMPTY) {
                map[i][j] = House.LOOT;
                numLootHouses++;
            }
        }

        // Add trap houses
        int numTrapHouses = 0;
        while (numTrapHouses < NUM_TRAP_HOUSES) {
            int i = (int) (Math.random() * 10);
            int j = (int) (Math.random() * 10);
            if (map[i][j] == House.EMPTY) {
                map[i][j] = House.TRAP;
                numTrapHouses++;
            }
        }

    }



    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        setBackground(Color.white);

        //drawing a 10*10 matrix
        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                g2.setColor(Color.black);
                g2.drawRect(j * SQUARE_SIZE + 150, i * SQUARE_SIZE + 50, SQUARE_SIZE, SQUARE_SIZE);
            }
        }

        //drawing start place
        g2.drawOval(50,890,150,50);

        //drawing castle
        Image img1 = Toolkit.getDefaultToolkit().getImage("castle2.png");
        g2.drawImage(img1, 501, 334, this);

        //drawing salesman
        Image img2 = Toolkit.getDefaultToolkit().getImage("salesman.png");
        g2.drawImage(img2, 30, 750, this);

        //draw markets
        Image img3 = Toolkit.getDefaultToolkit().getImage("market.png");
        for(int i = 0 ;i < 10 ;i++ ){
            for(int j = 0; j<10;j++){
                if(map[i][j]==House.MARKET){
                    g2.drawImage(img3, j * SQUARE_SIZE + 150,i * SQUARE_SIZE + 50 , this);
                }
            }
        }


        //draw walls
        Image img4 = Toolkit.getDefaultToolkit().getImage("wall.png");
        for(int i = 0 ;i < 10 ;i++ ) {
            for (int j = 0; j < 10; j++) {
                if (map[i][j] == House.WALL) {
                    g2.drawImage(img4, j * SQUARE_SIZE + 150, i * SQUARE_SIZE + 50, this);
                }
            }
        }

    }

}
