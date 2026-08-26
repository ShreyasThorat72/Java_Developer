public class multipleCatch
{
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};
            int result = 10 / 0;
            System.out.println(arr[5]);
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error occurred.");
        }
    }
}