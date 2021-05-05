
import java.time.LocalDate;
import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
	    customerManager.Save(new Customer(1,"Ayþenur","Akýn",LocalDate.of(2000, 10, 10),"12345678987"));	

	}

}
