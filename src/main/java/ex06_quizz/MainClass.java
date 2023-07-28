package ex06_quizz;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx  = 
				new GenericXmlApplicationContext("car-battery.xml");
		
//		Battery1 batt1 = ctx.getBean(Battery1.class);
//		Battery2 batt2 = ctx.getBean(Battery2.class);
//		
//		batt2.energy();
//		batt1.energy();
		
		Airplane air = ctx.getBean(Airplane.class);
		air.getBattery().energy();
		
		Car car = ctx.getBean(Car.class);
		car.getBattery().energy();
		
	}
}
