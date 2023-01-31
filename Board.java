import java.util.ArrayList;

public class Board {
    private static int dimension = 7;
    private static int[][] board = new int[dimension][dimension];

    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[40m";
    public static final String RED = "\u001B[41m";
    public static final String GREEN = "\u001B[42m";
    public static final String YELLOW = "\u001B[43m";
    public static final String BLUE = "\u001B[44m";
    public static final String PURPLE = "\u001B[45m";

    // Randomly populates colors across the board
    public static void randomColors() {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
               board[i][j] = (int) (Math.random() * 6);
            }
        }
    }

    // Displays Board
    public static void displayBoard() {
        String display = "";
        display += "\n";

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (board[i][j] == 0) {
                    display += (RED + "  " + RESET);
                }
                if (board[i][j] == 1) {
                    display += (BLACK + "  " + RESET);
                }
                if (board[i][j] == 2) {
                    display += (GREEN + "  " + RESET);
                }
                if (board[i][j] == 3) {
                    display += (YELLOW + "  " + RESET);
                }
                if (board[i][j] == 4) {
                    display += (BLUE + "  " + RESET);
                }
                if (board[i][j] == 5) {
                    display += (PURPLE + "  " + RESET);
                }
            }
            display += "\n";
        }
        System.out.println(display);
    }

    public static void changeColor(int color, int x, int y) {
                board[x][y] = color; 
    }
    
    /*
    public static void checkColor() {
        ArrayList<Tile> surface = new ArrayList<Tile>();
        surface.add(new Tile(0, 0));
        for (int l = 1; l < dimension; l++) { // For each shell
            for (int i = 0; i < l; i++) { //in x 
                for (int j = 0; j < l; j++) {
                    ArrayList<Tile> tempSurface = new ArrayList<Tile>();
                    for (Tile tile: surface) {
                        if ((Math.abs(tile.getX() - i) == 1 || Math.abs(tile.getY() - j) == 1)) {
                            if (board[tile.getX()][tile.getY()] == board[0][0]) {
                                tempSurface.add(new Tile(i, j));
                                
                            }
                        }
                    }
                    for (Tile tile : tempSurface) {
                        surface.add(tile);
                    }   
                }
            }
        }
    }
    */

    public static void checkColor() {
        ArrayList<Tile> p1 = new ArrayList<Tile>();


        Tile start = new Tile(0, 0, board[0][0]);
        p1.add(start);

        for (int i = 0; i < p1.size(); i++) {
            int x = p1.get(i).getX();
            int y = p1.get(i).getY();
            /*
            if (p1.get(i).getColor() == board[x][y]) {
                //System.out.println("hi");
                Tile new1 = new Tile(x, y, board[x][y]);
                p1.add(new1);
            }
            */
            System.out.println("1");
            //System.out.print(p1.get(1).getX() + " " + p1.get(1).getY());
            break;
        }
    }
}