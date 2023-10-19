package ba.unsa.etf.rpr.predavanje02;

import java.util.Scanner;

        public class DjeljiviSaSumomCifara {public static void main(String[] args)
        {

                Scanner unos = new Scanner(System.in);

                System.out.print("Unesite broj n: ");
                int n = unos.nextInt();

                System.out.println("Brojevi koji su djeljivi sa sumom svojih cifara između 1 i " + n + " su:");

                for (int i = 1; i <= n; i++) {
                    if (i % sumaCifara(i) == 0) {
                        System.out.print(i + " ");
                    }
                }

                unos.close();
            }
        }
            public static int sumaCifara(int broj) {
                int suma = 0;
                while (broj != 0) {
                    suma += broj % 10;
                    broj /= 10;
                }
                return suma;
            }
        }


