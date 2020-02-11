package demothrow;

import content.Manager;
import content.NegativeNumberException;
import content.Worker;

public class Main {

    public static void main(String[] args) throws Exception {
        try {
            Manager one = new Manager();
            one.setPay(Integer.parseInt(args[0]));
            System.out.println("Manager's pay is " + one.getPay());

            Worker two = new Worker();
            two.setPay(Integer.parseInt(args[1]));
            System.out.println("worker's pay is " + two.getPay());

        } catch (NegativeNumberException e) {
            System.out.println("1-e.getMessage() is: " + e.getMessage());
            System.out.println("1-e is " + e);

        } catch (Exception e) {
            System.out.println("e.getMessage() is: " + e.getMessage());
            System.out.println("e is " + e);
        }

    }

}
