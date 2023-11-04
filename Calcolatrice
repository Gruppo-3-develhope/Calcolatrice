public class Calcolatrice {
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

    public int risolviOperazione() {
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
                result = x ^ y;
                break;
            default:
                System.out.println("Invaild operation.");
        }
        return result;
    }
}
