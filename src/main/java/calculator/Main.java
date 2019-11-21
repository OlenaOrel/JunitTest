package calculator;

public class Main {

    public static void main(String[] args) {

        int i = 7;
        int j = 5;

        Operations operations = new Operations();

        System.out.println("Add:" + operations.add(i, j));
        System.out.println("Divide:" + operations.divide(i, j));
        System.out.println("Multiply:" + operations.multiply(i, j));
        System.out.println("Subtract:" + operations.subtract(i, j));



    }

}
