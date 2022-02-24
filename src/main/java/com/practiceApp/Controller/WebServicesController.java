package com.practiceApp.Controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practiceApp.Dao.Dao;


@RestController
public class WebServicesController {
	
	@Autowired
	SessionFactory factory;
	Session session;
   
	List<Customer>  al=new ArrayList<Customer>();
	@RequestMapping("/cname")
		public String saveData(){
		return "data saved";
	}
	
	@RequestMapping("/nilesh")
	public String getname(){
		return "hiii nilesh";
	}
	@RequestMapping("/nilesh3")
	public String getname3(){
		return "hiii nilesh";
	}
	
	@PostMapping("customerData")
	public String savedata(@RequestBody Customer customer){
		  session = factory.openSession();
 	    Transaction tx=session.beginTransaction();
 	    System.out.println(customer.getCname());
 	    System.out.println(customer.getCpin());
 	    session.save(customer);
 	    tx.commit();
		return "data saved";
	}
	@PostMapping("Credited")
	public String creditAmount(@RequestBody Credit credit){
		session = factory.openSession();
 	    Transaction tx=session.beginTransaction();
 	    System.out.println(credit.toString());
 	   session.save(credit);
 	   tx.commit();
		return "Amount added";
	}
	
//	@PostMapping("CustomerTransaction")
//	public String addStudent(@RequestBody com.practiceApp.Dao.Transaction transaction){
//		dao.Adddata(transaction);
//	 return "Data Saved";
//	}
	{
			
	}
//	@PutMapping("Transaction/{Cpin,amount}")
//	public int addMoney(@PathVariable int Cpin, int amount){
//		com.practiceApp.Dao.Transaction transaction = dao.GetData(Cpin);
//		int amo = transaction.getAmount();
//		transaction.setAmount(amo+amount);
//		return transaction.getAmount();
//	}
  
	@GetMapping("getbalanace/{cpin}")
	public int getBankBalance(@PathVariable int cpin){
		session = factory.openSession();
 	    
 	    Credit credit =  (Credit)session.get(Credit.class, cpin);
 	 
 	    int balance = credit.getAmount();
 	    return balance;
	}
	
	@PutMapping("addbalance")
	public String addBalance(@RequestBody BankBalance BB){
		session = factory.openSession();
 	    
	 	Credit credit1 =  (Credit)session.get(Credit.class, BB.getCpin());
	 	int amount = credit1.getAmount() + BB.getAddedmoney();
	 	 Transaction tx=session.beginTransaction();
	 	credit1.setAmount(amount);
	 	session.save(credit1);
	 	tx.commit();
		return "Balance added";
	}
	
	
    
      
}
