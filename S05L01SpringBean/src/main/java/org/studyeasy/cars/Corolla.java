package org.studyeasy.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.studyeasy.interfaces.Car;
import org.studyeasy.interfaces.Engine;

//bean plus besoin du name
public class Corolla implements Car {

	//@Autowired(required=false) 
	//permet l'injection de dependance (qui construit l'objet)
	//Engine engine;
	
	/*Si on veut setType Engine alors on est obliger de le faire manuellement ici
	 * 
	 * Engine engine;
	 * 
	 * @Autowired
	 * public void setEngine(Engine engine) {
	 * 		engine.type = "new Version 8";
	 * 		this.engine = engine;
	 * }
	 * 
	 * Sinon on peut mettre autowired a fasle pour que l'injection ne se fasse pas de manière automatique
	 * 
	 * */
	
	//Engine v8; //va injecter V8 qui implement engine 
	@Autowired
	@Qualifier("V6Engine")
	Engine engine;
	public String specs() {
		String specs = "Sedan from Toyota with engine type "+ engine.type();
		return specs;
	}
}
