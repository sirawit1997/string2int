import javafx.event.EventDispatchChain;

import java.util.ArrayList;

public class Calculator {
    String textinput ;
    ArrayList<Integer> number ;
    public Calculator(String textinput) {
        this.textinput = textinput;
    }

    public void splitInteger()
    {
        number = new ArrayList<>() ;
        for (int i=0; i <textinput.length(); i++)
        {
            if (Character.isDigit(textinput.charAt(i)))
            {
                if (textinput.charAt(i) == '0')
                {
                    number.add(0) ;
                }
                else if (textinput.charAt(i) == '1')
                {
                    number.add(1) ;
                }
                else if (textinput.charAt(i) == '2')
                {
                    number.add(2) ;
                }
                else if (textinput.charAt(i) == '3')
                {
                    number.add(3) ;
                }
                else if (textinput.charAt(i) == '4')
                {
                    number.add(4) ;
                }
                else if (textinput.charAt(i) == '5')
                {
                    number.add(5) ;
                }
                else if (textinput.charAt(i) == '6')
                {
                    number.add(6) ;
                }
                else if (textinput.charAt(i) == '7')
                {
                    number.add(7) ;
                }
                else if (textinput.charAt(i) == '8')
                {
                    number.add(8) ;
                }
                else if (textinput.charAt(i) == '9')
                {
                    number.add(9) ;
                }
            }
        }

        System.out.print("The output should be ");
        for (int i = 0; i < number.size(); i++) {
            System.out.print(number.get(i));
        }
        System.out.print(" in integer.");
    }
}
