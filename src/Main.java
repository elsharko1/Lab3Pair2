import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*int userNum;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer:");
        userNum = scan.nextInt();


        System.out.println("Number      Squared     Cubed");
        System.out.println("======      =======     =====");

        for (int i = 1; i <= userNum; i++) {
            System.out.println(i + "            " + (i * i) +
                    "          " + (i * i * i));
        }
        */


        int userNum;
        String choice = "y";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer:");
        userNum = scan.nextInt();

        System.out.println("Number" + "\t" + "Squared" + "\t" + "Cubed");
        System.out.println("======" + "\t" + "=======" + "\t" + "=====");
        //System.out.println("hi");

        //put this in a do while loop

        /*do {

        }*/
        for (int i = 1; i <= userNum; i++) {
            System.out.println(i + "\t\t" + (i * i) +
                    "\t\t" + (i * i * i));
        }
        scan.nextLine();


        /*
        while (choice.equalsIgnoreCase("y")){

            //get some input from the user and do stuff
            System.out.println("Continue? (y/n)");
            choice = scan.nextLine();
        }
        System.out.println("Goodbye");
        */

        // write your code here

    }
}
