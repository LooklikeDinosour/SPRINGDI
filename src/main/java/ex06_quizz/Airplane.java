package ex06_quizz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Airplane {

	//batter2 주입해주세요

	@Autowired
	@Qualifier("bat2")
	private IBattery battery;
	
	Airplane ( ) {}
	
	Airplane(IBattery battery) {
		this.battery = battery;
	}
	
	public IBattery getBattery() {
		return battery;
	}

	public void setBattery(IBattery battery) {
		this.battery = battery;
	}
	
	
}
