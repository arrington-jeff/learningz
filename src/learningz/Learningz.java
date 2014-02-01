package learningz;

import java.util.Scanner;

public class Learningz {

    public static void main(String[] args) {
            System.out.print("Write your name here:");
            Scanner wash = new Scanner(System.in);
            System.out.println("Your name is " + wash.nextLine());
            int goober = 2;
            double pie = 3.14;
            System.out.println(goober);
            System.out.println(pie);
            System.out.println("I am understanding Java better in 15 minuts of videos");
            System.out.println("than I have for 3 weeks of class...");
            Calcz calczThing = new Calcz();
            calczThing.calc();
    }
    
    
    
}
