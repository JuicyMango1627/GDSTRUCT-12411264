import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayQueue playerQueue = new ArrayQueue(10);
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int games = 0;
        int nextId = 1;

        while (games < 10)
        {
            System.out.print("Press 'ENTER' to continue...");
            scanner.nextLine();

            int playersToAdd = rand.nextInt(7) + 1;
            System.out.println("\nAdding " + playersToAdd + " players to the queue.");

            for (int i = 0; i < playersToAdd; i++)
            {
                int level = rand.nextInt(1000) + 1; // random level 1–1000
                Player p = new Player(nextId, "Player" + nextId, level);
                playerQueue.enqueue(p);
                nextId++;
            }

            System.out.println("\nCurrent Queue:");
            playerQueue.printQueue();
            System.out.println("Total in queue: " + playerQueue.size() + "\n");

            if (playerQueue.size() >= 5)
            {
                System.out.println("Starting Game #" + (games + 1));
                System.out.println("Players matched:");

                for (int i = 0; i < 5; i++)
                {
                    Player matchedPlayer = playerQueue.dequeue();
                    System.out.println(" - " + matchedPlayer);
                }

                games++;
                System.out.println("Game #" + games);
            } else
            {
                System.out.println("\nNot enough players to start a game yet.\n");
            }
        }

        System.out.println("\n--End Program");
        scanner.close();
    }
}