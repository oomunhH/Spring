

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;


import com.dto.Student;


public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("classpath:stu.xml");
		Student stu=ctx.getBean("xxx",Student.class);
	
		
		System.out.println("남자정보===="+stu);

		}
		
}
