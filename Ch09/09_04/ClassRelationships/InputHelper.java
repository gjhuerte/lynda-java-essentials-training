import java.util.Scanner;

public class InputHelper
{
    private String getInput(String label) {
        System.out.print(label);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
