
public class Main {

    public static void printStars(int number) {
        int start = 1;
        while (number >= start) {
            System.out.print("*");
            number--;
        }
        System.out.println("");

    }

    public static void printSpaces(int number) {
        int start = 1;
        while (number >= start) {
            System.out.print(" ");
            start++;
        }
    }

    public static void printTriangle(int size) {
        int end = size;
        for (int i = 1; i <= end; i++) {
            printSpaces(size - 1);
            printStars(i);
            size--;
        }
    }

    public static void christmasTree(int height) {
        for (int i = 0; i < height; i++) {
            printSpaces(height - i - 1);
            printStars(i + i + 1);
        }

        for(int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
