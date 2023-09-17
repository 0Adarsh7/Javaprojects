import java.util.Random;
import java.util.Scanner;

class Game1 {
    private int noofGuesses = 0;
    public int inputno;
    private int Rando;

    public Game1() {
        Random rand = new Random();
        int upperbound = 100;
        Rando = rand.nextInt(upperbound);
    }

    public void TakeUserinput() {
        System.out.print("Guess a number: ");
        Scanner a1 = new Scanner(System.in);
        inputno = a1.nextInt();
    }

    public void SetnoofGuesses(int Guesses) {
        this.noofGuesses = Guesses;
    }

    public int GetnoofGuesses() {
        return noofGuesses;
    }

    boolean NoofCorrectGuesses() {
        noofGuesses++;
        if (inputno == Rando) {
            System.out.printf("You guessed the number right: %d\n", Rando);
            System.out.printf("You guessed in %d attempts\n", noofGuesses);
            return true;
        } else if (inputno > Rando) {
            System.out.println("The number is smaller.");
        } else if (inputno < Rando) {
            System.out.println("The number is larger.");
        }
        return false;
    }

    // Starting main function
    public static void main(String[] args) {
        Game1 gaming = new Game1();
        boolean b = false;

        while (!b) {
            gaming.TakeUserinput();
            b = gaming.NoofCorrectGuesses();
        }

        // Close the Scanner after the game is over.
        Scanner a1 = new Scanner(System.in);
        a1.close();
    }
}
