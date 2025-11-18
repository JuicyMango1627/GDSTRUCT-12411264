public class Tree
{
    private Node root;

    public void insert(int value)
    {
        if (root == null)
        {
            root = new Node(value);
        } else
        {
            root.insert(value);
        }
    }

    public void inOrderTraverse()
    {
        if (root != null)
        {
            root.inOrderTraverse();
        }
    }

    public void traverseInOrderDescending()
    {
        if (root != null)
        {
            root.inOrderTraverseDescending();
        }
    }

    public Node getMin()
    {
        return (root == null) ? null : root.getMin();
    }

    public Node getMax()
    {
        return (root == null) ? null : root.getMax();
    }

    public Node get(int value)
    {
        if (root == null)
        {
            return null;
        }
        return root.get(value);
    }
}
