
// В калькулятор добавьте возможность отменить последнюю операцию.

import java.util.Scanner;
import java.util.Stack;

public class task3 {
    public static void main(String[] args) {
        String str_command = "";
        Scanner input_n = new Scanner(System.in);
        Stack<Float> stack = new Stack<>();
         
            System.out.printf("Введите первое число: ");
            float result = 0;
            float number1 = input_n.nextFloat();
            

        while (!str_command.equals("stop")){
            stack.push(number1);
            
            System.out.printf("введите символ действия: (+,-,*,/) ");
            String action = input_n.next();

            System.out.printf("Введите второе число: ");
            float number2 = input_n.nextFloat();
           
            switch (action){
                case ("+"):
                    result = number1+number2;
                    break;
                case ("-"):
                    result = number1-number2;
                    break;
                case ("*"):
                    result = number1*number2;
                    break;
                case ("/"):
                    result = number1/number2;
                    break;
            }

            System.out.printf("%f %s %f = %f \n",number1, action, number2, result);
            number1 = result;

            System.out.println("Введите < для возврата к предыдущему результату");
            System.out.println("Введите stop для завершения работы");
            str_command = input_n.next();

            switch (str_command){
                case ("stop"):
                    break;
                case ("<"):
                    number1 = stack.pop();
                    System.out.printf("откат \n");
                    System.out.printf("Первое число: %f \n", number1 );
                    break;
                default:
                    System.out.printf("Первое число: %f \n", number1 );
                    break;
            }          
        }
        input_n.close();
    }

}
    

