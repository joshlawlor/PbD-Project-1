
public class BaseConverter {

    public static void processArguments(String arg) {
        //First I need to find the index of the colon ":"
        int colonIndex = arg.indexOf(":");
        //*Extra Credit* Check if ':' is missing
        if(colonIndex == -1){
            System.out.println("Error, missing a colon in the argument: " + arg);
            return;
        }
        //Second I need to extract the value on the left and the radix on the right (using substring)
        String value = arg.substring(0, colonIndex);
        String radixString = arg.substring(colonIndex + 1);
        //Third I need to convert the extracted value to base 10
        try{
            //Converting radix String to an integer for my base 10 conversion
            int radix = Integer.parseInt(radixString);

            //Checking if radix is out of javas allowed range. Per w3schools parseInt documentation radix is a number between 2-36
            if(radix < 2 || radix > 36) {
                System.out.println("Error, invalid radix (out of range): " + radix + " in argument " + arg);
                return;
            }

            int base10Value = Integer.parseInt(value, radix);

            //Lastly I need to print it out nice and neat like project example
            System.out.println(value + " base " + radix + " is "+ base10Value + " base 10");
        }catch (NumberFormatException e){
            System.out.println("Error, invalid number or radix in argument: " + arg);
        }


    }

    public static void main(String[] args) {
        for (String arg : args) {
            processArguments(arg);
        }
    }
}
