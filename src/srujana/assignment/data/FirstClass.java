package srujana.assignment.data;

public class FirstClass {
    private int var_int;    //Members variables are initialized by default in java
    private char var_char;
    public void printMemberVars(){
        System.out.println("int variable value: "+ var_int);
        System.out.println("char variable value: "+var_char);
    }
    public void printLocalVars(){
        int local_int;     //Local variables are not initialized by default in java
        char local_char;   //Hence they must be initialized. Otherwise it will lead to compilation error
        System.out.println("int variable value: "+ local_int);
        System.out.println("char variable value: "+local_char);
    }
}
