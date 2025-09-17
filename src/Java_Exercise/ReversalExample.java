package Java_Exercise;

public class ReversalExample {

    public static void main(String[] args) {
        
        String str = "Anybody can do automation";
        //String reverse = "";
        
//        char [] charArray = str.toCharArray();
//        // Reverse using loop
//        for (int i = charArray.length - 1; i >= 0; i--) {
//            reverse = reverse + charArray[i];
//        }
//
//        System.out.println("Original String: " + str);
//        System.out.println("Reversed String: " + reverse);
        
        StringBuilder reverse = new StringBuilder(str);
        reverse.reverse();
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse);
        
        
        int num = 17092025;
        int sum = 0;
        
        for (int i = num; i > 0; i = i / 10) {
            int digit = i % 10;   // get last digit
            sum += digit;         // add to sum
        }

        System.out.println("Sum of digits: " + sum);
    }
}
