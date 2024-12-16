/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tryexception;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class prove {
    public static void TestExceptionReadInt(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digita un intero:");
        String line = in.next();
	int intValue = Integer.parseInt(line);
        System.out.println("Valore: " + intValue);
		in.close();
    }
    
    public static void TestExceptionReadIntWithCatch(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Digita un intero:");
	String line = in.next();
	try {
            int intValue = Integer.parseInt(line);
	    System.out.println("Valore: " + intValue);
	} catch (NumberFormatException e) {
            System.out.println(e.getMessage());
	}
	System.out.println("DOPO CATCH");
	in.close();
	}
    
        public static void TestExceptionReadIntWithFinally(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digita un intero:");
		
		try {
			int intValue = in.nextInt();
			System.out.println("Valore: " + intValue);
		} catch (InputMismatchException e) {
			System.out.println("Exception message: " + e.getMessage());
		} finally {
			System.out.println("SONO IN FINALLY!!!");
			in.close();
		}
    }
        
    public static void TestExceptionReadIntOnlyFinally(String[] args) {
        Scanner in = new Scanner(System.in);
	System.out.println("Digita un intero:");
	try {
            int intValue = in.nextInt();
            System.out.println("Valore: " + intValue);
        } finally {
            System.out.println("SONO IN FINALLY!!!");
            in.close();
	}
    }
    
    
}

