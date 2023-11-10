public class Main {
    public static void main (String[] args) {

        Sum sum = new Sum(2,3,'+');
        double sumResult = sum.solveOperation();
        System.out.println("Result sum: " + sumResult);
        if (isEven(sumResult)) {                                                  // controllo se il risultato e' pari o dipari e lo stampo in terminale
            System.out.println(sumResult + " = even");
        } else {
            System.out.println(sumResult + " = odd");
        }

        Subtraction subtraction = new Subtraction(2,3,'-');
        double subResult = subtraction.solveOperation();
        System.out.println("Result subtraction: " + subResult);
        if (isEven(subResult)) {                                                  // controllo se il risultato e' pari o dipari e lo stampo in terminale
            System.out.println(subResult + " = even");
        } else {
            System.out.println(subResult + " = odd");
        }

        Multipication multipication = new Multipication(2,3,'+');
        double result = multipication.solveOperation();
        System.out.println("Result multipication: " + multiplySolution);
        if (isEven(subResult)) {                                                  // controllo se il risultato e' pari o dipari e lo stampo in terminale
            System.out.println(subResult + " = even");
        } else {
            System.out.println(subResult + " = odd");
        }

        Division division = new Division(2,3,'+');
        double result = division.solveOperation();
        System.out.println("Result division: " + divisionSolution);
        if (isEven(subResult)) {                                                  // controllo se il risultato e' pari o dipari e lo stampo in terminale
            System.out.println(subResult + " = even");
        } else {
            System.out.println(subResult + " = odd");
        }

        Power power = new Power(2, 3, '^');
        double powerResult = power.solveOperation();
        System.out.println("Result power: " + powerResult);
        if (isEven(powerResult)) {                                                  // controllo se il risultato e' pari o dipari e lo stampo in terminale
            System.out.println(powerResult + " = even");
        } else {
            System.out.println(powerResult + " = odd");
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
    public static boolean isEven (double result) {                                // metodo per controllare se il risultato e' pari o dispari
        return result % 2 == 0;
    }
}
