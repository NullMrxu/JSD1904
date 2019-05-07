package Demo;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		//java中的泛型
//		List list = new ArrayList();
//		list.add("zhangsan");
//		list.add("女");
//		list.add(18);
//		for(int i =0 ;i<list.size();i++) {
//			String name =  (String)list.get(i);
//			System.out.println(name);
//		}
		/*
		 * 定义了list类型的集合，先向其中加入了2个字符串
		 * 随后加入了一个Integer类型的值，是完全允许的，
		 * 因为此时的list集合默认为Object类型，在之后的遍历
		 * 中由于忘记list集中中加入了Integer类型或者其他编码
		 * 问题，很容易出现异常，因为在编译阶段正常，而运行时
		 * 会出现java.lang.ClassCastException（类型转换异常）；
		 */
		
		
		List <String>list1 = new ArrayList<String>();
		list1.add("zhangsan");
		list1.add("女");
		list1.add("18");
		for(int i =0 ;i<list1.size();i++) {
			String name =  list1.get(i);
			System.out.println(name);
		}
		/*采用泛型写法之后，由于规定了该集合的类型为（String）,
		 * 再想加入一个Integer类型的值时会出现编译错误，因为
		 * 泛型list<String>限制了list集合中的每一个元素只能是
		 * String类型的元素，从而也不需要进行强制类型转换，因为
		 * 此时list集合能够记住元素类型的信息，编译器能够识别它
		 * 是String类型。
		 */
		Aoo<String> name = new Aoo<String>("zhangsan");
		Aoo<Integer> age = new Aoo<Integer>(18);
		System.out.println("name:"+name.getData());
		System.out.println("age:"+age.getData());
		/*
		 * 大数据    bigdata  java必备语言
		 * 云计算   cloud     java必备语言
		 * 
		 * 人工智能  AI  C+Python
		 * 
		 * 
		 */
		System.out.println("name:"+name.getClass());
		System.out.println("age:"+age.getClass());
		/*
		 * 在使用泛型类时，虽然传入了不同的泛型实参，但并没有
		 * 生成不同的类型，在不同的泛型实参的泛型类中只有一个，
		 * 即还是原来的类型Aoo,但在逻辑表达上我们可以理解为多个
		 * 不同的泛型类型，java泛型这一机制，只作用于编译期间，
		 * 在编译期间对于检验正确的泛型结果后，会将泛型的相关
		 * 信息擦除，也就是说成功编译后的.class文件中不包含任何
		 * 泛型信息，泛型不会进入运行期间。
		 * 
		 * 泛型运用的最多地方就是集合。是jdk1.5引入的新特性，
		 * 泛型提供了编译时类型安全的检测机制，该机制允许程序员
		 * 在编译时可以检测到非法的类型，提高代码的编写安全及效率。
		 */
	}
}
class Aoo<T>{
	private T data;
	public Aoo() {
		
	}
	public Aoo(T data) {
		
	}
	public T getData() {
		return data;
	}
}





