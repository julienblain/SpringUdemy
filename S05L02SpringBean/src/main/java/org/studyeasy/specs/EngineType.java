package org.studyeasy.specs;

import org.studyeasy.interfaces.Engine;

public class EngineType implements Engine{

	String type;

	public EngineType() {
		type="unknow";
		
	}

	public EngineType(String type) {
		this.type = type;
	}
	
	public String type() {
		return type;
	}
}
