//https://beginnersbook.com/2013/04/exception-handling-examples/
public class ArrayIndexOutOfBounds {
    public static void main(String args[]) {
        try {
            int a[] = new int[10];
            //Array has only 10 elements
            a[11] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds");
            e.printStackTrace();
        }
    }
}
