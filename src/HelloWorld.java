public class HelloWorld {
    public static void main(String[] args) {

        if(args.length < 1) {
            System.out.println("Please enter your name");
            System.exit(0);
        }
        String name = args[0];
        System.out.println("Hello, " + name + "!");
    }
}
