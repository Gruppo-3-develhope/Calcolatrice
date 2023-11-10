public class Sum extends Calcolatrice {
    private double x;                                         // imposto le variabili degli operatori e del carattere
    private double y;
    private char calc;

    public Sum (double x, double y, char calc) {               // creo l'oggetto Somma, getter e setter delle variabili
        this.x = x;
        this.y = y;
        this.calc = calc;
    }
    @Override
    public double solveOperation() {                                                 // risolvo l'operazione
        double result = 0;
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
