package test;
//由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息
//当输入的内容为exit退出；
//将输入的学生信息分别封装到一个Student对象中，
//再将每个Student对象加入到一个集合中，
//要求集合中的元素按照年龄大小正序排序；
//最后遍历集合，
//将集合中学生信息写入到记事本，每个学生数据占单独一行。
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;//集合
import java.util.Iterator;//迭代器
public class StudentInformation {
	static class Student implements Comparable{
		String index;String name;int age;
		//学号，姓名，年龄信息
		public Student(String index,String name,int age) {
			this.index=index;
			this.name=name;
			this.age=age;
		}
		public String getName(){
            return this.name;
        }//得到name
		public int compareTo(Object o) {
			if(!(o instanceof Student)) {
				throw new RuntimeException("不是Student对象");
			}
			Student p = (Student) o;
			if(this.age>p.age) {
				return 1;
            }else if(this.age == p.age){
                return this.name.compareTo(p.name);
            }else{
                return -1;
            }			
		}//要求集合中的元素按照年龄大小正序排序,比较
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Set<Student> students=new TreeSet<Student>();
		while(true) {
			String index=input.next();
			if("exit".equals(index)) {
				break;
			}//当输入的内容为exit退出
			String name=input.next();
			int age=input.nextInt();
			Student x=new Student(index,name,age);
			students.add(x);
		}
		Iterator<Student> it = students.iterator();
		//new一个Iterator对象，迭代
        while(it.hasNext()){
            Student student = (Student)it.next();
            System.out.println("name:" + student.getName());
        }

	}

}
