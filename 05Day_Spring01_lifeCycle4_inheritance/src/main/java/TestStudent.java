

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Man;
import com.dto.Woman;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("classpath:stu.xml");
		Man m=ctx.getBean("man",Man.class);
		Woman w=ctx.getBean("woman",Woman.class);
		
		System.out.println("남자정보===="+m);
		System.out.println("여자정보===="+w);
		}
		
}
