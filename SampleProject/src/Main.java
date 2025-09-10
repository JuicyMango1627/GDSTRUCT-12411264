public class Main {
    public static void main(String[] args)
    {
        System.out.print("Enter your Name: ");
        Scaner reader = new Scanner(System.in);
        String name = reader.next();
        System.out.print("Hello World" + name + "!");
    }
}
