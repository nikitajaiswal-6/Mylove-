public class Exception_test {

    public static void main(String[] args) {

        System.out.println("Sameer");
        System.out.println("Nikita");
       // System.out.println(10/0); //--This will generate an ArithmeticException due to which the normal flow of the code will break or stop.
        System.out.println("line after generating exception");

        try{
           System.out.println(10/0);  
        }

        catch(ArithmeticException e){
            System.out.println("Cannot divide the num by 0");
        }
    }
}
