package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	
    private CustomerCheckService customerService;
	
	public NeroCustomerManager(CustomerCheckService customerService) {
		this.customerService = customerService;
	}
	@Override
	public void Save(Customer customer) {
		if(customerService.checkIfRealPerson(customer)) {
			System.out.println("Saved to db nero: "+customer.getFirtsName());
		} else {
			System.out.println("Not a valid person");
		}
	}
	

}
