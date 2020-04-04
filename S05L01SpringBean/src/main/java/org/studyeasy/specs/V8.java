package org.studyeasy.specs;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Engine;

@Component("V8Engine")
public class V8 implements Engine {

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "V8 engine";
	}

}
