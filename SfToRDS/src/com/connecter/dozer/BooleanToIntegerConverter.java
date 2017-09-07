package com.connecter.dozer;

import org.dozer.DozerConverter;

public class BooleanToIntegerConverter extends DozerConverter<Boolean, Integer> {

	public BooleanToIntegerConverter(Class<Boolean> prototypeA, Class<Integer> prototypeB) {
		super(prototypeA, prototypeB);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer convertTo(Boolean source, Integer destination) {
		// TODO Auto-generated method stub
		// In real world application, Fetch state code and display value map
		// from cache and convert
		if (source) {
			return 1;
		}
		return 0;
	}

	@Override
	public Boolean convertFrom(Integer source, Boolean destination) {
		// TODO Auto-generated method stub
		if (source == 1) {
			return true;
		}
		return false;
	}

}
