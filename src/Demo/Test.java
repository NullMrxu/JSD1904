package Demo;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		//java�еķ���
//		List list = new ArrayList();
//		list.add("zhangsan");
//		list.add("Ů");
//		list.add(18);
//		for(int i =0 ;i<list.size();i++) {
//			String name =  (String)list.get(i);
//			System.out.println(name);
//		}
		/*
		 * ������list���͵ļ��ϣ��������м�����2���ַ���
		 * ��������һ��Integer���͵�ֵ������ȫ����ģ�
		 * ��Ϊ��ʱ��list����Ĭ��ΪObject���ͣ���֮��ı���
		 * ����������list�����м�����Integer���ͻ�����������
		 * ���⣬�����׳����쳣����Ϊ�ڱ���׶�������������ʱ
		 * �����java.lang.ClassCastException������ת���쳣����
		 */
		
		
		List <String>list1 = new ArrayList<String>();
		list1.add("zhangsan");
		list1.add("Ů");
		list1.add("18");
		for(int i =0 ;i<list1.size();i++) {
			String name =  list1.get(i);
			System.out.println(name);
		}
		/*���÷���д��֮�����ڹ涨�˸ü��ϵ�����Ϊ��String��,
		 * �������һ��Integer���͵�ֵʱ����ֱ��������Ϊ
		 * ����list<String>������list�����е�ÿһ��Ԫ��ֻ����
		 * String���͵�Ԫ�أ��Ӷ�Ҳ����Ҫ����ǿ������ת������Ϊ
		 * ��ʱlist�����ܹ���סԪ�����͵���Ϣ���������ܹ�ʶ����
		 * ��String���͡�
		 */
		Aoo<String> name = new Aoo<String>("zhangsan");
		Aoo<Integer> age = new Aoo<Integer>(18);
		System.out.println("name:"+name.getData());
		System.out.println("age:"+age.getData());
		/*
		 * ������    bigdata  java�ر�����
		 * �Ƽ���   cloud     java�ر�����
		 * 
		 * �˹�����  AI  C+Python
		 * 
		 * 
		 */
		System.out.println("name:"+name.getClass());
		System.out.println("age:"+age.getClass());
		/*
		 * ��ʹ�÷�����ʱ����Ȼ�����˲�ͬ�ķ���ʵ�Σ�����û��
		 * ���ɲ�ͬ�����ͣ��ڲ�ͬ�ķ���ʵ�εķ�������ֻ��һ����
		 * ������ԭ��������Aoo,�����߼���������ǿ������Ϊ���
		 * ��ͬ�ķ������ͣ�java������һ���ƣ�ֻ�����ڱ����ڼ䣬
		 * �ڱ����ڼ���ڼ�����ȷ�ķ��ͽ���󣬻Ὣ���͵����
		 * ��Ϣ������Ҳ����˵�ɹ�������.class�ļ��в������κ�
		 * ������Ϣ�����Ͳ�����������ڼ䡣
		 * 
		 * �������õ����ط����Ǽ��ϡ���jdk1.5����������ԣ�
		 * �����ṩ�˱���ʱ���Ͱ�ȫ�ļ����ƣ��û����������Ա
		 * �ڱ���ʱ���Լ�⵽�Ƿ������ͣ���ߴ���ı�д��ȫ��Ч�ʡ�
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





