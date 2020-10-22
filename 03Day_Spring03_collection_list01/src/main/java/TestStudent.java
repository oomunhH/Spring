

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("classpath:stu.xml");
		
		Student stu1=ctx.getBean("stu1",Student.class);
		
		System.out.println(stu1);
	
		List<Cat> list=stu1.getListcat();
		for (Cat cat : list) {
			System.out.println(cat);
		}
		
		
	}

}
