public class Main {                                                                // creo la classe Main
    public static void main (String[] args) {

        int x = 10;                                                            // imposto due numeri int come operandi
        int y = 2;
        char calc = '+';                                                       // scelgo un carattere del simbolo dell'operazione (in questo caso somma)

        System.out.println("Input values: " + x + " , " + y);                  // stampo i valori di input
        System.out.println("Operation: " + x + " " + calc + " " + y);
        System.out.println("Type of operation: " + operation(calc));

        Sum sum = new Sum(x, y, calc);                                         // costruttore classe somma
        sum.setX(10);
        sum.setY(2);
        sum.setCalc('+');

        int result = sum.solveOperation();                                     // soluzione e stampo il risultato in terminale
        System.out.println("Result: " + result);

        if (isEven(result)) {                                                  // controllo se il risultato e' pari o dipari e lo stampo in terminale
            System.out.println(result + " = even");
        } else {
            System.out.println(result + " = odd");
        }

    }


    public static String operation (char calc) {                                // metodo per conrollare se l'operazione e' una somma, sottrazione,
        // moltiplicazione, divisione o potenza
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

    public static boolean isEven (int result) {                                // metodo per controllare se il risultato e' pari o dispari
        return result % 2 == 0;
    }
}