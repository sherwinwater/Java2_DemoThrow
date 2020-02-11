package content;

public class Manager {
    private int pay;
    /**
     *
     * @param pay is the weekly pay
     * @exception if the pay is negative.
     */
    
    public void setPay(int pay) throws Exception{
        if (pay < 0) throw new Exception("Manager's negative pay is not allowed");
        this.pay = pay;
    }
    
    public int getPay(){
        return this.pay;
    }
}
