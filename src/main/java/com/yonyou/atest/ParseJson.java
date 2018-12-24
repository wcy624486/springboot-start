package com.yonyou.atest;

import org.junit.Test;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ParseJson {
	
	//@Test
	public  void example() { 
		String json = "{'status':200,'message':'查询成功','data':[{'id':1,'name':'name1','describe':'第一条数据'}]}"; 
		JSONObject data = JSONObject.fromObject(json); 
		int status = data.optInt("status"); 
		JSONArray data1 = data.getJSONArray("data"); 
		if (status==200) { 
		for(int i=0;i<data1.size();i++){ 
		String s = data1.getString(i); 
		System.out.println(s); 
		JSONObject data2 = JSONObject.fromObject(s); 
		System.out.println(data2.getString("id")); 
		System.out.println(data2.getString("name")); 
		System.out.println(data2.getString("describe")); 
		} 
		}else if(status==500) { 
		String msg = data.getString("message"); 
		System.out.println(msg);
		} 
		}
	
	@Test
	public void testJson(){
		
		//{"account":"124554","password":"suudhehdh"}
		
		String json = "{'status':200,'message':'查询成功','data':[{'id':1,'name':'name1','describe':'第一条数据'}]}";
		JSONObject data = JSONObject.fromObject(json);
		System.out.println(data);
		
		JSONArray data1 = data.getJSONArray("data");
		System.out.println(data1);
		
		String s = data1.getString(0);
		System.out.println(s);
		
		JSONObject s2 = JSONObject.fromObject(s);
		System.out.println(s2);
		
		String id = s2.getString("id");
		System.out.println(id);
		/*for (int i = 0; i < data1.size(); i++) {
			String 
		}*/
		
	}

}
