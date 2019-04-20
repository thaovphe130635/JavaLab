/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctorinfor;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Thaovphe130635 <your.name at your.org>
 */
public class DoctorInfor {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static ValidInput validInput = new ValidInput();

    public static void main(String[] args) {
        int choice = 0;
        List<Doctor> list = new ArrayList<>();
        boolean conti = true;
        while (conti) {
            menu();
            choice = validInput.validInt();
            switch (choice) {
                // add doctor to list
                case 1: {
                    addDoctor(list);
                    break;
                }
            }

        }
    }

    public static void menu() {
        System.out.println("===Doctor Managment===");
        System.out.println("1.Add Doctor");
        System.out.println("2.Update Doctor");
        System.out.println("3.Delete Doctor");
        System.out.println("4.Search Doctor");
        System.out.println("5.exit");
    }

    public static boolean checkDup(List<Doctor> list, String code) {
        boolean dup = true;
        boolean conti = true;
        while (conti) {
            if (list.size() == 0) {
                dup = false;
                conti = false;
            } else {
                for(int i = 0;i < list.size(); i++){
                    if(list.get(i).getCode().equals(code)){
                        System.out.println("Dup!");
                        dup = true;
                        conti = true;
                    }
                }
            }
        }
        return dup;
    }

    public static void addDoctor(List<Doctor> list) {
        System.out.println("=Add doctor=");
        Doctor dr = new Doctor();
        System.out.print("Enter code :");
        boolean valid = false;
        String code;
        while(!valid){
            code = validInput.validString();
            if(!checkDup(list, code)){
                System.out.println("Valied!");
                dr.setCode(code);
                valid = true;
            }else{
                System.out.println("Not Valid");
                valid = false;
            }
        }
              
    }

}
