

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("classpath:stu.xml");
		
		Student stu1=ctx.getBean("stu1",Student.class);
		
		System.out.println(stu1);
	
		
		
	}

}
