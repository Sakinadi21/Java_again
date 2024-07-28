package apnacollege;

public class except {
    public static void main(String[] args) {
        // TRY-CATCH in EXCEPTION HANDLING
        int[] marks = {97, 98, 95};
        try {
            System.out.println(marks[3]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds. Please check the index.");
        }
        System.out.println("The name is Mashu");
    }
}
