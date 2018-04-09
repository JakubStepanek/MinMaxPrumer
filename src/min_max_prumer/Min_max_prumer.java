package min_max_prumer;

import java.util.Scanner;

public class Min_max_prumer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "CP1250");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int soucet = 0;
        int pocet = 0;
        // nekonečná smyčka
        while (true) {
            // zvětší počítadlo vložených čísel
            pocet++;

            System.out.print("vlož: " + pocet + ". číslo: ");
            int vstup = sc.nextInt();
            // když uživatel vloží nulu, program skončí
            if (vstup == 0) {
                break;
            }
            soucet = soucet + vstup;
            // pokud vložil menší nebo větší číslo, zapamatuje si je
            if (vstup < min) {
                min = vstup;
            }
            if (vstup > max) {
                max = vstup;
            }
            System.out.println("minimum: " + min);
            System.out.println("maximum: " + max);
            System.out.println("průměr: " + ((float) soucet / pocet));

        }
    }
}
