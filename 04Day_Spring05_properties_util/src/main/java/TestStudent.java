

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Person;
import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test_index_util 시작");
	GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("classpath:stu.xml");
		Student stu1=ctx.getBean("stu1",Student.class);
		Map<String, Cat> cats=stu1.getCats();
		Set<String> keys=cats.keySet();
		for (String key : keys) {
			System.out.println(cats.get(key));
			System.out.println(cats.get(key).getCatAge());
			System.out.println(cats.get(key).getCatName());
		}
		Properties phones=stu1.getPhones();
		Set<String> xxx=phones.stringPropertyNames();
		for (String x : xxx) {
			System.out.println("key x값은"+x+"value:"+phones.get(x));
		}
		}
		
}
