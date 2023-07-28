package ex04;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Mainclass {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("collection-context.xml");
	
	
		Customer customer = ctx.getBean(Customer.class);
		List<String> list = customer.getLists();
		Map<String, Object> m = customer.getMap();
	
		System.out.println(list.toString());
		System.out.println(m.toString());
	}
}
