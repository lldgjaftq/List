package Collection2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
	// 新建TreeSet
			 Set<Cat> cats = new TreeSet<Cat>();
			
			 Cat tomcat=new Cat();
	         tomcat.setName("Tom");
	         tomcat.setAge(2);

	         Cat jackcat=new Cat();
	         jackcat.setName("Jack");
	        jackcat.setAge(3);

	        Cat johncat=new Cat();
	          johncat.setName("John");
	          johncat.setAge(4);

			 cats.add(tomcat);
			 cats.add(tomcat);
			 cats.add(jackcat);
			 cats.add(johncat);
			
		  // 使用迭代器访问
		  Iterator<Cat> it = cats.iterator();
		  while(it.hasNext()) {
		    Cat cat = (Cat)it.next();
		    System.out.println(cat.getName());
		  }
	}


}
