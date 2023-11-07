public class Calcolatrice {                                                    // creo la classe Clacolatrice, dove ho gli oggetti x, y e calc,
    // creo i getter e i setter
    private int x;
    private int y;
    private char calc;

    public Calcolatrice(int x, int y, char calc) {
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

    public int risolviOperazione() {                                                              // la mia "calcolatrice" che risolve l'operazione tra x e y;
        int result = 0;                                                                           // uso switch per vedere se l'operazione e' una somma, sottrazione,
        switch (calc) {                                                                           // moltiplicazione, divisione o potenza e risolvo l'operazione
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
