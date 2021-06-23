package srujana.assignment.main;

import srujana.assignment.data.FirstClass;
import srujana.assignment.singleton.SecondClass;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FirstClass fc = new FirstClass();
        fc.printMemberVars();
        fc.printLocalVars();

        SecondClass sc = new SecondClass();
        sc.printString();
    }
}
