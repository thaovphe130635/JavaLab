/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctorinfor;

import java.util.Scanner;

/**
 *
 * @author Thaovphe130635 <your.name at your.org>
 */
public class ValidInput {

    Scanner sc = new Scanner(System.in);

    public int validInt() {
        boolean valid = false;
        int input = 0;
        while (!valid) {
            try {
                input = Integer.parseInt(sc.nextLine());
                valid = true;
            } catch (Exception ex) {
                System.out.println("Input must an integer. Enter again :");
            }
        }
        return input;
    }

    public String validString() {
        boolean valid = false;
        String input = "";
        while (!valid) {
            try {
                input = sc.nextLine();
                if (input.equals(null) || input.trim().length() == 0) {
                    throw new Exception("Input String must not null or contain all space.");
                }
                valid = true;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                System.out.print("Not a valid string.Enter again : ");

            }
        }
        return input;
    }

}
