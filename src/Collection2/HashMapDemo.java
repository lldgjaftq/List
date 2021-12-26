package Collection2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String,Cat> cats=new HashMap<String,Cat>();
		cats.put("Tom", new Cat("Tom",2));
		cats.put("Jack", new Cat("Jack",3));
		cats.put("John", new Cat("John",4));
		
		Cat cat=cats.get("Tom");
		System.out.println(cat.getName());
		System.out.println(cats.containsKey("Jack"));
		System.out.println(cats.containsValue(cat));
		
		// Í¨¹ýIterator±éÀúkey-value
		Iterator iter = cats.entrySet().iterator();
		while(iter.hasNext()) {
		   Map.Entry entry = (Map.Entry)iter.next();
		   System.out.println("next : "+ entry.getKey() +" - "+((Cat)entry.getValue()).getName());
		}

	}
}
