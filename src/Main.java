import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = input.nextLine();
        int len = str1.length();
        System.out.println("Length of string: " + str1.length());
        if (len % 2 == 1) {
            int half = (len - 1) / 2;
            System.out.println("First half:" + str1.substring(0, half));
            System.out.println("Second half: " + str1.substring(half));
        } else {
            int half = len / 2;
            System.out.println("First half: " + str1.substring(0, half));
            System.out.println("Second half: " + str1.substring(half));
        }

        System.out.println("Second string: ");
        String str2=input.nextLine();
        int len2=str2.length();
        if (len>len2) {
            System.out.println(str1 + " is longer.");
        }
        else if (len2>len) {
            System.out.println(str2 + " is longer.");
        }
        else if (len==len2) {
            System.out.println("Both strings have the same length.");
        }

        if (str1.equals(str2)) {
            System.out.println("Both strings have the exact same characters.");
        }
        else{
            if (str1.compareTo(str2)>0) {
                System.out.println(str2 + " comes before " + str1 + " alphabetically.");
            }
            else if (str1.compareTo(str2)<0) {
                System.out.println(str1 + " comes before " + str2 + " alphabetically.");
            }

        }

        int found = str1.indexOf(str2);
        if (found==-1) {
            System.out.println(str2 + " is NOT found in " + str1);
        }
        else {
            System.out.println(str2 + " is found in " + str1 + " at index " + found);
        }

    }
}



