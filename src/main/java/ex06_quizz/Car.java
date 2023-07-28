package ex06_quizz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	//batter1 주입해주세요
	@Autowired
	@Qualifier("bat1")
	private IBattery battery;
	
	Car () {}
	
	@Autowired 
	public Car(IBattery battery) {
		this.battery = battery;
	}
	
	//getter
	public IBattery getBattery() {
		return battery;
	}
	
	
}
