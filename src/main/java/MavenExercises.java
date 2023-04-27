import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercises {
    public static void main(String[] args) {
        System.out.println("Enter something");
        Scanner scan = new Scanner(System.in);
        String string =scan.nextLine();


    }
    Scanner scan = new Scanner(System.in);
    boolean isNumeric(){
        int intValue;
        String string = scan.nextLine();
        System.out.println(String.format("Parsing string: \"%s\"", string));
        if (string == null || string.equals("")) {
            System.out.println("String cannot be parsed, it is null or empty.");
        }
        try {
            intValue = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
        return false;
    }

}
