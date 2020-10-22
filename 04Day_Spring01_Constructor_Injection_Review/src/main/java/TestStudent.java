

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
	GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("classpath:person.xml");
		Person person1=ctx.getBean("x",Person.class);
		Person person2=ctx.getBean("y",Person.class);
		Person person3=ctx.getBean("xxyy1",Person.class);
		Person person4=ctx.getBean("xxyy2",Person.class);
		Person person5=ctx.getBean("xxyy3",Person.class);
		System.out.println(person1.getInfo());
		System.out.println(person2.getInfo());
		System.out.println(person3.getInfo());
		System.out.println(person4.getInfo());
		System.out.println(person5.getInfo());
		}

}
