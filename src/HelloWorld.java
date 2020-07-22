public class HelloWorld {
    public static void main(String[] args) {
        String name;

        if (args.length < 1) {
            name = "World";
        } else {
            name = args[0];
        }

        System.out.println("Hello, " + name + "! Have a nice day!");
    }
}
