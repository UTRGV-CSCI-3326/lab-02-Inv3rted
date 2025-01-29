public class MixMatch{
    public static void main(String[] args){
        String word = "factorial";
        char letter = '!';
        short valShort = 1;
        int valInt = 2;
        long valLong = 6;
        float valFloat = 24.5f;
        double valDouble= 120.25;
        boolean factorial = true;
        System.out.println(word + " <- String. Stores an array of characters. Must be initialized with double quotes");
        System.out.println(letter + " <- Character. Stores a single character of ASCII value. Must be initialized with single quotes.");
        System.out.println(valShort + " <- Short. Stores an integer (whole number) value between -32,768 and 32,767. 2 bytes of data");
        System.out.println(valInt + " <- Integer. Stores a whole number value between -2^31 and 2^31-1. 4 bytes of data");
        System.out.println(valLong + " <- Long. Stores an integer value between -2^63 and 2^63-1. 8 bytes of data.");
        System.out.println(valFloat + " <- Float. Stores a decimal value between +/-3.4*10^-38 and +/-3.4*10^38. Accurate to 7 decimal places. Java syntax requires all floating point values to end with the letter 'f'");
        System.out.println(valDouble + "<- Double. Stores a decimal value between +/-1.7*10^-308 and +/-1.7*10^308. Accurate to 15 decimal places, and is the default data type when initializing decimal values to a variable.");
        System.out.println(factorial + " <- Boolean. A single bit data type that can only store true (1) or false (0)");
        System.out.println(" ");
        System.out.println("It is " + factorial + " that the " + word + " of the number 3 is " + valLong + ".");
    }
}