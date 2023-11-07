public class Power {                                       // creo la calsse Power
    private int x;                                         // imposto le variabili degli operatori e del carattere
    private int y;
    private char calc;

    public Power (int x, int y, char calc) {               // creo l'oggetto Power, getter e setter delle variabili
        this.x = x;
        this.y = y;
        this.calc = calc;
    }

    public int getX() {
        return x;
    }
    public void setX(int newX) {
        this.x = newX;
    }

    public int getY () {
        return x;
    }
    public void setY (int newY) {
        this.y = newY;
    }

    public char getCalc () {
        return calc;
    }
    public void setCalc (char newCalc) {
        this.calc = newCalc;
    }

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
