import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        Scanner scanner = new Scanner(in);

        while (true) {
            out.print("""
                    We offer to choose operations with binary numbers:
                    1. Addition
                    2. Multiplication
                    3. Exit
                    """);
            out.print("Select operation type:\n" +
                    "-> ");
            String choiceType = scanner.nextLine();
            switch (choiceType) {
                case "1" -> {
                    out.print("Enter first binary operand:\n" +
                            "-> ");
                    String arg0 = scanner.nextLine();
                    out.print("Enter second binary operand:\n" +
                            "-> ");
                    String arg1 = scanner.nextLine();
                    out.println("Result: " + bins.sum(arg0, arg1));
                }
                case "2" -> {
                    out.print("Enter first binary operand:\n" +
                            "-> ");
                    String arg0 = scanner.nextLine();
                    out.print("Enter second binary operand:\n" +
                            "-> ");
                    String arg1 = scanner.nextLine();
                    out.println("Result: " + bins.mult(arg0, arg1));
                }
                case "3" -> {
                    return;
                }
            }
        }
    }
}
