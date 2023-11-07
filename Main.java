package gruppo;

import gruppo.Multiply;

public class Main {
    public static void main (String[] args) {

        int x = 10;
        int y = 2;
        char calc = '*';

        System.out.println("Input values: " + x + " , " + y);
        System.out.println("Operation: " + x + " " + calc + " " + y);
        System.out.println("Type of operation: " + operation(calc));

        Multiply multiply = new Multiply(x, y, calc);
        multiply.setX(10);
        multiply.setY(2);
        multiply.setCalc('*');

        int result = multiply.risolviOperazione();
        System.out.println("Result: " + result);

        if (isPari(result)) {
            System.out.println(result + " = even");
        } else {
            System.out.println(result + " = odd");
        }

    }


    public static String operation (char calc) {

        String opType;
        switch (calc) {
            case '+':
                opType = "sum";
                break;
            case '-':
                opType = "subtraction";
                break;
            case '*':
                opType = "multiplication";
                break;
            case '/':
                opType = "division";
                break;
            case '^' :
                opType = "power";
                break;
            default:
                opType = "error: invalid char";
        }
        return opType;
    }

    public static boolean isPari (int result) {                             // metodo per controllae se il risutato dell'oprerazione e' pari o dispari
        return result % 2 == 0;
    }
}