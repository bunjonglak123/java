/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheit;

import java.util.Scanner;

/**
 *
 * @author bunjo
 */
public class Fahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double F = scan.nextDouble();
        double C = ((F - 32) * 5 / 9);
        if (F >= 32 && F <= 4000) {
            System.out.format("%.4f", C);
        }
        scan.close();
    }

}
