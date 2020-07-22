public class HelloWorld {
    public static void main(String[] args) {
        String name;

        if(args.length < 1) {
            name = "World";
        } else {
            name = args[0];
        }

<<<<<<< HEAD
        System.out.println("Hello, " + name + "! Have a nice day! This is cherry-pick!");
=======
        System.out.println("Hello, " + name + "!");
>>>>>>> ff250fd... add default name
    }
}
