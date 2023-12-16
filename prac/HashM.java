package prac;

import java.util.*;
public class HashM {
public static void main(String[] args) {
	HashMap map = new HashMap();
	map.put("김자바", 100);
	map.put("이자바", 100);
	map.put("강자바", 80);
	map.put("안자바", 90);
	map.put("오자바", 90);
	

//	System.out.println(map.size());
	Set set = map.entrySet();
	

	
	
			Iterator it = set.iterator();
	
	while(it.hasNext()) {
		Map.Entry e = (Map.Entry)it.next();
		System.out.println("이름 : " +e.getKey() +","+ "점수 : "+ e.getValue());
		
		 
	}
	
	

	
	set = map.keySet();
	System.out.println("명단 : " + set);
	
	Collection values  = map.values();

	
	it = values.iterator();
	
	int total = 0 ;
	
	while(it.hasNext()) {
	
	Integer i = (Integer)it.next();
	//int i1 = (Integer)it.next();
	total += i;
	}
	
	System.out.println("총점 : " + total);
	System.out.println("총점 : " + (float)total/set.size());
	System.out.println("최고점수 : " + Collections.max(values));
	System.out.println("최고점수 : " + Collections.min(values));
	
	

}
}