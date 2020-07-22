public class HelloWorld {
    public static void main(String[] args) {
        String name;
        int SIZE = args.length;
        name = SIZE > 1 ? args[0] : "World";

        System.out.println("Hello, " + name + "! Have a nice day!");
    }
}
