public class Division {                                                    // creo la classe Division

    private int x;
    private int y;
    private char calc;

    public Division(int x, int y, char calc) {
        this.x = x;
        this.y = y;
        this.calc = calc;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY () {
        return x;
    }
    public void setY (int y) {
        this.y = y;
    }

    public char getCalc () {
        return calc;
    }
    public void setCalc (char Calc) {
        this.calc = Calc; }

    public int risolviOperazione() {
        int result = 0;                                                                           // switch per controllo dell'operazione, in questo caso divisione
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
                result = x ^ y;
                break;
            default:                                                                               // se si inserisce un carattere sbagliato stampo l'errore
                System.out.println("Invaild operation.");
        }
        return result;
    }
}