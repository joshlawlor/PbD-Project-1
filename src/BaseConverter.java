import java.util.Arrays;

public class BaseConverter {

    public static void processArguments(String arg) {
        //First I need to find the index of the colon ":"
        int colonIndex = arg.indexOf(":");
        //System.out.println("Colon Index = " + colonIndex);
        //Second I need to extract the value on the left and the radix on the right (using substring)
        String value = arg.substring(0, colonIndex);
        String radixString = arg.substring(colonIndex + 1);
        //System.out.println("Value: " + value + " Radix: " + radixString);
        //Third I need to convert the extracted value to base 10
        //Converting radix String to an integer for my base 10 conversion
        int radix = Integer.parseInt(radixString);

        int base10Value = Integer.parseInt(value, radix);
        //Lastly I need to print it out nice and neat like project example
        System.out.println(value + " base " + radix + " is "+ base10Value + " base 10");

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
