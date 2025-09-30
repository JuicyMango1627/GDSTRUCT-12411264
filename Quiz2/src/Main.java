public class Main
{
    public static void main(String[] args)
    {
        PlayerLinkedList playerLinkedList = new PlayerLinkedList();
        Player p1 = new Player(1, "Saitama", 999);
        Player p2 = new Player(2, "Saiki K.", 500);
        Player p3 = new Player(3, "Deku", 100);

        playerLinkedList.addToFront(p1);
        playerLinkedList.addToFront(p2);
        playerLinkedList.addToFront(p3);

        playerLinkedList.printList();
        System.out.println("\nSize: " + playerLinkedList.size());

        System.out.println("Removing first: " + playerLinkedList.removeFirst());
        playerLinkedList.printList();
        System.out.println("\nSize: " + playerLinkedList.size());

        System.out.println("Contains Saiki? " + playerLinkedList.contains(p2));
        System.out.println("Index of Saitama: " + playerLinkedList.indexOf(p1));
    }
}
