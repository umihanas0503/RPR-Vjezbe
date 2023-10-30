import org.jetbrains.annotations.NotNull;


import java.lang.System;
import java.lang.Math;



    public class App{
        public static void main(String @NotNull [] args) {
            if (args.length != 1) {
                System.out.println("Morate unijeti tačno jedan argument - broj za izračunavanje.");
                return;
            }

            double number = Double.parseDouble(args[0]);


            double sinValue = Math.sin(number);
            System.out.println("Sinus broja " + number + " je " + sinValue);

            long factorialValue = calculateFactorial((int) number);
            System.out.println("Faktorijel broja " + (int) number + " je " + factorialValue);
        }

        public static long calculateFactorial(int n) {
            if (n == 0) {
                return 1;
            }
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }




