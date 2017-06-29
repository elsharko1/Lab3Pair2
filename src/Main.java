import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int userNum;
        String choice = "y";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer:");
        userNum = scan.nextInt();

        System.out.println("Number" + "\t" + "Squared" + "\t" + "Cubed");
        System.out.println("======" + "\t" + "=======" + "\t" + "=====");

       /*do {
        the square code stuff

        }
        while (continue answer is yes);
        or we
        sout goodbye


    */


        //do {
        for (int i = 1; i <= userNum; i++) {
            System.out.println(i + "\t\t" + (i * i) +
                    "\t\t" + (i * i * i));
        }

        //}

       /*while (choice.equalsIgnoreCase("y"));

            //get some input from the user and do stuff
            System.out.println("Continue? (y/n)");
        scan.nextLine();
            choice = scan.nextLine();

        System.out.println("Goodbye");
        */


    }
}