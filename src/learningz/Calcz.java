package learningz;

import java.util.Scanner;

public class Calcz {
    
    public void calc() {
        Scanner calcz = new Scanner(System.in);
        double fst, snd, answer;
        System.out.println("Enter First Number: ");
        fst = calcz.nextDouble();
        System.out.println("Enter Second Number: ");
        snd = calcz.nextDouble();
        answer = fst + snd;
        System.out.println(answer);
    }
}
