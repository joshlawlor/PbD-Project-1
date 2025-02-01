import java.util.Arrays;

public class BaseConverter {

    public static void processArguments(String arg) {
        //First I need to find the index of the colon ":"
        int colonIndex = arg.indexOf(":");
        System.out.println("Colon Index = " + colonIndex);
        //Second I need to extract the value on the left and the radix on the right (using substring)
        //Third I need to convert the extracted value to base 10
        //Lastly I need to print it out nice and neat like project example
    }

    public static void main(String[] args) {
        System.out.println("args = " + Arrays.toString(args));
        int i = 0;
        while (i < args.length) {
            processArguments(args[i]);
            i++;
        }
    }
}
