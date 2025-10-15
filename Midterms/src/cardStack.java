import java.util.LinkedList;

public class cardStack
{
    private LinkedList<Card> stack;

    public cardStack()
    {
        stack = new LinkedList<>();
    }

    public void push(Card card)
    {
        stack.push(card);
    }

    public Card pop()
    {
        if (!stack.isEmpty())
        {
            return stack.pop();
        }
        return null;
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public int size()
    {
        return stack.size();
    }

    @Override
    public String toString()
    {
        if (stack.isEmpty())
        {
            return "[Empty]";
        }

        StringBuilder sb = new StringBuilder();
        for (Card c : stack)
        {
            sb.append(c).append(", ");
        }
        sb.setLength(sb.length() - 2);
        return sb.toString();
    }
}
