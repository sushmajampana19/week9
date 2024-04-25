import java.io.*;

public class ExceptionHandling{
    public static void main(String[] args) {
        try {
             Class.forName("b.txt");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }

        try {
            int[] arr = new int[5];
            int x = arr[6];
        }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds: " + e.getMessage());
        }

        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        }

        try {
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
    }
}
