public class Main
{
    public static void main(String[] args)
    {
        Player pikachu = new Player(25, "Pikachu", 25);
        Player celebi = new Player(251, "Celebi", 251);
        Player hitmonchan = new Player(107, "Hitmonchan", 107);
        Player mankey = new Player(56, "Mankey", 56);
        Player starmie = new Player(121, "Starmie", 121);
        Player togepi = new Player(56, "Togepi", 56);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(pikachu.getUserName(), pikachu);
        hashtable.put(celebi.getUserName(), celebi);
        hashtable.put(hitmonchan.getUserName(), hitmonchan);
        hashtable.put(mankey.getUserName(), mankey);
        hashtable.put(starmie.getUserName(), starmie);
        hashtable.put(togepi.getUserName(), togepi);

        System.out.println("\nInitial Table\n");

        hashtable.printHashtable();


        System.out.println("\nElement at key " + celebi.getUserName() + " = " + hashtable.get(celebi.getUserName()));

        System.out.println("\nRemoving Hitmonchan");
        Player removedPlayer = hashtable.remove("Hitmonchan");
        if (removedPlayer != null)
        {
            System.out.println("Removed: " + removedPlayer);

        }

        System.out.println("\nPost Removal");
        hashtable.printHashtable();

        //try to get the removed player
        System.out.println("\nGet removed player (Hitmonchan): " + hashtable.get("Hitmonchan"));
    }
}