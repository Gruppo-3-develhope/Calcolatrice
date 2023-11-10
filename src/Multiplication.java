public class Multiplication {

        private double x;
        private double y;
        private char calc;

        public Multiplication(double x, double y, char calc) {
            this.x = x;
            this.y = y;
            this.calc = calc;
        }

        public int risolviOperazione() {
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
            }
            return result;
        }
    }

