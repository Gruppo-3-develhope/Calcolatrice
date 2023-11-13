package esercizio1;/*Scrivere una funzione che controlli se un numero int è in un determinato range
Se lo è ritorna true se non lo è lancia un'eccezione*/

public class Main {
    public static void main(String[] args) throws Exception {
        int number;
        try {
            number = 5;
            System.out.println("First Number : " + number);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        if (number >= 0 && number <= 10) {
            System.out.println("Number in range");

        } else {
            throw new Exception("Error number not in range");

        }

    }
}