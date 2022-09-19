import java.util.Scanner;

public class Choises {
    public static void main( String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vad vill du göra?");
        System.out.println("1, Gå hem");
        System.out.println("2, Stanna kvar i skolan");
        System.out.println("3, Gå räkt fram");
        int choise = scanner.nextInt();

        if(choise == 1){
            System.out.println("Dugår hem");
        } else if (choise == 2) {
            System.out.println("Snyggt, du stannar kvar i skolan");
        } else if (choise == 4) {
            System.out.println("Du skrev en 4:a och det är inte okej.");
        }
    }

}
