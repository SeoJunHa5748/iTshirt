package prac;
import java.util.*;
public class DoubleHash {
	static HashMap phonebook = new HashMap();
	public static void main(String[] args) {
	addphoneNo("친구", "이자바", "010-1111-2222");
	addphoneNo("친구", "김자바", "010-2222-3333");
	addphoneNo("친구", "안자바", "010-4444-5555");
	addphoneNo("친구", "오자바", "010-1234-5678");
	addphoneNo("회사", "이대리", "010-6666-7777");
	addphoneNo("회사", "김대리", "010-1233-2425");
	addphoneNo("회사", "오대리", "010-1553-6456");
	addphoneNo("회사", "안대리", "010-7567-8567");
	addphoneNo("회사", "김부장", "010-5345-6456");
	addphoneNo("세탁", "010-7456-8765");
	
	printList();
}//end of main

	static void addphoneNo (String groupName,String name,String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phonebook.get(groupName);
		group.put(tel, name);
		//phonebook.get(groupName);
	}
	static void addGroup(String groupName) {
		if(!phonebook.containsKey(groupName)) {
			phonebook.put(groupName,new HashMap());
		}
			
	}static void addphoneNo(String name,String tel) {
		addphoneNo("기타",name,tel);
	}
	
	static void printList() {
		Set set = phonebook.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			
			Set subset = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subset.iterator();
			
			System.out.println(" * " + e.getKey()+"["+subset.size()+"]");
			while(subIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name+ " " + telNo);
			}
			System.out.println();
		}
		
 
		
	}
}//end of class
