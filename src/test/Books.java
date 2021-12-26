package test;
//使用链表和映射存放多个图书信息，遍历并输出。其中商品属性：编号，名称，单价，出版社；使用商品编号作为映射中的key。
import java.util.ArrayList;//数组线性表类
import java.util.HashMap;//映射
import java.util.List;
import java.util.Set;//集合
import java.util.Scanner;

public class Books {
	 String number;//编号
	 String name;//名称
	 double price;//价格
	 String press;//出版社
	 
	 public Books(String number,String name,double price,String press) {
		 super();
		 this.number=number;
		 this.name=name;
		 this.price=price;
		 this.press=press;
	 }
	 
	
	@Override
	public String toString() {
		return "Books [number="+ number +",name="+name+",price="+price+",press"+press+"]";
	}//重写toString()

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		List<Books> book=new ArrayList<Books>();
		//new一个List对象
		HashMap<String,Books> hm=new HashMap<String,Books>();
		//new一个HashMap对象，以编号作为映射中的key，添加图书对象到hm
		System.out.print("请输入书本数量：");
		int n=input.nextInt();
		for(int i=0;i<n;i++) {
			String number,name,press;
			double price;
			number=input.next();
			name=input.next();
			price=input.nextInt();
			press=input.next();
			//输入编号，名称，价格，出版社
			Books x=new Books(number,name,price,press);
			book.add(x);
			hm.put(number, x);//以编号作为映射中的key，添加图书对象到hm	
		}
		Set<String> k=hm.keySet();//获得所有key
		for(String s:k) {
			System.out.println(hm.get(s));
		}//遍历输出
	}


}
