public class HelloWorld {

    public static void main(String[] args) {

        String message = "Hello, ";

        if (args.length > 0) {
            for (String name : args) {
                message += name + " ";
            }
            message = message.trim() + "!";
        } else {
            message += "World!";
        }

        System.out.println(message);
    }

}