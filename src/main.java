import java.util.Scanner;

////////////////  Sirawit Uppakan K.moei  /////////////////
public class main {
    public static void main(String[] args) {
        System.out.print("Given input is : ");
        Scanner scan = new Scanner(System.in);
        String textinput = scan.nextLine();
        Calculator calculator = new Calculator(textinput);
        calculator.splitInteger();
    }
}
