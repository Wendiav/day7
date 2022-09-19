import java.util.Scanner;

public class Switch {
    public static void main( String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vad vill du göra?");
        System.out.println("1, Gå hem");
        System.out.println("2, Stanna kvar i skolan");
        System.out.println("3, Gå räkt fram");

        int choise = scanner.nextInt();

        switch (choise) {
            case 1:
                System.out.println("Rätt! fortsätt");
                break;
            case 2:
                System.out.println("fel väg, Game Over!");
                break;
            case 3:
                System.out.println("Du klickade på 3");
                break;
            default:
                System.out.println("");

        }


    }

}
