

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Person;
import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test_index_util 시작");
	GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("classpath:echo1.xml","classpath:echo2.xml");
		Person person1=ctx.getBean("person1",Person.class);
		System.out.println(person1);
		}

}
