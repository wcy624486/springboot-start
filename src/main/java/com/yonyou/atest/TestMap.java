package com.yonyou.atest;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.MapUtils;


@SuppressWarnings("unchecked")
public class TestMap {
	
    public static Map<String, String> audTypeMap = new HashMap<String, String>();
    public static Map<String, String> audNameCodeMap = new HashMap<String, String>();
    
    public static final String YSSJ = "budget";//预算审计
    public static final String XQWJSJ = "bidDoc";//需求文件审计
    public static final String DQHTSJ = "contract";//待签合同审计
    public static final String JSSJ = "settlement";//结算审计
    
    static {
    	audTypeMap.put(YSSJ, "预算审计");
    	audTypeMap.put(XQWJSJ, "需求文件审计");
    	audTypeMap.put(DQHTSJ, "待签合同审计");
    	audTypeMap.put(JSSJ, "结算审计");
    	audNameCodeMap = MapUtils.invertMap(audTypeMap);//反转键值对
    }
    
    
    
    public static void main(String[] args) {
    	System.out.println(audTypeMap);
    	System.out.println(audNameCodeMap);
	}

}
