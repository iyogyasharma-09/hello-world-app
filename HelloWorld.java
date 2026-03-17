public class HelloWorld {

    public static void main(String[] args) {

        String message = "Hello, ";

        if (args.length > 0) {

            for (String name : args) {
                message += name + " ";
            }

            message = message.substring(0, message.length() - 1);
            message += "!";

        } else {
            message += "World!";
        }

        System.out.println(message);
    }

}