import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Gameboard game = new Gameboard();
        Player player = new Player();

        System.out.println("Vilken ruta vill du undersöka?");
        Scanner scanner = new Scanner(System.in);

        String rowCol = scanner.nextLine();

        startGame();
        selectCell(rowCol);
    }

    private static void startGame() {
        //starting game
    }

    private static <row> void selectCell(String rowCol){
        System.out.println("Du valde ruta " + rowCol);
    }


}