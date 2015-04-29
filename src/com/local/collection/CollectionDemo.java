package com.local.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;


public class CollectionDemo{
	public static void main(String ...args)
	{
		System.out.println(Character.MIN_VALUE);
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		System.out.println(Double.MIN_VALUE);
		System.out.println(Math.min(Integer.MIN_VALUE, 0.0d));
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Math.min(Long.MIN_VALUE, 0.0d));
		System.out.println(Long.MIN_VALUE);
		System.out.println(Math.min(Character.MIN_VALUE, 0.0d));
		System.out.println(Character.MIN_VALUE);
		System.out.println(Math.min(Short.MIN_VALUE, 0.0d));
		System.out.println(Short.MIN_VALUE);		
		System.out.println(Math.min(Float.MIN_VALUE, 0.0d));
		System.out.println(Float.MIN_VALUE);
		System.out.println(1.0/0.0);
		System.out.println(1.0F/0.0F);
		System.out.println(1/0);
		
		/*List listWithoutType= new ArrayList();
		List<String> listStringType= new ArrayList<String>();
		List<?> listGenericType= new ArrayList<>();
		Set SetWithoutType= new HashSet();
	
		Set<Integer> SetIntType= new HashSet<Integer>();
		Set SetGenericType= new HashSet();
		Set treeSet= new TreeSet();
		
		listWithoutType.add(2833);
		listWithoutType.add("sfadsgads");
		listWithoutType.add(true);
		listWithoutType.add(new CollectionDemo());
		
		
		
		SetIntType.add(89987879);
		SetGenericType.add("sfadsgads");
		SetGenericType.add(true);
		SetGenericType.add(new CollectionDemo());
		SetGenericType.add(null);
		SetGenericType.add(null);
		
		for (Object test:SetGenericType)
			
			
		{
			if (null!=test)
			{
			if(test instanceof Boolean)
				System.out.println("this is boolean"+ (Boolean)test);
			System.out.println(test.toString());
			}else
			{
				System.out.println(test);
			}
		}
		
		for (Object test:listWithoutType)
		{
			if (null!=test)
			System.out.println(test.toString());
			else
				System.out.println(test);
		}
		
		Map<String , Object> attributes= new HashMap<String, Object>();
	   attributes.put("int", 1234);
       attributes.put("string", "shitla");
       attributes.put("boolean",true);
       
       for (Map.Entry<String, Object> entry:attributes.entrySet())
       {
    	   if("int".equals(entry.getKey()))
    	   {
    		   if(entry.getValue() instanceof Integer){
    			   System.out.println(entry.getValue());  
    		   }
    	   }
    	   if("string".equals(entry.getKey()))
    	   {
    		   if(entry.getValue() instanceof String){
    			  System.out.println(entry.getValue()); 
    		   }
    	   }
    	   if("boolean".equals(entry.getKey()))
    	   {
    		   if(entry.getValue() instanceof Boolean){
    			   System.out.println(entry.getValue()+ "Its a boolean value");  
    		   }
    	   }
    	   
    					   
       }
       
		
		*/
		
	}
}