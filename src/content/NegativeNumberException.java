package content;

public class NegativeNumberException extends Exception{
    public NegativeNumberException(){
        super("Negative Numbers Not Allowed");
    }

    NegativeNumberException(String workers_negative_pay_is_not_allowed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
