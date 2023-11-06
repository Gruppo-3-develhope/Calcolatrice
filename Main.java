public class Main {                                                        // creo la classe Main
public static void main (String[] args) {                                  

        int x = 10;                                                        // creo le due variabili int x e y
        int y = 2;
        char calc = '+';                                                   // scelgo un operatore matematico per l'operazione

        System.out.println("Input values: " + x + " , " + y);              // stampo in terminale le variabili e l'operazione tra di loro
        System.out.println("Operation: " + x + " " + calc + " " + y);
        System.out.println("Type of operation: " + operation(calc));

        Calcolatrice calcolatrice = new Calcolatrice(x, y, calc);          // costruttore della classe Calcolatrice
        calcolatrice.setX(10);
        calcolatrice.setY(2);
        calcolatrice.setCalc('+');

        int result = calcolatrice.risolviOperazione();                     // soluzione dell'operazione e stampo in terminale il risutato
        System.out.println("Result: " + result);

        if (isPari(result)) {
            System.out.println(result + " = even");                        // controllo se il risultato del''operazione precedente e" pari o dispari
        } else {
            System.out.println(result + " = odd");
        }

    }


    public static String operation (char calc) {                           // conrollo il tipo di operazione in base al char calc 
                                                                           // stampo la stringa del nome del tipo di operazione matematica
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

