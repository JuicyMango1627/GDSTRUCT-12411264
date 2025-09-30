import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static  void main(String[] args)
    {
        List<Player> playerList = new ArrayList<Player>();
        playerList.add(new Player(1, "Saitama", 999));
        playerList.add(new Player(2, "Goku", 500));
        playerList.add(new Player(3, "Deku", 100));

        for (Player player : playerList)
        {
            System.out.println(player);
        }

        System.out.println(("\nPlayer at Index 2" + playerList.get(2)));

        System.out.println("\n After removing player at Index 1");

        playerList.remove(1);

        for(Player player : playerList)
        {
            System.out.println((player));
        }

        int index = playerList.indexOf(new Player(1, "Saitama",999));
        System.out.print("\nIndex has Saitama? " + index);
    }
}