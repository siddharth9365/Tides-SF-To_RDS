package com.connecter.dozer;

import org.dozer.DozerConverter;

public class BooleanToIntegerConverter extends DozerConverter<Boolean, Integer> {

	public BooleanToIntegerConverter(Class<Boolean> prototypeA, Class<Integer> prototypeB) {
		super(prototypeA, prototypeB);
		
	}

	@Override
	public Integer convertTo(Boolean source, Integer destination) {
		
		// In real world application, Fetch state code and display value map
		// from cache and convert
		if (source) {
			return 1;
		}
		return 0;
	}

	@Override
	public Boolean convertFrom(Integer source, Boolean destination) {
		if (source == 1) {
			return true;
		}
		return false;
	}

}
