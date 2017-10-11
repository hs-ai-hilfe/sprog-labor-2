import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Geben Sie eine ganze Zahl ein. Bitte :-)");
        
        int value = scanner.nextInt();
        int result = Math.signum(value);
        
        System.out.println("Das Ergebnis ist: " + result);
        
        scanner.close();
    }

}
