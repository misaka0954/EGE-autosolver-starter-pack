import java.math.BigInteger;
import java.util.Scanner;

public class zadanie_14 {
    public static void main(String[] args) {
        Action a = Action.plus;
        Scanner console = new Scanner(System.in);
        BigInteger memed = new BigInteger(console.nextLine(), Integer.parseInt(console.nextLine()));
        String input = console.nextLine();
        switch (input) {
            case "-" -> a = Action.minus;
            case "*" -> a = Action.umn;
            case "/" -> a = Action.del;
        }

        System.out.println(input);
        BigInteger cringed = new BigInteger(console.nextLine(), Integer.parseInt(console.nextLine()));
        int answer = 0;
        if (a == Action.plus) {
            answer = memed.intValue() + cringed.intValue();
        }
        if (a == Action.minus) {
            answer = memed.intValue() - cringed.intValue();
        }
        if (a == Action.umn) {
            answer = memed.intValue() * cringed.intValue();
        }
        if (a == Action.del) {
            answer = memed.intValue() / cringed.intValue();
        }
        input = console.nextLine();
        a = switch (input) {
            case "+" -> Action.plus;
            case "-" -> Action.minus;
            case "*" -> Action.umn;
            case "/" -> Action.del;
            default -> a;
        };
        BigInteger trolled = new BigInteger(console.nextLine(), Integer.parseInt(console.nextLine()));
        if (a == Action.plus) {
            answer += trolled.intValue();
        }
        if (a == Action.minus) {
            answer -= trolled.intValue();
        }
        if (a == Action.umn) {
            answer *= trolled.intValue();
        }
        if (a == Action.del) {
            answer /= trolled.intValue();
        }
        System.out.println(answer);
    }

    public enum Action {
        plus,
        minus,
        umn,
        del
    }
}