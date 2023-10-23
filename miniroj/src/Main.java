import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Miniröj");

        Gameboard game = new Gameboard();
        Player player = new Player();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Row: ");
        String row = scanner.nextLine();
        System.out.println("Column: ");
        int col = scanner.nextInt();

        startGame();
        selectCell(row, col);
    }

    private static void startGame() {
        //starting game
    }

    private static <row> void selectCell(String row, int col){
        //selecting cell
    }


}