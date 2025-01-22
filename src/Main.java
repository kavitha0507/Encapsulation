// Java program to demonstrate the Encapsulation.
public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        //setting values through setter methods
        acc.setAcc_no(12345678);
        acc.setName("Rahul Mynala");
        acc.setEmail("Rmynla@gmail.com");
        acc.setAmount(1234.56);
        // Getting values through getter method updated
        System.out.println(
                acc.getAcc_no()+"   "  + acc.getName()+"   "+acc.getEmail()+"   "+acc.getAmount());


        }

    }


