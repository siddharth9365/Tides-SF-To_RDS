package com.connecter.util;

import java.util.HashMap;
import java.util.Map;

public class FormulaDecoding {
	public static Map<String,String> getDecodedField(String formula){
		String relationName = null;
		String fieldName = null;
		if(formula.contains("__r.")){
			relationName = formula.substring(0, formula.indexOf("__r.")+3);
			fieldName = formula.substring(formula.indexOf("__r.")+4,formula.length());
		}else if(formula.contains("__c.")){
			relationName = formula.substring(0, formula.indexOf("__c.")+2);
			relationName+="r";
			fieldName = formula.substring(formula.indexOf("__c.")+4,formula.length());
		}
		Map<String,String> formulaMap = new HashMap<String,String>();
		formulaMap.put("relationName",relationName);
		formulaMap.put("fieldName", fieldName);
		System.out.println(relationName);
		System.out.println(fieldName);
		return formulaMap;
	}
	
	public static void main(String[] args) {
		getDecodedField("call__c.call_Date_Time");
	}
}
