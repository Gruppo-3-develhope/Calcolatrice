public class Main {
    public static void main (String[] args) {

        int x = 10;
        int y = 2;
        char calc = '+';

        System.out.println("Input values: " + x + " , " + y);
        System.out.println("Operation: " + x + " " + calc + " " + y);
        System.out.println("Type of operation: " + operation(calc));

        Calcolatrice calcolatrice = new Calcolatrice(x, y, calc);
        calcolatrice.setX(10);
        calcolatrice.setY(2);
        calcolatrice.setCalc('+');

        int result = calcolatrice.risolviOperazione();
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

    public static boolean isPari (int result) {
        return result % 2 == 0;
    }

}
