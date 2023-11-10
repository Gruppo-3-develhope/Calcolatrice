public class Subtraction extends Calcolatrice {                                       // creo la classe Subtraction
    private double x;                                                                 // imposto le variabili degli operatori e del carattere
    private double y;
    private char calc;

    public Subtraction (double x, double y, char calc) {                              // creo l'oggetto Subtraction
        this.x = x;
        this.y = y;
        this.calc = calc;
    }

    @Override
    public double solveOperation() {                                                 // risolvo l'operazione
        int result = 0;
        switch (calc) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                if (y != 0) {
                    result = x / y;
                } else {
                    System.out.println("Impossible to divide by zero.");
                }
                break;
            case '^':
                result = Math.pow(x, y);
                break;
            default:
                System.out.println("Invaild operation.");
        }
        return result;
    }
}
