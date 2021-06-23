package srujana.assignment.singleton;

public class SecondClass {
    private String msg;
    public static SecondClass initialize(String str){
            //static method can access only static fields/varibales/methods
        printString(); //If you try to access non-static fields/variables/members it will throw errors
        return new SecondClass();
    }
    public void printString(){
        System.out.println(msg);
    }
}
