public class HelloWorld {
    public static void main(String[] args) {
        String name = args.length < 1 ? "Default" : args[0];
        System.out.println("Hello, " + name + "!");
    }
}
