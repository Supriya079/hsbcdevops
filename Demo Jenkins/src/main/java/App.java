import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<Customer>();
        for(int i=0;i<100;i++)
        {
            customers.add(new Customer
                    (new Random().nextInt(10000),
                            "customer"+i,
                            LocalDate.of
                                    (1980+new Random().nextInt(10),
                                            1+new Random().nextInt(10),
                                            1+new Random().nextInt(25)
                                            )));

        }
        //display customers
        for(Customer customer:customers) {
            System.out.println(customer.getCustomerId()+","
                    +customer.getName()+","+customer.getDob().toString());
        }
    }
}
