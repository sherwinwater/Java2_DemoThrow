package content;

public class Worker {

    private int pay;

    public void setPay(int pay) throws NegativeNumberException {
//        if(pay < 0) throw new Exception("worker's negative pay is not allowed");
        if (pay < 0) {
            throw new NegativeNumberException();
        }

        this.pay = pay;
    }

    public int getPay() {
        return this.pay;
    }
}
