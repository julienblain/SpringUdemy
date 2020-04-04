package org.studyeasy.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.studyeasy.interfaces.Car;
import org.studyeasy.specs.EngineType;

//bean plus besoin du name
public class Corolla implements Car {

	@Autowired
	@Qualifier("engineType")
	EngineType engineType;
	public String specs() {
		String specs = "Sedan from Toyota with engine type "+ engineType.type();
		return specs;
	}
}
