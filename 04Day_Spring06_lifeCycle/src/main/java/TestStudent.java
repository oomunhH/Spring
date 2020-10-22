

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test_index_util 시작");
	GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("classpath:stu.xml");
		Student stu1=ctx.getBean("stu1",Student.class);
		System.out.println(stu1.getName());
		ctx.close();

		}
		
}
