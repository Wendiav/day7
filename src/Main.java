import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        boolean goodMood = false;

        System.out.println("hur många studerande är här idag?");
        int numberOfStudents = scanner.nextInt();

        if (numberOfStudents == 33) {
            // kommer bara köras om det inom parentesen är true
            System.out.println("alla verkar var här idag");
            if (goodMood) {
                System.out.println("alla är på toppenhumör!");
            }
        } else if (numberOfStudents > 33) {
            System.out.println("Någon i klassrummet verkar ha hamnat fel");
        }else if(numberOfStudents < 33) {
            System.out.println("Det fattas några studerande idag, nämligen: "
                    + (33 -numberOfStudents) + "stycken ");
        }else{
            System.out.println("Någon annat hände nu.");
        }

        System.out.println(" ------ Nu  är vi utanför if-satsen");

    }

}
