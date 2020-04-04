package org.studyeasy.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.studyeasy.interfaces.Car;
import org.studyeasy.interfaces.Engine;

public class Swift implements Car {

	
	
	public String specs() {
		String specs = "Sedan from Toyota with engine type ";
		return specs;
	}

}
