import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        cardStack deck = new cardStack();
        cardStack hand = new cardStack();
        cardStack discardPile = new cardStack();

        Random rand = new Random();

        String[] cardNames =
                {
                        "Light Attack",
                        "Light Attack",
                        "Light Defense",
                        "Light Defense",
                        "Charge and Cover",
                        "Charge and Cover",
                        "Focused Strikes",
                        "Focused Strikes",
                        "Focused Strikes",
                        "Ranga Workshop",
                        "Zelkova Workshop",
                        "Old Boys Workshop",
                        "Mook Workshop",
                        "Allas Workshop",
                        "Crystal Atelier",
                        "Atelier Logic",
                        "Durandal",
                        "Wheels Industries",
                        "Greater Split: Horizontal",
                        "Greater Split: Vertical",
                        "Upstanding Slash",
                        "Spear",
                        "Spear",
                        "Level Slash",
                        "Level Slash",
                        "Focus Spirit",
                        "Onrush",
                        "Boundary of Death",
                        "Endless Battle",
                        "Desperate Struggle"
                };

        for (int i = 1; i <= 30; i++)
        {
            String randomName = cardNames[rand.nextInt(cardNames.length)];
            deck.push(new Card(randomName));
        }

        Scanner scanner = new Scanner(System.in);
        int turn = 1;

        while (!deck.isEmpty())
        {
            System.out.println("=== Turn " + turn + " ===");

            int choice = rand.nextInt(3);
            int x = rand.nextInt(5) + 1;

            switch (choice)
            {
                //draw
                case 0 ->
                {
                    System.out.println("Draw " + x + " card(s).");
                    for (int i = 0; i < x; i++)
                    {
                        Card drawn = deck.pop();
                        if (drawn != null)
                        {
                            hand.push(drawn);
                        }
                        else
                        {
                            System.out.println("  Out of cards.");
                            break;
                        }
                    }
                }

                //discard
                case 1 ->
                {
                    System.out.println("Discard " + x + " card(s).");
                    for (int i = 0; i < x; i++)
                    {
                        Card discarded = hand.pop();
                        if (discarded != null)
                        {
                            discardPile.push(discarded);
                        }
                        else
                        {
                            System.out.println("  No more cards in hand to discard.");
                            break;
                        }
                    }
                }

                //retrieve
                case 2 ->
                {
                    System.out.println("Retrieve " + x + " card(s) from Discard Pile.");
                    for (int i = 0; i < x; i++)
                    {
                        Card retrieved = discardPile.pop();
                        if (retrieved != null)
                        {
                            hand.push(retrieved);
                        }
                        else
                        {
                            System.out.println("  No more cards in discard pile.");
                            break;
                        }
                    }
                }
            }

            System.out.println("\nCurrent Hand: " + hand);
            System.out.println("Cards remaining in Deck: " + deck.size());
            System.out.println("Cards in Discard Pile: " + discardPile.size());

            if (deck.isEmpty())
            {
                System.out.println("\nThe Deck has been emptied.");
                break;
            }

            System.out.print("\nPress 'Enter' to continue");
            scanner.nextLine();
            turn++;
            System.out.println();
        }

        scanner.close();
    }
}
